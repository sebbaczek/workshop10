package org.example.Chain_of_Responsibility.lambda;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Main {
        public static void main(String[] args) {
                UnaryOperator<String> textZajavkaHandler = (String input) ->
                                                                   input.replace("zajavka nie jest super", "zajavka jest super!");
                UnaryOperator<String> textBugHandler = (String input) ->
                                                               input.replace("w zadaniu jest błąd", "w zadaniu nie ma błędu");
                UnaryOperator<String> textOpinionHandler = (String input) ->
                                                                   input.replace("mam złą opinię o bootcampie", "bootcamp jest super");
                Function<String, String> pipeline = textZajavkaHandler
                                                            .andThen(textBugHandler)
                                                            .andThen(textOpinionHandler);
                String input = "Wziąłem udział w bootcampie i powiem wam, że zajavka nie jest super. " +
                                       "Zrobiłem zadanie 2 i w zadaniu jest błąd. " +
                                       "Podsumowując, mam złą opinię o bootcampie!";
                String result = pipeline.apply(input);
                System.out.println(result);
        }
}
