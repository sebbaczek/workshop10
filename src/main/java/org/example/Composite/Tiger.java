package org.example.Composite;

public class Tiger implements Animal {
        @Override
        public void eat(final Food food) {
                System.out.println("Tiger eating food: " + food);
        }
}
