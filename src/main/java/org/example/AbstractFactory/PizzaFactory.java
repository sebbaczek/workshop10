package org.example.AbstractFactory;

public class PizzaFactory implements AbstractFactory<Pizza> {
        @Override
        public Pizza create(final String type) {
                switch (type) {
                        case "Pepperoni":
                                return new PepperoniPizza();
//                        case "Hawaiian":
//                                return new HawaiianPizza();
                        default:
                                throw new RuntimeException("I'm sorry, there is only Pepperoni or Hawaiian!");
                }
        }
}