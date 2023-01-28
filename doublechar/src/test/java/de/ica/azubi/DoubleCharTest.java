package de.ica.azubi;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class DoubleCharTest {

    private DoubleChar sut;

    @BeforeEach
    void setUp() {
        this.sut = new DoubleChar();
    }

    @Test
    void doubleChar_ShouldReturnPositive() {
        String input = "kkeevviinn$$aazzuubbii";

        int result = sut.doubleChar(input);

        assertThat(result).isEqualTo(1);
    }

    @Test
    void doubleChar_ShouldReturnZero() {
        String input = "bat";

        int result = sut.doubleChar(input);

        assertThat(result).isZero();
    }

    @Test
    void doubleChar_ShouldReturnNegative() {
        String input = "ddannniieell";

        int result = sut.doubleChar(input);

        assertThat(result).isEqualTo(-3);
    }
}
