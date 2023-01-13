package org.example.Visitor.lambda;

import java.math.BigDecimal;
import java.util.Map;
import java.util.function.Function;

// Rewolucja polega na tym, że w klasie ShoppingCartVisitorMap nie implementujemy teraz interfejsu
//ShoppingCartVisitor, tylko Function. Funkcja jako parametr wejściowy definiuje klasę, która korzysta
//z upper-bound wildcard aby określić, że klasy mają implementować ShoppingCartElement.
//Parametrem wyjściowym z Function, jest implementacja ShoppingCartVisitor, dlatego Function
//określa ten interface jako typ generyczny.

// W środku klasy ShoppingCartVisitorMap definiujemy mapę, która jako klucz ma konkretną wartość
//klasy - Apple.class lub Bicycle.class, natomiast jako wartość definiuje implementację interfejsu
//funkcyjnego ShoppingCartVisitor - bo ShoppingCartVisitor jest interfejsem funkcyjnym. Czyli Mapa
//wygląda w ten sposób - klasa:implementacja.

// Przez to, że klasa ShoppingCartVisitorMap implementuje interface Function, musimy zdefiniować
//metodę apply(), która na podstawie mapy VISITORS zwróci konkretną implementację interfejsu
//funkcyjnego ShoppingCartVisitor

public class ShoppingCartVisitorMap
        implements Function<Class<? extends ShoppingCartElement>, ShoppingCartVisitor> {
        private static final Map<Class<? extends ShoppingCartElement>, ? extends ShoppingCartVisitor>
                VISITORS = Map.of(
                Apple.class, element -> visit((Apple) element),
                Bicycle.class, element -> visit((Bicycle) element)
        );
        public static BigDecimal visit(final Apple apple) {
                BigDecimal totalCost = apple.getWeight().multiply(apple.getPricePerKg());
                System.out.println("Calculated Apple cost: " + totalCost);
                return totalCost;
        }
        public static BigDecimal visit(final Bicycle bicycle) {
                BigDecimal totalCost = bicycle.getPrice().subtract(bicycle.getDiscount());  System.out.println("Calculated Bicycle cost: " + totalCost);
                return totalCost;
        }
        @Override
        public ShoppingCartVisitor apply(final Class<? extends ShoppingCartElement> aClass) {
                return VISITORS.get(aClass);
        }
}
