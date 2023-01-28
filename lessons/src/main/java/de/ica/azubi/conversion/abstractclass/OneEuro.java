package de.ica.azubi.conversion.abstractclass;

import de.ica.azubi.conversion.CoinTypesEnum;

public class OneEuro extends AbstractCalculator {
    @Override
    public CoinTypesEnum getEnumValue() {
        return CoinTypesEnum.ONE_EURO;
    }
}
