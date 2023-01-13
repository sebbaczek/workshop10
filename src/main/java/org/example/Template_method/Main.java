package org.example.Template_method;

/*Wzorzec Template method jest używany gdy chcemy określić jedno miejsce w kodzie, które w
        abstrakcyjny sposób określi kroki naszego algorytmu, natomiast konkretna implementacja tych kroków
        zostanie oddelegowana do konkretnych klas implementujących. Jednocześnie możemy zapewnić
        domyślną implementację takich kroków, która może być nadpisana w klasach implementujących
        konkretne kroki.
        budowa domu składa się z
abstrakcyjnych kroków, którym należy zapewnić konkretną implementację
Rozwiązanie będzie polegało na stworzeniu klasy abstrakcyjnej, która określa kolejne kroki
Metodę, która określa schemat wykonania kolejnych metod możemy napisać jako final aby zablokować możliwość jej
nadpisania przez klasy dziedziczące
Dzięki wykorzystaniu polimorfizmu możemy wykorzystać klasę HouseTemplate jako referencję,
natomiast podstawić pod te referencje konkretne implementacje w postaci klas BrickHouse
        */


public class Main {
        public static void main(String[] args) {
        
                HouseTemplate house1 = new BrickHouse();
                house1.build();
        
        }
}