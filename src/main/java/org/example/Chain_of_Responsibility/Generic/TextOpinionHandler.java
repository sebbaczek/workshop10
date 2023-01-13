package org.example.Chain_of_Responsibility.Generic;

public class TextOpinionHandler extends GenericHandler<String>{
        @Override
        protected String handleInput(final String input) {
                return input.replace("mam złą opinię o bootcampie", "bootcamp jest super");
        }
}
