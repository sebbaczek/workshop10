package org.example.Prototype.lombok_with;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.With;

@Data
@With
@NoArgsConstructor
@AllArgsConstructor
class LombokSteeringWheel {
        private double diameter;
}