package org.example.Visitor.lambda;

import java.math.BigDecimal;
import java.util.List;

//metoda accept() powtarza się w każdej implementacji interfejsu
//ShoppingCartElement. Z racji, że Java 8 pozwoliła nam na definiowanie metod domyślnych w interfejsach,
//spróbujemy to wykorzystać.
//nowa klasa ShoppingCartVisitorMap nie implementuje bezpośrednio
//interfejsu ShoppingCartVisitor, ale korzysta z niego.
public class Main {
        public static void main(String[] args) {
                List<ShoppingCartElement> elements = List.of(
                        new Bicycle(BigDecimal.valueOf(100.25), BigDecimal.TEN),
                        new Bicycle(BigDecimal.valueOf(420.99), BigDecimal.valueOf(10.20)),
                        new Apple(BigDecimal.valueOf(9.80), BigDecimal.valueOf(2.34)),
                        new Apple(BigDecimal.valueOf(9.80), BigDecimal.valueOf(6.12))
                );
                ShoppingCartVisitorMap visitorMap = new ShoppingCartVisitorMap();
                BigDecimal totalCost = elements.stream()
                                               .map(element -> element.accept(visitorMap.apply(element.getClass())))
  .reduce(BigDecimal.ZERO, BigDecimal::add);
                System.out.println("Total shopping cart cost: " + totalCost);
        }
}
