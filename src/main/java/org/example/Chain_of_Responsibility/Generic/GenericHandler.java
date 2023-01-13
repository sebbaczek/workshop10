package org.example.Chain_of_Responsibility.Generic;

public abstract class GenericHandler<T> {
        protected GenericHandler<T> handler;
        public void setNextHandler(GenericHandler<T> nextHandler) {
                this.handler = nextHandler;
        }
        public T handle(T input) {
                T r = handleInput(input);
                if (handler != null) {
                        return handler.handle(r);
                }
                return r;
        }
        abstract protected T handleInput(T input);
}