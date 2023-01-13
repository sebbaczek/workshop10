package org.example.Decorator.lambdaDecor;

// przykład pokazuje, że nie ma konieczności definiowania klas takich jak np. NeonDecorator,
//SpoilerDecorator, RimsDecorator. Możemy zastąpić implementacje tych klas przy pomocy lambdy.
//każda z tych klas w swojej hierarchii dziedziczenia implementuje interface
//funkcyjny jakim jest Car.

public class Main {
        public static void main(String[] args) {
                
                CarImpl originalCar = new CarImpl();
                Car car1 = () -> "Before car! " + originalCar.create() + " with Spoiler";
                System.out.println(car1.create());
                Car car2 = () -> "Before car! " + originalCar.create() + " with Rims" + " with Spoiler";
                System.out.println(car2.create());
                Car car3 = () -> "Before car! " + originalCar.create() + " with Rims with Spoiler with Neon";
                System.out.println(car3.create());
        
        }
}
