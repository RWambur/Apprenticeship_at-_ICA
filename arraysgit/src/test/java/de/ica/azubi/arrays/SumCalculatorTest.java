package de.ica.azubi.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SumCalculatorTest {

    private SumCalculator sut;

    @BeforeEach
    void setUp() {
        this.sut = new SumCalculator();
    }

    @Test
    void calculate_EmptyArray_ShouldReturnZero() {
        // arrange
        int[] values = new int[0];

        // act
        int sum = this.sut.sum(values);

        // assert
        assertThat(sum).isZero();
    }

    @Test
    void calculate_ArrayWithValues_ShouldReturnPositiveSum() {
        // arrange
        int[] values = new int[] {1, 2, 10, 30, -1, -5, -6, -7};
        int expected = 24;

        // act
        int sum = this.sut.sum(values);

        // assert
        assertThat(sum).isEqualTo(expected);
    }

    @Test
    void calculate_ArrayWithValues_ShouldReturnNegativeSum() {
        // arrange
        int[] values = new int[] { -1, -5, -6, -7, -100, 1, 2, 3, 5};
        int expected = -108;

        // act
        int sum = this.sut.sum(values);

        // assert
        assertThat(sum).isEqualTo(expected);
    }
}
