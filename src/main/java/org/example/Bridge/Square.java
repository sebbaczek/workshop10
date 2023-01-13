package org.example.Bridge;

import lombok.ToString;

@ToString(callSuper = true)
public class Square extends Shape {
        public Square(final Color color) {
                super(color);
        }
        @Override
        public void draw() {
                System.out.println("Square with color: " + color.apply());
        }
}

