package org.example.Prototype;

/*
Prototype jest stosowany gdy potrzebujemy stworzyć obiekt, którego stworzenie jest kosztowne w
        rozumieniu czasu i zasobów. Jednocześnie możemy skorzystać z tego, że podobny obiekt już istnieje
W przypadku tego wzorca, prototyp jest źródłem, z którego
powstaje kopia
Kod, który będzie wykonywał kopiowanie umieszczamy w klasie, która ma być kopiowana.
Wzorzec ten może zostać zaimplementowany przy wykorzystaniu interfejsu Cloneable i metody clone()
Płytka kopia nastąpi wtedy, gdy utworzymy nowy obiekt, ale będziemy wskazywać na te same
referencje, na który wskazywał obiekt źródło. Kopia głęboka wystąpi natomiast wtedy gdy
zarezerwujemy nowe miejsce w pamięci dla każdego pola zagnieżdżonego
*/


public class Main {
        public static void main(String[] args) {
        
                CopyCar car = new CopyCar();
                SteeringWheel steeringWheel = new SteeringWheel();
                steeringWheel.setDiameter(21.5);
                car.setSteeringWheel(steeringWheel);
               
                CopyCar shallowCopied = car.shallowCopy();
                CopyCar deepCopied = car.deepCopy();
                
                // Zostanie wydrukowane: shallowCopied == true, ponieważ płytka kopia wskazuje na to samo miejsce w pamięci
                System.out.println("shallowCopied == "
                                           + (car.steeringWheel == shallowCopied.steeringWheel));
                //Zostanie wydrukowane: shallowCopied equals true, ponieważ metoda equals() została
                //zaimplementowana dzięki adnotacji @Data, a wartości porównywane są takie same
                System.out.println("shallowCopied equals "
                                           + (car.steeringWheel.equals(shallowCopied.steeringWheel)));
                //Zostanie wydrukowane: deepCopied == false, ponieważ głęboka kopia wskazuje na inne miejsce w pamięci
                System.out.println("deepCopied == "
                                           + (car.steeringWheel == deepCopied.steeringWheel));
                // Zostanie wydrukowane: deepCopied equals true, ponieważ metoda equals() została
                //zaimplementowana dzięki adnotacji @Data, a wartości porównywane są takie same.
                System.out.println("deepCopied equals "
                                           + (car.steeringWheel.equals(deepCopied.steeringWheel)));
        }
}