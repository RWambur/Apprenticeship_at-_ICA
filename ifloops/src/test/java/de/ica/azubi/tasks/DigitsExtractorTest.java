package de.ica.azubi.tasks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DigitsExtractorTest {

    private DigitsExtractor sut;

    @BeforeEach
    void setUp() {
        this.sut = new DigitsExtractor();
    }

    @Test
    void extractDigits_ShouldReturnValueAsExtractedString() {
        int value = 123835;
        String expected = "1 2 3 8 3 5";

        String result = sut.extractDigits(value);

        assertThat(result).isEqualTo(expected);
    }


    @Test
    void extractDigitsReverseOrder_ShouldReturnValueAsReversedExtractedString() {
        int value = 123835;
        String expected = "5 3 8 3 2 1";

        String result = sut.extractDigitsInReverseOrder(value);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void extractDigitAsArray_ShouldReturnValueAsArray() {
        int value = 123835;
        int[] expected = new int[]{1, 2, 3, 8, 3, 5};

        int[] result = sut.extractDigitsAsArray(value);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void extractDigitAsArray_ShouldReturnValueAsReversedArray() {
        int value = 123835;
        int[] expected = new int[]{5, 3, 8, 3, 2, 1};

        int[] result = sut.extractDigitsAsReversedArray(value);

        assertThat(result).isEqualTo(expected);
    }
}
