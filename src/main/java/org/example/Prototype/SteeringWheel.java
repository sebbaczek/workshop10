package org.example.Prototype;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor(staticName = "of")
class SteeringWheel {
        private double diameter;
        public SteeringWheel deepCopy() {
                var newSteeringWheel = new SteeringWheel();
                newSteeringWheel.diameter = this.diameter;
                return newSteeringWheel;
        }
}