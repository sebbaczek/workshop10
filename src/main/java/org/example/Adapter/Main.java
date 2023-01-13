package org.example.Adapter;

/*
Jeżeli napotkamy w praktyce sytuację, gdy będziemy mieli 2 interfejsy, które w żaden sposób nie są
        związane ze sobą (czyli np. będziemy potrzebowali wykorzystać 2 różne biblioteki, ewentualnie 2
        moduły z naszego kodu) i będziemy chcieli te interfejsy zachęcić do wspólnej pracy to możemy
        wykorzystać ten wzorzec.
        
        w implementacji adaptera wykorzystujemy jako pole Interfejs napisany do pierwotnej klasy
*/


public class Main {
        public static void main(String[] args) {
        
                Dimension dimension = new SonyTV();
                DimensionAdapter dimensionAdapter = new DimensionAdapterImpl(dimension);
                
                System.out.println("original: " + dimension.getDimension());
                System.out.println("adapted: " + dimensionAdapter.getDimension());
        
        }
}