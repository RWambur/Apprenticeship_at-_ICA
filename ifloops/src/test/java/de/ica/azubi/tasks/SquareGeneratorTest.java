package de.ica.azubi.tasks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SquareGeneratorTest {

    private SquareGenerator sut;

    @BeforeEach
    void setUp() {
        this.sut = new SquareGenerator();
    }

    @Test
    void generateSquare_SizeOfZero_ShouldReturnEmptyString() {
        int size = 0;

        String result = sut.generateSquare(size);

        assertThat(result).isEmpty();
    }

    @Test
    void generateSquare_SizeOfOne_ShouldReturnSquare() {
        int size = 1;
        String expected = "*";

        String result = sut.generateSquare(size);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void generateSquare_SizeOfFourShouldReturnSquare() {
        int size = 4;
        String expected = String.format("* * * *%s* * * *%s* * * *%s* * * *", System.lineSeparator(), System.lineSeparator(), System.lineSeparator());

        String result = sut.generateSquare(size);

        assertThat(result).isEqualTo(expected);
    }
}
