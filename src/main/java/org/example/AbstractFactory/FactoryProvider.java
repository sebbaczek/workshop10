package org.example.AbstractFactory;

//Klasa FactoryProvider, w metodzie getFactory() przyjmuje jako argument informację o tym jaka fabryka
//ma zostać zwrócona. Metoda getFactory() jak sama nazwa wskazuje - zwraca fabrykę
//stosowany unbounded wildcard, który powoduje, że w przykładzie poniżej musimy
//przypisać wynik wywołania FactoryProvider do klasy Object. Możemy oczywiście pokusić się w tym
//miejscu o rzutowanie

public class FactoryProvider {
        public static AbstractFactory<?> getFactory(String whatFactory) {
                switch (whatFactory) {
                        case "Pizza":
                                return new PizzaFactory();
 //                       case "Car":
//                                return new CarFactory();
                        default:
                                throw new RuntimeException("I'm sorry, we only produce pizzas or cars!");
                }
        }
}
