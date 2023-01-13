package org.example.Strategy.lambda;
//Zamiast definiować klasy
//takie jak CourierStrategy, ParcelLockerStrategy czy PostStrategy możemy zastąpić implementacje tych
//klas lambdą. nie
//musimy zawsze wykorzystywać interfejsu funkcyjnego Consumer. Możemy tutaj wykorzystać różne
//interfejsy funkcyjne w zależności od naszych potrzeb.
public class Main {  public static void main(String[] args) {
        OnlineShop onlineShop = new OnlineShop();
        onlineShop.addParcel(new Parcel("skarpetki"));
        onlineShop.addParcel(new Parcel("monitory"));
        onlineShop.addParcel(new Parcel("samochody"));
        System.out.println("\n##CourierStrategy##");
        onlineShop.deliver(parcel -> System.out.printf("Parcel %s delivered by Courier%n", parcel));
        System.out.println("\n##PostStrategy##");
        onlineShop.deliver(parcel -> System.out.printf("Parcel %s delivered by Post%n", parcel));
        System.out.println("\n##ParcelLockerStrategy##");
        onlineShop.deliver(parcel -> System.out.printf("Parcel %s delivered by ParcelLocker%n", parcel));
}}
