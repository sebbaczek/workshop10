package org.example.Decorator.jsoupDecorator;

import org.jsoup.nodes.Attribute;

public abstract class AttributeDecorator extends Attribute {
       
       //Chcemy udekorować metodę getKey(), więc musimy ją nadpisać i wywołać implementację z klasy
       //bazowej Attribute. Robimy to przez wywołanie metody super.getKey().
        //Pokazywane podejście zadziała tylko jeżeli klasa, którą rozszerzamy (tutaj Attribute)
       //nie jest final i jednocześnie metoda, którą będziemy dekorować również nie jest final
        private final Attribute attribute;
       
        public AttributeDecorator(final Attribute attribute) {
                super(attribute.getKey(), attribute.getValue());
                this.attribute = attribute;
        }
        @Override
        public String getKey() {
                return super.getKey();
        }
}
