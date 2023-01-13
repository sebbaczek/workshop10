package org.example.Visitor.lambda;

import java.math.BigDecimal;

@FunctionalInterface
public interface ShoppingCartVisitor {
        BigDecimal visit(ShoppingCartElement shoppingCartElement);
}

