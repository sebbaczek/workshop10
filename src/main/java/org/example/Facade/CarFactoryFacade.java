package org.example.Facade;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//cała skomplikowana logika produkcji auta została zamknięta w jednej klasie, dzięki czemu; korzystanie z klas odbywa się na zasadzie kompozycji
//możemy z innych miejsc w kodzie wywoływać tylko jedną metodę produceCar().
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CarFactoryFacade {
   /*     private FrameAssembler frameAssembler;
        private Painter painter;
        private EngineMaker engineMaker;
        private CockpitAssembler cockpitAssembler;
        private DoorMaker doorMaker;
        private SeatsMaker seatsMaker;
        private WheelsProducer wheelsProducer;
       
        public void produceCar() {
                frameAssembler.assembleFrame(); // złożenie ramy
                painter.paintSkeleton(); // malowanie szkieletu
                engineMaker.fastenEngine(); // przymocuj silnik
                cockpitAssembler.mountCockpit(); // zamontuj kokpit
                doorMaker.installDoor(); // zamontuj drzwi
                seatsMaker.attachSeats(); // zamontuj siedzenia
                wheelsProducer.attachWheels(); // przykręć koła
        }*/
}
