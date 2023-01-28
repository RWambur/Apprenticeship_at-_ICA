package de.ica.azubi.conversion.abstractclass;

import de.ica.azubi.conversion.CoinTypesEnum;

public class TenCent extends AbstractCalculator {
    @Override
    public CoinTypesEnum getEnumValue() {
        return CoinTypesEnum.TEN_CENT;
    }
}
