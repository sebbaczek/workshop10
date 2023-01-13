package org.example.Builder;

/*
Jeżeli mamy klasę, która składa się z bardzo dużej ilości pól i chcemy inicjalizować dużą ilość tych pól
        podczas tworzenia obiektu tej klasy to pojawi się problem, jeżeli za każdym razem będziemy
        potrzebowali inicjować inne pola. Builder służy do tego, aby móc za każdym razem na etapie tworzenia
        obiektu wybrać pola, które mają zostać zainicjowane.
        
        Konstruktory mają też ten problem, że
jeżeli będziemy przekazywali 10 argumentów typu String to bardzo łatwo można się pomylić, który
argument powinien być na którym miejscu
Settery zmieniają stan po faktycznym utworzeniu obiektu.
---
utworzymy statyczną klasę zagnieżdżoną, która będzie miała w nazwie Builder
skopiujemy do tej klasy wszystkie pola
klasa CarBuilder powinna mieć publiczny konstruktor, który ustawia wartości wszystkich pól
klasa CarBuilder powinna mieć zdefiniowane metody, które ustawią wartości konkretnych parametrów, a następnie zwrócą instancję klasy CarBuilder
w klasie Car definiujemy prywatny konstruktor, który jako argument przyjmuje klasę CarBuilder, a
następnie inicjuje pola na podstawie wartości pól z klasy CarBuilder
w Klasie CarBuilder definiujemy metodę build(), która wywoła konstruktor prywatny z klasy Car
*/
//pamiętać o adnotacji @Builder, która przychodzi razem z Lombok. Dzięki niej nie musimy pisać tego wzorca sami



public class Main {
        public static void main(String[] args) {
                
                Car emptyCar = Car.builder().build();
                Car anotherCar = Car.builder()
                                         .brand("Ford")
                                         .model("Mustang")
                                         .towbar("someTowbar")
                                         .year(1969)
                                         .build();
                
        }
}