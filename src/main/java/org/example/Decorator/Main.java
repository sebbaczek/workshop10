package org.example.Decorator;

/*
Dekorator może nam się przydać gdy będziemy korzystać z jakiejś biblioteki, która będzie nam
        dostarczała obiekty i będziemy potrzebowali taki obiekt zmodyfikować. Zmodyfikować, czyli dodać do
        niego w naszym kodzie jakieś pola albo metody, a jednocześnie nie chcemy modyfikować samego kodu
        źródłowego takiego obiektu.
   Decorator może być alternatywą dla dziedziczenia. W przypadku dziedziczenia
cechy są współdzielone przez wszystkie stworzone obiekty. Tutaj natomiast możemy to zrobić
selektywnie. Różnica jest też taka, że dziedziczenie dodaje swoje zachowania na etapie kompilacji kodu
źródłowego. Pokazane podejście dodaje natomiast zachowania w trakcie działania programu (w
runtime).

*/


public class Main {
        public static void main(String[] args) {
        
                Car car1 = new NeonDecorator(new CarImpl());
                System.out.println(car1.create());
                //Car car3 = new SpoilerDecorator(new NeonDecorator(new RimsDecorator(new CarImpl())));
                //  System.out.println(car3.create());
        }
}