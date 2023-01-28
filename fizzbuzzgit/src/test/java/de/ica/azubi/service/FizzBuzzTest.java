package de.ica.azubi.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class FizzBuzzTest {

    private FizzBuzz sut;

    @BeforeEach
    void setUp() {
        this.sut = new FizzBuzz();
    }

    @ParameterizedTest
    @ValueSource(ints = {Integer.MIN_VALUE, -5, -4, -3, -2, -1, 0, 1, 2, 7, 8, 11, 13, 14})
    void fromValue_ShouldReturnProvidedValue(int value) {
        String fizzBuzzResult = sut.fromValue(value);
        assertThat(fizzBuzzResult).isEqualTo(String.valueOf(value));
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 6, 9, 12, 18, 21, 24, 27, 33, 36, 39, 42, 48, 51, 54, 57})
    void fromValue_ShouldReturnFizz(int value) {
        String fizzBuzzResult = sut.fromValue(value);
        assertThat(fizzBuzzResult).isEqualTo("Fizz");
    }

    //
    @ParameterizedTest
    @ValueSource(ints = {5, 10, 20, 25, 35, 40, 50, 55, 65, 70, 80, 85})
    void fromValue_ShouldReturnBuzz(int value) {
        String fizzBuzzResult = sut.fromValue(value);
        assertThat(fizzBuzzResult).isEqualTo("Buzz");
    }
    //

    @ParameterizedTest
    @ValueSource(ints = {15, 30, 45, 60, 75, 90})
    void fromValue_ShouldReturnFizzBuzz(int value) {
        String fizzBuzzResult = sut.fromValue(value);
        assertThat(fizzBuzzResult).isEqualTo("FizzBuzz");
    }

}
