package org.example.Bridge;

import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
public abstract class Shape {
        protected Color color;
        abstract public void draw();
}
