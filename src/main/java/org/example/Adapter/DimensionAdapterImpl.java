package org.example.Adapter;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class DimensionAdapterImpl implements DimensionAdapter {
        private static final double INCH_TO_METER = 0.0254;
        private Dimension dimension;
        @Override
        public BigDecimal getDimension() {
                return convertIntToMeter(dimension.getDimension());
        }
        private BigDecimal convertIntToMeter(BigDecimal inch) {
                return BigDecimal.valueOf(INCH_TO_METER).multiply(inch);
        }
}

