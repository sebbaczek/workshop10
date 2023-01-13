package org.example.Decorator.lambdaDecor;

import lombok.AllArgsConstructor;

//Klasa ta jednocześnie
//implementuje interface Car oraz korzysta z niego przy wykorzystaniu kompozycji

@AllArgsConstructor
public abstract class CarDecorator implements Car {
        private final Car car;
        @Override
        public String create() {
                return car.create();
        }
}