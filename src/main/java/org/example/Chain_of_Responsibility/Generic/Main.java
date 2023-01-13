package org.example.Chain_of_Responsibility.Generic;

public class Main {
        public static void main(String[] args) {
                //GenericHandler<String> handler1 = new TextZajavkaHandler();
                GenericHandler<String> handler1 = new TextBugHandler();
                GenericHandler<String> handler2 = new TextBugHandler();
                GenericHandler<String> handler3 = new TextOpinionHandler();
                handler1.setNextHandler(handler2);
                handler2.setNextHandler(handler3);
                String result = handler1.handle(
                        "Wziąłem udział w bootcampie i powiem wam, że zajavka nie jest super. " +
                                "Zrobiłem zadanie 2 i w zadaniu jest błąd. " +
                                "Podsumowując, mam złą opinię o bootcampie!");
                System.out.println(result);
        }
        
}
