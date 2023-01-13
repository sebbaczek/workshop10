package org.example.Strategy.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class OnlineShop {  private List<Parcel> parcels = new ArrayList<>();
        public void addParcel(Parcel parcel) {
                parcels.add(parcel);
        }
        public void deliver(Consumer<Parcel> deliveryStrategy) {
                parcels.forEach(deliveryStrategy);
        }
}
