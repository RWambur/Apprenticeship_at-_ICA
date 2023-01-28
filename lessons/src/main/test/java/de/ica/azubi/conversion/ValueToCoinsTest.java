package de.ica.azubi.conversion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

class ValueToCoinsTest {
    private ValueToCoins sut;

    @BeforeEach
    void setUp() {
        this.sut = new ValueToCoins();
    }

    @Test
    void shouldReturn_NeededQuantityOfCoins() {
        BigDecimal value = BigDecimal.valueOf(12.95);


        Map<CoinTypesEnum, Integer> result = sut.toCoins(value);

        assertThat(result.get(CoinTypesEnum.TWO_EURO).intValue()).isEqualTo(6);
        assertThat(result.get(CoinTypesEnum.ONE_EURO).intValue()).isEqualTo(0);
        assertThat(result.get(CoinTypesEnum.FIFTY_CENT).intValue()).isEqualTo(1);
        assertThat(result.get(CoinTypesEnum.TWENTY_CENT).intValue()).isEqualTo(2);
        assertThat(result.get(CoinTypesEnum.TEN_CENT).intValue()).isEqualTo(0);
        assertThat(result.get(CoinTypesEnum.FIFE_CENT).intValue()).isEqualTo(1);
        assertThat(result.get(CoinTypesEnum.TWO_CENT).intValue()).isEqualTo(0);
        assertThat(result.get(CoinTypesEnum.ONE_CENT).intValue()).isEqualTo(0);
    }
}
