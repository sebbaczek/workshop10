package org.example.Strategy;

/*
Strategia rozwiązuje problem wyboru algorytmu, który ma być wykorzystany w programie przez
        klienta. Czyli, Ty jako klient danej metody chcesz zdecydować jaki algorytm ma zostać wykorzystany w
        jej środku. Skoro opisujemy to w ten sposób, to możesz zauważyć, że sytuacja taka będzie potrzebna
        jeżeli takich algorytmów będziemy mieli dostępnych kilka.
        Czasami można znaleźć w internecie inną
nazwę tego wzorca - Policy Pattern.
        
Metoda deliver(), w klasie OnlineShop przyjmuje interface DeliveryStrategy. Dzięki zastosowaniu
takiego podejścia możemy przy wywołaniu tej metody zapewnić konkretną implementację interfejsu
DeliveryStrategy, czyli wybrać strategię dostarczenia paczki.
*/



public class Main {
        public static void main(String[] args) {
                OnlineShop onlineShop = new OnlineShop();
                onlineShop.addParcel(new Parcel("skarpetki"));
                onlineShop.addParcel(new Parcel("monitory"));
                onlineShop.addParcel(new Parcel("samochody"));
                System.out.println("\n##CourierStrategy##");
                onlineShop.deliver(new CourierStrategy());
                System.out.println("\n##PostStrategy##");
                onlineShop.deliver(new PostStrategy());
                System.out.println("\n##ParcelLockerStrategy##");
                onlineShop.deliver(new ParcelLockerStrategy());
        
        }
}