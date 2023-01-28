package de.ica.azubi.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AverageCalculatorTest {

    private AverageCalculator sut;

    @BeforeEach
    void setUp() {
        this.sut = new AverageCalculator();
    }

    @Test
    void calculateAverage_NoValuesProvided_ShouldReturnZero() {
        int[] values = new int[0];

        double result = sut.calculateAverage(values);

        assertThat(result).isZero();
    }


    @Test
    void calculateAverage_NegativeValuesProvided_ShouldReturnNegativeAverage() {
        int[] values = new int[]{-5, -5, -3, -2, -5};
        double expectedResult = -4;

        double result = sut.calculateAverage(values);

        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void calculateAverage_ValuesProvided_ShouldReturnAverage() {
        int[] values = new int[]{1, 4, 7, 3, 6};
        double expectedResult = 4.2;

        double result = sut.calculateAverage(values);

        assertThat(result).isEqualTo(expectedResult);
    }
}
