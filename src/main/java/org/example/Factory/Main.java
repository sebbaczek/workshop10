package org.example.Factory;

/*
Wzorzec projektowy Fabryka jest stosowany gdy potrzebujemy w elegancki sposób utworzyć instancję
        klasy, w sytuacji gdy mamy klasę bazową oraz kilka klas dziedziczących z niej. Na podstawie
        przekazanego parametru musimy stworzyć instancję jednej z klas dziedziczących z rodzica.
        stworzyć metodę, której typem zwracanym będzie klasa bazowa albo interfejs. W
ciele tej metody, w zależności od przekazanego do niej argumentu wybieramy instancję obiektu
dziedziczącego z klasy bazowej, który ma zostać utworzony
operujemy na interfejsach; klient (czyli klasa, która faktycznie używa fabryki) jest nieświadoma implementacji pod
spodem, nie
interesuje jej w zasadzie co się tam dzieje, ona chce tylko pizzę

*/


public class Main {
        public static void main(String[] args) {
                Pizza pepperoni = PizzaFactory.preparePizza("Pepperoni");
                Pizza pepperoni2 = LambdaPizzaFactory.preparePizza("Pepperoni");
        }
}