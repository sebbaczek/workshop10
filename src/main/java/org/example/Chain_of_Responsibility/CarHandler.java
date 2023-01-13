package org.example.Chain_of_Responsibility;

public interface CarHandler {
        void setNextHandler(CarHandler nextHandler);
        void handle(Car car);
}