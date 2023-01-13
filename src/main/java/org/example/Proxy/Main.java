package org.example.Proxy;

/*
Wzorzec ten będzie nam potrzebny jeżeli będziemy zastanawiać się nad zapewnieniem kontrolowanego
        dostępu do jakiegoś zasobu. Czyli np. mamy fragment kodu, który może zostać wykonany pod
        warunkiem, że użytkownik, który go wykonuje ma odpowiednie uprawnienia.
 obiekt Proxy, który implementuje interesujący nas interface i jednocześnie
jest on od niego zależny przy wykorzystaniu kompozycji.
*/


public class Main {
        public static void main(String[] args) {
                PizzaBaker executor = new PizzaBakerProxy(new PizzaBakerImpl());
                try {
                        executor.bake("Pepperoni");
                        executor.bake("Hawaiian");
                        executor.bake("Margeritta");
                } catch (Exception e) {
                        System.err.printf("Exception: %s", e.getMessage());
                }
        }
}