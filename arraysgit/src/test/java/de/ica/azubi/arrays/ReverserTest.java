package de.ica.azubi.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.assertj.core.api.Assertions.assertThat;

class ReverserTest {

    private Reverser sut;

    @BeforeEach
    void setUp() {
        this.sut = new Reverser();
    }

    @Test
    void reverse_NoValuesProvided_ShouldReturnEmptyArray() {
        int[] values = new int[0];

        int[] result = this.sut.reverse(values);

        assertThat(result).isEmpty();
    }

    @Test
    void reverse_ValuesProvided_ShouldReturnReversedArray() {
        int[] values = new int[]{1, 4, 7, 3, 6};
        int[] expectedResult = new int[]{6, 3, 7, 4, 1};

        int[] result = this.sut.reverse(values);

        assertThat(result).isEqualTo(expectedResult);
    }
}
