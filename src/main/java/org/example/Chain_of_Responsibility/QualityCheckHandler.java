package org.example.Chain_of_Responsibility;

public class QualityCheckHandler implements CarHandler {
        private CarHandler carHandler;
        @Override
        public void setNextHandler(final CarHandler nextHandler) {
                this.carHandler = nextHandler;
        }
        @Override
        public void handle(final Car car) {
                System.out.println("Checking quality!\n");
        }
}