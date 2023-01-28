package de.ica.azubi.tasks;

public class StringReverser {

    public String reverse(final String input) {
        if (input.isEmpty() || input.isBlank()) {
            return "";
        }
        return reverseInternal(input);
    }

    private static String reverseInternal(final String input) {
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        return reversed;
    }
}
