package de.ica.azubi.conversion.abstractclass;

import de.ica.azubi.conversion.CoinTypesEnum;

public class TwoCent extends AbstractCalculator {
    @Override
    public CoinTypesEnum getEnumValue() {
        return CoinTypesEnum.TWO_CENT;
    }
}
