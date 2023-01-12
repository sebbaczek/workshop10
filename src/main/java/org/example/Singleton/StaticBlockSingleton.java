package org.example.Singleton;

// eager init
public final class StaticBlockSingleton {
        private static final StaticBlockSingleton instance;
       
       //tworzymy instancję tego obiektu w statycznym
       //bloku inicjalizacyjnym, więc  gdy zawołamy metodę getInstance(), zawsze zostanie zwrócona ta sama
       //instancja
        
        
        static {
                try {
                        instance = new StaticBlockSingleton();
                } catch (Exception e) {
                        throw new RuntimeException("Exception occurred when creating instance");
                }
        }
        private StaticBlockSingleton() {}
        public static StaticBlockSingleton getInstance() {
                return instance;
        }
}