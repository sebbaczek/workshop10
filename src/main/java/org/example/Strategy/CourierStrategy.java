package org.example.Strategy;

public class CourierStrategy implements DeliveryStrategy {
        @Override
        public void deliver(final Parcel parcel) {
                System.out.printf("Parcel %s delivered by Courier%n", parcel);
        }
}
