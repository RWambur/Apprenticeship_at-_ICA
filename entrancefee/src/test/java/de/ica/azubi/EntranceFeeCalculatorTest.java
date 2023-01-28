package de.ica.azubi;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class EntranceFeeCalculatorTest {

    // sut = system under test
    private EntranceFeeCalculator sut;

    @BeforeEach
    void setUp() {
        this.sut = new EntranceFeeCalculator();
    }

    @Test
    void calculateFinalPrice_Age_shouldReturnFullPrice() {
        double ticketPrice = 6.30;
        int age = 18;
        int row = 6;

        String result = sut.calculate(ticketPrice, age, row);

        assertThat(result).isEqualTo("Vollpreis u. Vollpreis 6.30");
    }

    @Test
    void calculateFinalPrice_Age_shouldReturnNotAllowed() {
        double ticketPrice = 6.30;
        int age = -1;
        int row = 6;

        String result = sut.calculate(ticketPrice, age, row);

            assertThat(result).isEqualTo("Sie sind nicht alt genug für den Film");
    }

    @Test
    void calculateFinalPrice_Age_shouldReturnHalfPrice() {
        double ticketPrice = 6.30;
        int age = 5;
        int row = 6;

        String result = sut.calculate(ticketPrice, age, row);

        assertThat(result).isEqualTo("halber Vollpreis u. Vollpreis 3.15");
    }

    @Test
    void calculateFinalPrice_Age_shouldReturnThreeQuartersPrice() {
        double ticketPrice = 6.30;
        int age = 12;
        int row = 6;

        String result = sut.calculate(ticketPrice, age, row);

        assertThat(result).isEqualTo("3/4 Vollpreis u. Vollpreis 4.73");
    }

    @Test
    void calculateFinalPrice_Age_shouldReturnTenPercentReductionPrice() {
        double ticketPrice = 6.30;
        int age = 16;
        int row = 6;

        String result = sut.calculate(ticketPrice, age, row);

        assertThat(result).isEqualTo("10% Ermäßigung u. Vollpreis 5.67");
    }

    @Test
    void calculateFinalPrice_Row_shouldReturnFullPrice() {
        double ticketPrice = 6.30;
        int age = 18;
        int row = 8;

        String result = sut.calculate(ticketPrice, age, row);

        assertThat(result).isEqualTo("Vollpreis u. Vollpreis 6.30");
    }

    @Test
    void calculateFinalPrice_Row_shouldReturnThirtyPercentReduction() {
        double ticketPrice = 6.30;
        int age = 18;
        int row = 4;

        String result = sut.calculate(ticketPrice, age, row);

        assertThat(result).isEqualTo("Vollpreis u. 30% Ermäßigung 4.41");
    }

    /*@ParameterizedTest
    @MethodSource("valueProvider")
    void paramized(double ticketPrice, int age, int row, String expectedResult) {
        assertThat(sut.calculate(ticketPrice, age, row)).isEqualTo(expectedResult);
    }

    private static Stream<Arguments> valueProvider() {

        List<Arguments> args = new ArrayList<>();

        for (int age = 1; age < 25; age++) {
            args.add(Arguments.arguments(6.3, age, 4, EntranceFeeCalculator.FULL_PRICE + EntranceFeeCalculator.THIRTY_PERCENT_REDUCTION + (6.3 - (0.3 * 6.3))));
        }
        return args.stream();

    }*/

    @Test
    void calculateFinalPrice_Row_shouldReturnThirtyPercentSurcharge() {
        double ticketPrice = 6.30;
        int age = 18;
        int row = 11;

        String result = sut.calculate(ticketPrice, age, row);

        assertThat(result).isEqualTo("Vollpreis u. 30% Zuschlag 8.19");
    }

    @Test
    void calculateFinalPrice_Row_shouldReturnFiftyPercentSurcharge() {
        double ticketPrice = 6.30;
        int age = 18;
        int row = 13;

        String result = sut.calculate(ticketPrice, age, row);

        assertThat(result).isEqualTo("Vollpreis u. 50% Zuschlag 9.45");
    }

    @Test
    void calculateFinalPrice_AgeAndRow_shouldReturnThreeQuartersPriceAndFiftyPercentSurcharge() {
        double ticketPrice = 6.30;
        int age = 7;
        int row = 15;

        String result = sut.calculate(ticketPrice, age, row);

        assertThat(result).isEqualTo("3/4 Vollpreis u. 50% Zuschlag 7.09");
    }

    @Test
    void calculateFinalPrice_AgeAndRow_shouldReturnFullPriceAndThirtyPercentReduction() {
        double ticketPrice = 6.30;
        int age = 25;
        int row = 4;

        String result = sut.calculate(ticketPrice, age, row);

        assertThat(result).isEqualTo("Vollpreis u. 30% Ermäßigung 4.41");
    }
}