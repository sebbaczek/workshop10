package org.example.Proxy;

public class PizzaBakerImpl implements PizzaBaker {
        @Override
        public void bake(String pizza) {
                System.out.println("Baking pizza: " + pizza);
        }
}