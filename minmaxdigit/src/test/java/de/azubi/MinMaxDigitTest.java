package de.azubi;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MinMaxDigitTest {

    private MinMaxDigit sut;

    @BeforeEach
    void setUp() {
        this.sut = new MinMaxDigit();
    }

    @Test
    void shouldReturn_MinMaxDigit() {
        long input = 4441444;

        MinMaxPair<Long> result = sut.minMaxDigit(input);

        assertThat(result.getMax()).isEqualTo(4);
        assertThat(result.getMin()).isEqualTo(1);
    }

    @Test
    void shouldReturn_NegativeMinMaxDigit() {
        long input = -213984;

        MinMaxPair<Long> result = sut.minMaxDigit(input);

        assertThat(result.getMax()).isEqualTo(9);
        assertThat(result.getMin()).isEqualTo(1);
    }
}
