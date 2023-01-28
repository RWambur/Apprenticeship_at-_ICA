package de.ica.azubi.conversion;

import java.math.BigDecimal;

public enum CoinTypesEnum {
    TWO_EURO("2 €", 2),
    ONE_EURO("2 €", 1),
    FIFTY_CENT("50 Cent", 0.5),
    TWENTY_CENT("20 Cent", 0.2),
    TEN_CENT("10 Cent", 0.1),
    FIFE_CENT("5 Cent", 0.05),
    TWO_CENT("2 Cent", 0.02),
    ONE_CENT("1 Cent", 0.01);

    private final String coinName;
    private final double value;

    CoinTypesEnum(String coinName, double value) {
        this.coinName = coinName;
        this.value = value;
    }

    public String getCoinName() {
        return coinName;
    }

    public double getValue() {
        return value;
    }

    public BigDecimal getBigDecimalValue() {
        return BigDecimal.valueOf(this.value);
    }

    public boolean isValueGreaterOrEqualTo(BigDecimal value) {
        return this.getBigDecimalValue().compareTo(value) <= 0;
    }
}
