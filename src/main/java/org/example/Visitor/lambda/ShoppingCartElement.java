package org.example.Visitor.lambda;

import java.math.BigDecimal;

public interface ShoppingCartElement {
        default BigDecimal accept(ShoppingCartVisitor visitor) {
                return visitor.visit(this);
        }
}

