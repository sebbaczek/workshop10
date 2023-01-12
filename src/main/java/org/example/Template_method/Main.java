package org.example.Template_method;

/*Wzorzec Template method jest używany gdy chcemy określić jedno miejsce w kodzie, które w
        abstrakcyjny sposób określi kroki naszego algorytmu, natomiast konkretna implementacja tych kroków
        zostanie oddelegowana do konkretnych klas implementujących. Jednocześnie możemy zapewnić
        domyślną implementację takich kroków, która może być nadpisana w klasach implementujących
        konkretne kroki.*/


public class Main {
        public static void main(String[] args) {
                System.out.println("Hello world!");
        }
}