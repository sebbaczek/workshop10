package org.example.Visitor;

/*Visitor jest wzorcem, który jest stosowany w przypadku, gdy mamy wywołać jakąś operację na grupie
        podobnych do siebie obiektów. Zamiast definiować bardzo podobne zachowanie dla każdego ze
        wspomnianych obiektów, możemy przenieść podobną grupę zachowań w jedno miejsce. Innymi słowy,
        wyciągamy logikę, która nas interesuje, z obiektu na zewnątrz
        • Należy jednak zwracać uwagę na to, że wszystkie metody klasy Visitor powinny zwracać ten sam
typ (np. interface). W momencie gdy zaczniemy tutaj coś mieszać wprowadzi nam to chaos w kodzie.
Często typem zwracanym tych metod jest po prostu void.
• Wszędzie duplikujemy implementację metody accept().
        */


import java.math.BigDecimal;
import java.util.List;

public class Main {
        public static void main(String[] args) {
                List<ShoppingCartElement> elements = List.of(
                        new Bicycle(BigDecimal.valueOf(100.25), BigDecimal.TEN),
                        new Bicycle(BigDecimal.valueOf(420.99), BigDecimal.valueOf(10.20)),
                        new Apple(BigDecimal.valueOf(9.80), BigDecimal.valueOf(2.34)),
                        new Apple(BigDecimal.valueOf(9.80), BigDecimal.valueOf(6.12))
                );  ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
                BigDecimal totalCost = elements.stream()
                                               .map(element -> element.accept(visitor))
                                               .reduce(BigDecimal.ZERO, BigDecimal::add);
                System.out.println("Total shopping cart cost: " + totalCost);
        
        
        }
}