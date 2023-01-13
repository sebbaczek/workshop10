package org.example.Builder;

public class Car {
        private final String brand;
        private final String model;
        private final Integer year;
        private final String towbar;
        private final String sunRoof;
        private final String skiRack;
        
      //  w klasie Car definiujemy prywatny konstruktor, który jako argument przyjmuje klasę CarBuilder, a
        // następnie inicjuje pola na podstawie wartości pól z klasy CarBuilder.

        private Car(final CarBuilder carBuilder) {
                this.brand = carBuilder.brand;
                this.model = carBuilder.model;
                this.year = carBuilder.year;
                this.towbar = carBuilder.towbar;
                this.sunRoof = carBuilder.sunRoof;
                this.skiRack = carBuilder.skiRack;
                
        }
        // klasa CarBuilder powinna mieć publiczny konstruktor, który ustawia wartości wszystkich pól w
        //klasie CarBuilder
        // gettery
        public static CarBuilder builder() {
                return new CarBuilder();
                
        }
        
        //klasa inner
        public static class CarBuilder {
                private String brand;
                private String model;
                private Integer year;
                private String towbar;
                private String sunRoof;
                private String skiRack;
                
                
                // klasa CarBuilder powinna mieć zdefiniowane metody, które ustawią wartości konkretnych
                //parametrów, a następnie zwrócą instancję klasy CarBuilder.
                
                public CarBuilder brand(final String brand) {
                        this.brand = brand;
                        return this;
                        
                }
                
                public CarBuilder model(final String model) {
                        this.model = model;
                        return this;
                        
                }
                
                public CarBuilder year(final Integer year) {
                        this.year = year;
                        return this;
                        
                }
                
                public CarBuilder towbar(final String towbar) {
                        this.towbar = towbar;
                        return this;
                        
                }
                
                public CarBuilder sunRoof(final String sunRoof) {
                        this.sunRoof = sunRoof;
                        return this;
                        
                }
                
                public CarBuilder skiRack(final String skiRack) {
                        this.skiRack = skiRack;
                        return this;
                }
        
                //w Klasie CarBuilder definiujemy metodę build(), która wywoła konstruktor prywatny z klasy Car
                public Car build() {
                        return new Car(this);
                }
        }
}
