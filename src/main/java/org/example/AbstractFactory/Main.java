package org.example.AbstractFactory;

/*
W przypadku zwykłej fabryki, mieliśmy jedną klasę, w której metoda zwracała subklasę bazując na
        parametrze będącym argumentem metody. Fabrykę abstrakcyjną zastosujemy natomiast gdy będziemy
        chcieli uzyskać metodę, która zwróci nam rodzinę zależnych obiektów bez określana jakie konkretnie
        obiekty to są. Mówiąc rodzina obiektów można rozumieć to jako konkretną fabrykę danego typu
        obiektu, która może taki obiekt wyprodukować.
        stosując to podejście, możemy w trakcie działania programu zdecydować jaką fabrykę utworzymy -w trakcie działania programu,
bez ingerencji w istniejące fabryki możemy dodać logikę odpowiedzialną za tworzenie innej rodziny obiektów,
*/


public class Main {
        public static void main(String[] args)
        {
                Object o = FactoryProvider.getFactory("Pizza").create("Pepperoni");
                Object o2 = LambdaFactoryProvider.getFactory("Pizza").create("Pepperoni");
                System.out.println(o);
                System.out.println(o2);
        
        }
}