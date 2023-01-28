package de.ica.azubi.conversion;

import de.ica.azubi.conversion.abstractclass.AbstractCalculator;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class ValueToCoins {
    public Map<CoinTypesEnum, Integer> toCoins(BigDecimal value) {
        Map<CoinTypesEnum, Integer> coinTypesEnumIntegerMap = new HashMap<>();

        for (CoinTypesEnum i : CoinTypesEnum.values()) {
            coinTypesEnumIntegerMap.put(i, 0);
        }

        do {
            AbstractCalculator calculator = CalculatorGetter.getMatchingCalculator(value);
            CoinEnumToCounter result = calculator.calculate(value);

            coinTypesEnumIntegerMap.put(result.getKey(), result.getValue());
            value = value.subtract(result.sum());
        } while (value.compareTo(BigDecimal.valueOf(0)) > 0);
        return coinTypesEnumIntegerMap;
    }
}
