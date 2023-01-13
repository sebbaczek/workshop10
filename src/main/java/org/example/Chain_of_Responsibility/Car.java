package org.example.Chain_of_Responsibility;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.With;

import java.util.List;

@Data
@With
@AllArgsConstructor(staticName = "of")
public class Car {
        private Type type;
        private String color;
        private List<String> equipment;
        enum Type {
                CABRIOLET,
                JEEP
        }
}