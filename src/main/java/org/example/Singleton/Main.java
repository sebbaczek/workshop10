package org.example.Singleton;


/*
Czasami może wystąpić taka sytuacja żeby w aplikacji istniała tylko jedna instancja danego obiektu.
        Nawet jeżeli będziemy próbowali stworzyć ten obiekt ponownie, zostanie nam zwrócona istniejąca już instancja
• konstruktor takiej klasy powinien być prywatny,
• musimy gdzieś przetrzymywać instancję takiego obiektu, możemy to zrobić w zmiennej private
static w tej samej klasie,
• musimy zapewnić statyczną metodę publiczną, która będzie zwracała nam instancję tej klasy,
• możemy jednocześnie taką klasę zadeklarować jako final żeby nie dało się z niej dziedziczyć
1/ inicjowany w momencie wczytania klasy w Javie (możemy nazwać to eager init, czyli chętną inicjalizacją)
2/ tworzony dopiero gdy tego potrzebujemy (możemy nazwać to lazy init, czyli leniwa inicjalizacja
3/ thread-safe, czyli takim, który jest bezpieczny w środowisku wielowątkowym

*/


public class Main {
        public static void main(String[] args) {
                System.out.println("Hello world!");
        }
}