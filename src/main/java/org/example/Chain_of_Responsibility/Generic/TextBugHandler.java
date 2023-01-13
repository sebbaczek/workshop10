package org.example.Chain_of_Responsibility.Generic;

public class TextBugHandler extends GenericHandler<String>{
        @Override
        protected String handleInput(final String input) {
                return input.replace("w zadaniu jest błąd", "w zadaniu nie ma błędu");
        }
}
