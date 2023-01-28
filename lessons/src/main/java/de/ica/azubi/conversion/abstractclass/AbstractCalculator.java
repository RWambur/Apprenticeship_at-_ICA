package de.ica.azubi.conversion.abstractclass;

import de.ica.azubi.conversion.CoinEnumToCounter;
import de.ica.azubi.conversion.CoinTypesEnum;

import java.math.BigDecimal;

public abstract class AbstractCalculator {
    protected abstract CoinTypesEnum getEnumValue();

    public CoinEnumToCounter calculate(BigDecimal value) {
        int counter = 0;

        while (getEnumValue().isValueGreaterOrEqualTo(value)) {
            ++counter;
            value = value.subtract(BigDecimal.valueOf(getEnumValue().getValue()));
        }

        return new CoinEnumToCounter(getEnumValue(), counter);
    }
}
