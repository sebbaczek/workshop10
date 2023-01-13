package org.example.Prototype.ex2_clone;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor(staticName = "of")
class SteeringWheel implements Cloneable {
        private double diameter;
        @Override
        protected SteeringWheel clone() throws CloneNotSupportedException {
                final SteeringWheel clone = (SteeringWheel) super.clone();
                clone.diameter = this.diameter;
                return clone;
        }
}
