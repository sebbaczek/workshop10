package org.example.AbstractFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;

public class LambdaFactoryProvider {
        final static Map<String, Supplier<AbstractFactory<?>>> FACTORIES_MAP = new HashMap<>();
        
        static {
                FACTORIES_MAP.put("Pizza", PizzaFactory::new);
//                FACTORIES_MAP.put("Car", CarFactory::new);
        }
        
        public static AbstractFactory<?> getFactory(String whatFactory){
                return Optional.of(FACTORIES_MAP.get(whatFactory))
                               .map(Supplier::get)
                               .orElseThrow(() -> new RuntimeException("I'm sorry, we only produce pizzas or cars!"));
        }
}
