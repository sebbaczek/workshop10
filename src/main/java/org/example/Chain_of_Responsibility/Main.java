package org.example.Chain_of_Responsibility;

/*
Wzorzec ten pozwala nam na zaprojektowanie łańcucha obiektów, które będą służyły do przetworzenia
        jakiegoś fragmentu logiki. Logika taka może być wtedy podzielona na kolejne kroki w łańcuchu
        przetwarzania. Każdy obiekt będący ogniwem takiego łańcucha może wtedy zdecydować czy
        kontynuować wykonywanie logiki, czy przerwać w danym momencie, ze względu na niespełnienie
        pewnych warunków.
        interface CarHandler, który będzie implementowany przez każde
konkretne ogniwo w łańcuchu. Interface taki powinien określać metodę która pozwala na zdefiniowanie
następnego ogniwa w łańcuchu - setNextHandler() oraz metodę, która definiuje faktyczną logikę w
danym handlerze - handle()
*/


import java.util.List;

public class Main {

                private final CarHandler handler;
  public Main() {
                        this.handler = new CabrioletHandler();
          CarHandler handler2 = new CabrioletHandler();
//                        CarHandler handler2 = new JeepHandler();
                        CarHandler handler3 = new ColorHandler();
                        CarHandler handler4 = new EquipmentHandler();
                        CarHandler handler5 = new QualityCheckHandler();
                        handler.setNextHandler(handler2);
                        handler2.setNextHandler(handler3);
                        handler3.setNextHandler(handler4);
                        handler4.setNextHandler(handler5);
                }
                public static void main(String[] args) {
                        Main chainRunner = new Main();
                        chainRunner.handler.handle(Car.of(Car.Type.CABRIOLET, "Blue", List.of("Steering wheel")));
                        chainRunner.handler.handle(Car.of(Car.Type.JEEP, "Black", List.of("Wheels")));
                }
        }


