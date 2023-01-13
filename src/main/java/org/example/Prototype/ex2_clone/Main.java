package org.example.Prototype.ex2_clone;

import lombok.SneakyThrows;
//Podejście to jest bardzo przydatne gdy chcemy zapisywać historię aktualizacji obiektu. Tworzymy
//wtedy kopię istniejącego już obiektu i zmieniamy tylko te wartości, które zostały zaktualizowane
//Stosujemy zasadę DRY, czyli pozbywamy się zduplikowanego kodu, który mógłby służyć do


public class Main {
        @SneakyThrows
        public static void main(String[] args) {
                PrototypeCar prototypeCar = new PrototypeCar();
                System.out.println("original: " + prototypeCar);
        
                //tworzenia różnych wariantów tego samego obiektu
                PrototypeCar cloned = prototypeCar.clone();
               
                System.out.println("cloned: " + cloned);
                System.out.println(prototypeCar.getSteeringWheel() == cloned.getSteeringWheel());
                System.out.println(prototypeCar.getBrand() == cloned.getBrand());
                
                // porównanie Stringów zwróci true ze względu na String pool.
                System.out.println(prototypeCar.getModel() == cloned.getModel());
                System.out.println(prototypeCar.getDoors() == cloned.getDoors());
                
                System.out.println("before adding: " + cloned);
                cloned.getDoors().add("back door");
                System.out.println("after adding proto: " + prototypeCar);
                System.out.println("after adding cloned: " + cloned);
        
//                W powyższym przykładzie wykonaliśmy deep copy obiektu klasy PrototypeCar i dodaliśmy do obiektu cloned tylne drzwi. Jeżeli uruchomisz ten kod to zobaczysz, że nowe drzwi zostały dodane tylko do klona, oryginalny obiekt pozostał taki jaki był
        
        }
}










