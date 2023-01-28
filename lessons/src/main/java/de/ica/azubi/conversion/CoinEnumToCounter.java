package de.ica.azubi.conversion;

import java.math.BigDecimal;

public class CoinEnumToCounter extends Pair<CoinTypesEnum, Integer> {
    public CoinEnumToCounter(CoinTypesEnum key, Integer value) {
        super(key, value);
    }

    public BigDecimal sum() {
        return BigDecimal.valueOf(getValue()).multiply(BigDecimal.valueOf(getKey().getValue()));
    }
}
