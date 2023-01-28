package de.azubi.palindrome;

public class Palindrome {

    public boolean isPalindrome(String input) {
        String inputReplaced = input.replace(" ", "").trim();
        String reversedInput = "";
        for (int i = inputReplaced.length() -1 ; i >= 0 ; i--) {
            reversedInput += inputReplaced.charAt(i);
        }
        return inputReplaced.equalsIgnoreCase(reversedInput);
    }

    public boolean isPalindrome(int input) {
        return isPalindrome(String.valueOf(input));
    }
}
