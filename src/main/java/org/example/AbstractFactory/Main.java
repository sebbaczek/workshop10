package org.example.AbstractFactory;

/*
W przypadku zwykłej fabryki, mieliśmy jedną klasę, w której metoda zwracała subklasę bazując na
        parametrze będącym argumentem metody. Fabrykę abstrakcyjną zastosujemy natomiast gdy będziemy
        chcieli uzyskać metodę, która zwróci nam rodzinę zależnych obiektów bez określana jakie konkretnie
        obiekty to są. Mówiąc rodzina obiektów można rozumieć to jako konkretną fabrykę danego typu
        obiektu, która może taki obiekt wyprodukować.
*/


public class Main {
        public static void main(String[] args) {
                System.out.println("Hello world!");
        }
}