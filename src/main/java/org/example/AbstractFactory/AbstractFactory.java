package org.example.AbstractFactory;

public interface AbstractFactory<T> {
    // metoda create() zwraca typ generyczny. Teraz musimy stworzyć klasę fabrykę, która
        //zaimplementuje ten interface i zwróci konkretne subklasy
        
        T create(String type) ;
}