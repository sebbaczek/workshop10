package org.example.Proxy;

import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class PizzaBakerProxy implements PizzaBaker {
        private static final List<String> DENIED_PIZZAS = List.of("Hawaiian");
        
        //oprócz implementacji jest kompzycja danego interfejsu
        private final PizzaBaker executor;
        @Override
        public void bake(String pizza) {
                if (DENIED_PIZZAS.contains(pizza)) {
                        throw new RuntimeException(String.format("%s? We don't do this here!", pizza));
                } else {
                        executor.bake(pizza);
                }
        }
}
