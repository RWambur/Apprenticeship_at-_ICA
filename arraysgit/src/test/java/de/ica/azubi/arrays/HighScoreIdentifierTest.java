package de.ica.azubi.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class HighScoreIdentifierTest {

    HighScoreIdentifier sut;

    @BeforeEach
    void setUp() {
        this.sut = new HighScoreIdentifier();
    }

    @Test
    void findHighScore_ValuesProvided_ShouldReturnHighestValue() {
        int expectedResult = 10000;
        int[] scores = new int[] {1, 70, 2, 3, 4, expectedResult, -4, 30, 99, -400, 399, 66 };

        int result = this.sut.findHighScore(scores);

        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void findHighScore_NoValuesProvided_ShouldReturnZero() {
        int expectedResult = 0;
        int[] scores = new int[0];

        int result = this.sut.findHighScore(scores);

        assertThat(result).isEqualTo(expectedResult);
    }


    @Test
    void findHighScore_DuplicatedValuesProvided_ShouldReturnReturnHighestValue() {
        int expectedResult = 10000;
        int[] scores = new int[] {expectedResult, 70, expectedResult, 3, 4, expectedResult, -4, 30, 99, -400, 399, 66 };

        int result = this.sut.findHighScore(scores);

        assertThat(result).isEqualTo(expectedResult);
    }
}
