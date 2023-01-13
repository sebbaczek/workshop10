package org.example.Decorator;

public class NeonDecorator extends CarDecorator {
        
        //konstruktor
        public NeonDecorator(Car car) {
                super(car);
        }
        @Override
        public String create() {
                // możemy również dodać tutaj wywołanie przed metodą super.create()
                String created = super.create();
                // możemy również dodać tutaj wywołanie po metodzie super.create()
                return created + withNeon();
        }
        private String withNeon() {
                return " with " + this.getClass().getSimpleName();
        }
}