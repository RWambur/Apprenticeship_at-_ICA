package de.ica.azubi.tasks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class MathsTest {

    private Maths sut;

    @BeforeEach
    void setUp() {
        this.sut = new Maths();
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5, 6, 7, Integer.MAX_VALUE})
    void isPositive_PositiveValues_ShouldReturnTrue(int value) {
        assertThat(sut.isPositive(value)).isTrue();
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, -2, -3, -4, -5, -6, -7, Integer.MIN_VALUE})
    void isPositive_Negative_ShouldReturnFalse(int value) {
        assertThat(sut.isPositive(value)).isFalse();
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, -2, -3, -4, -5, -6, -7, Integer.MIN_VALUE})
    void isNegative_NegativeValues_ShouldReturnTrue(int value) {
        assertThat(sut.isNegative(value)).isTrue();
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5, 6, 7, Integer.MAX_VALUE})
    void isNegative_PositiveValues_ShouldReturnFalse(int value) {
        assertThat(sut.isNegative(value)).isFalse();
    }

    @Test
    void greatestOf_ThreeValuesProvided_ShouldReturnGreatest() {
        int valueOne = 2;
        int valueTwo = 1;
        int valueThree = 4;

        int result = sut.greatestOf(valueOne, valueTwo, valueThree);

        assertThat(result).isEqualTo(valueThree);

    }

    @Test
    void multiplicationTable_NegativeValue_ShouldReturnEmptyTable() {
        int value = -1;
        int[] expected = new int[0];

        int[] result = sut.multiplicationTable(value);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void multiplicationTable_ValueOfFive_ShouldReturnExpectedTable() {
        int value = 5;
        int[] expected = new int[] {0, 5, 10, 15, 20, 25};

        int[] result = sut.multiplicationTable(value);

        assertThat(result).isEqualTo(expected);
    }


    @Test
    void multiplicationTable_ValueOfSix_ShouldReturnExpectedTable() {
        int value = 6;
        int[] expected = new int[] {0, 6, 12, 18, 24, 30, 36};

        int[] result = sut.multiplicationTable(value);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void multiplicationTable_ValueOfThree_ShouldReturnExpectedTable() {
        int value = 3;
        int[] expected = new int[] {0, 3, 6, 9};

        int[] result = sut.multiplicationTable(value);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void countDigits_ValueProvided_ShouldReturnTen() {
        int value = 1234567890;

        int result = sut.countDigits(value);

        assertThat(result).isEqualTo(10);
    }

    @Test
    void countDigits_ValueProvided_ShouldReturnOne() {
        int value = -1;

        int result = sut.countDigits(value);

        assertThat(result).isEqualTo(1);
    }

    @Test
    void areSame_SameValuesProvided_ShouldReturnTrue() {
        int valueOne = -1;
        int valueTwo = -1;

        boolean result = sut.areSame(valueOne, valueTwo);

        assertThat(result).isTrue();
    }

    @Test
    void areSame_DifferentValuesProvided_ShouldReturnFalse() {
        int valueOne = -1;
        int valueTwo = 1;

        boolean result = sut.areSame(valueOne, valueTwo);

        assertThat(result).isFalse();
    }

    @Test
    void sumOfDigits_ShouldReturnExpectedSum() {
        int value = 12345;
        int expected = 15;

        int result = sut.sumOfDigitsV2(value);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void sumOfDigitsTwo_ShouldReturnExpectedSum() {
        int value = 56137598;
        int expected = 44;

        int result = sut.sumOfDigits(value);

        assertThat(result).isEqualTo(expected);
    }
}
