package org.example.Prototype.toBuilder;

import lombok.SneakyThrows;

import java.util.ArrayList;
import java.util.List;

public class Main {
@SneakyThrows
public static void main(String[] args) {
        LombokPrototypeCar origin = new LombokPrototypeCar();
        System.out.println("origin: " + origin);
        List<String> newDoors = new ArrayList<>(origin.getDoors());
        newDoors.add("back door");
       
        LombokPrototypeCar cloned = origin.toBuilder()
.doors(newDoors).build();
        
        
        System.out.println("after adding origin: " + origin);
        System.out.println("after adding cloned: " + cloned);
        // sprawdźmy co się teraz stanie
        // Na ekranie zostanie wydrukowane: car == false.
        System.out.println("== " + (origin == cloned));
        System.out.println("equals " + (origin.equals(cloned)));
        // Na ekranie zostanie wydrukowane: steeringWheel == true.
        //Ponownie zostało zrobione shallow copy, widać to analogicznie jak w poprzednim przykładzie.
        System.out.println("steeringWheel == "
                                   + (origin.getSteeringWheel() == cloned.getSteeringWheel()));
        System.out.println("steeringWheel equals "
                                   + (origin.getSteeringWheel().equals(cloned.getSteeringWheel())));
}
        
}
