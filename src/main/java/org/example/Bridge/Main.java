package org.example.Bridge;

/*
Problem jaki jest rozwiązywany tym wzorcem to połączenie ze sobą dwóch abstrakcji, czyli np. klasy
        abstrakcyjnej z interfejsem przy wykorzystaniu kompozycji. Łączenie to odbywa się w taki sposób, aby
        obie te abstrakcje nie widziały szczegółów swojej implementacji.
 klasa abstrakcyjna jest zależna od interfejsu (ma pole będące instancją interfejsu)
• Możemy dowolnie zmieniać hierarchię klasy Shape oraz hierarchię interfejsu Color. Obie te
hierarchie nie będą o tym wiedziały wzajemnie
*/


public class Main {
        public static void main(String[] args) {
        
                Shape shape1 = new Square(new Red());
                System.out.println(shape1);
        }
}