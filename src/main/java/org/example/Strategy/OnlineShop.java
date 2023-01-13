package org.example.Strategy;

import java.util.ArrayList;
import java.util.List;

public class OnlineShop {
        private List<Parcel> parcels = new ArrayList<>();
        public void addParcel(Parcel parcel) {
                parcels.add(parcel);
        }
        public void deliver(DeliveryStrategy deliveryStrategy) {
                parcels.forEach(deliveryStrategy::deliver);
        }
}
