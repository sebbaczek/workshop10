package org.example.Prototype;

import lombok.Data;

@Data
public class CopyCar {
        SteeringWheel steeringWheel;
        public CopyCar shallowCopy() {
                var newCar = new CopyCar();
                newCar.steeringWheel = this.steeringWheel;
                return newCar;
        }
        public CopyCar deepCopy() {
                var newCar = new CopyCar();
                newCar.steeringWheel = this.steeringWheel.deepCopy();
                return newCar;
        }
}
