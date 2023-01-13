package org.example.Prototype.toBuilder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.With;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data
@With
@Builder(toBuilder = true)
@AllArgsConstructor
public class LombokPrototypeCar {
        private String brand;
        private String model;
        private LombokSteeringWheel steeringWheel;
        private List<String> doors;
        public LombokPrototypeCar() {
                this.brand = "Ford";
                this.model = "Mustang";
                this.steeringWheel = new LombokSteeringWheel(12.34);
                this.doors = new ArrayList<>(
                                   Arrays.asList("left front", "right front", "left rear", "right rear"));
}
}
