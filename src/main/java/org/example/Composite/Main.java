package org.example.Composite;

/*
Jeżeli mamy rodzinę obiektów, które mają być potraktowane w naszym kodzie dokładnie w ten sam
        sposób - zastosujemy wzorzec Composite (kompozyt).
  • Base component - Komponent bazowy - będzie to interfejs, który będzie reprezentował każde zwierzątko w ZOO
  • Leaf - liść - obiekty, które zdefiniują zachowania poszczególnych zwierzątek.
  • Composite - kompozyt - czyli klasa, która będzie zawierała w sobie kolekcję liści - Klasa ZOO przechowuje
  wszystkie zwierzęta i implementuje int. Animal
   klasy Monkey, Elephant oraz Tiger są Liśćmi
   Poszczególne klasy liście, czyli np. Monkey, Elephant oraz Tiger nie wiedzą, że są elementem kompozytu, więc
   możemy w nich nadal dodawać logikę specyficzną dla tylko tej jednej danej klasy
   - klasa ZOO implementuje interfejs Animal, klasa ZOO posiada metodę zaimplementowaną oraz swoje własne metody
*/


public class Main {
        public static void main(String[] args) {
                ZOO zoo = new ZOO();
                   zoo.add(new Tiger());
        
        }
}