package org.example.Factory;

/*zamiast switch zastosujemy np. Map<String, Supplier<Pizza>>, gdzie kluczem jest nazwa pizzy podana jako String, a wartością implementacja interfejsu funkcyjnego Supplier, która dostarczy nam gotowy obiekt konkretnej pizzy*/





public class PizzaFactory {
        public static Pizza preparePizza(final String whatPizza) {
                switch (whatPizza) {
                        case "Pepperoni":
                                return new PepperoniPizza();
//                        case "Hawaiian":
//                                return new HawaiianPizza();
                        default:
                                throw new RuntimeException("I'm sorry, there is only Pepperoni or Hawaiian!");
                }
        }
}
