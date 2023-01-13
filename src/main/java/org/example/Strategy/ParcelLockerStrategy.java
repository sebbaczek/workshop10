package org.example.Strategy;

public class ParcelLockerStrategy  implements DeliveryStrategy {
        @Override
        public void deliver(final Parcel parcel) {
                System.out.printf("Parcel %s delivered by ParcelLocker%n", parcel);
        }
}

