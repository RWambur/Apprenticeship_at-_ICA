package de.ica.azubi.conversion;

import de.ica.azubi.conversion.abstractclass.*;

import java.math.BigDecimal;

public class CalculatorGetter {
    public static AbstractCalculator getMatchingCalculator(BigDecimal value) {
        if (CoinTypesEnum.TWO_EURO.isValueGreaterOrEqualTo(value)) {
            return new TwoEuro();
        } else if (CoinTypesEnum.ONE_EURO.isValueGreaterOrEqualTo(value)) {
            return new OneEuro();
        } else if (CoinTypesEnum.FIFTY_CENT.isValueGreaterOrEqualTo(value)) {
            return new FiftyCent();
        } else if (CoinTypesEnum.TWENTY_CENT.isValueGreaterOrEqualTo(value)) {
            return new TwentyCent();
        } else if (CoinTypesEnum.TEN_CENT.isValueGreaterOrEqualTo(value)) {
            return new TenCent();
        } else if (CoinTypesEnum.FIFE_CENT.isValueGreaterOrEqualTo(value)) {
            return new FifeCent();
        } else if (CoinTypesEnum.TWO_CENT.isValueGreaterOrEqualTo(value)) {
            return new TwoCent();
        } else if (CoinTypesEnum.ONE_CENT.isValueGreaterOrEqualTo(value)) {
            return new OneCent();
        } else {
            throw new IllegalArgumentException("Impossible Calculation");
        }
    }
}
