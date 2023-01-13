package org.example.Prototype.lombok_with;

import lombok.SneakyThrows;

import java.util.ArrayList;
import java.util.List;
// Jeżeli chcielibyśmy wykorzystać wzorzec
//prototype dla obiektu, który posiada tylko pola prymitywne, albo pola są klasami immutable (czyli i tak
//stan obiektów tych klas nigdy nie będzie ulegał zmianie) to spokojnie możemy robić shallow copy i
//wykorzystywać w tym celu adnotację @With. Jeżeli natomiast będzie zależało nam na zrobieniu deep
//copy, czyli żeby obiekty zdefiniowane jako pola również były tworzone na nowo i zajmowały nowe
//miejsce w pamięci, to musielibyśmy zastosować inną implementację i nie możemy wtedy polegać na
//@With.


public class Main {
        @SneakyThrows
        public static void main(String[] args) {
                LombokPrototypeCar origin = new LombokPrototypeCar();
                System.out.println("origin before: " + origin);
                List<String> newDoors = new ArrayList<>(origin.getDoors());
                newDoors.add("back door");
                LombokPrototypeCar cloned = origin.withDoors(newDoors);
                
                System.out.println("origin after: " + origin);
                System.out.println("arigin cloned: " + cloned);
                // sprawdźmy co się teraz stanie
               // Na ekranie zostanie wydrukowane: car == false. Dostajemy nowy obiekt LombokPrototypeCar
                System.out.println("car == " + (origin == cloned));
                
                // Na ekranie zostanie wydrukowane: car equals false.
                System.out.println("car equals " + (origin.equals(cloned)));
                
                // Na ekranie zostanie wydrukowane: steeringWheel == true. Obiekt LombokSteeringWheel nadal jest tym samym obiektem
                System.out.println("steeringWheel == "
                                           + (origin.getSteeringWheel() == cloned.getSteeringWheel()));
                
                
                // Na ekranie zostanie wydrukowane: steeringWheel equals true.
                System.out.println("steeringWheel equals "
                                           + (origin.getSteeringWheel().equals(cloned.getSteeringWheel())));
        }
}
                 

