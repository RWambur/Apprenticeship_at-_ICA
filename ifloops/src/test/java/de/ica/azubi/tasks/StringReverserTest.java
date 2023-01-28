package de.ica.azubi.tasks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class StringReverserTest {

    private StringReverser sut;

    @BeforeEach
    void setUp() {
        this.sut = new StringReverser();
    }

    @Test
    void reverse_EmptyString_ShouldReturnEmpty() {
        String input = "";

        String result = this.sut.reverse(input);

        assertThat(result).isEmpty();
    }

    @Test
    void reverse_BlankString_ShouldReturnEmpty() {
        String input = "        ";

        String result = this.sut.reverse(input);

        assertThat(result).isEmpty();
    }

    @Test
    void reverse_OneCharacter_ShouldReturnCharacter() {
        String input = "c";

        String result = this.sut.reverse(input);

        assertThat(result).isEqualTo(input);
    }

    @Test
    void reverse_MultipleCharacters_ShouldReturnReversed() {
        String input = "abcdefgh";
        String expected = "hgfedcba";

        String result = this.sut.reverse(input);

        assertThat(result).isEqualTo(expected);
    }
}
