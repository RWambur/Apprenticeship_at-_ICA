package de.azubi.palindrome;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PalindromeTest {

    private Palindrome sut;

    @BeforeEach
    void setUp() {
        this.sut = new Palindrome();
    }

    @Test
    void palindrome_String_ShouldReturnIsPalindrome() {
        String input = "otto";
        boolean expected = true;

        boolean result = sut.isPalindrome(input);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void palindrome_Integer_ShouldReturnIsPalindrome() {
        int input = 111444111;
        boolean expected = true;

        boolean result = sut.isPalindrome(input);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void palindrome_Sentence_ShouldReturnIsPalindrome() {
        String input = "do geese see god";
        boolean expected = true;

        boolean result = sut.isPalindrome(input);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void palindrome_ShouldReturnIsNotPalindrome() {
        String input = "eiersalat";
        boolean expected = false;

        boolean result = sut.isPalindrome(input);

        assertThat(result).isEqualTo(expected);
     }
}
