package de.ica.azubi;

public class DoubleChar {
    public int doubleChar(String input) {
        if (input.length() % 2 != 0) {
            return 0;
        }

        for (int i = 1; i < input.length(); i += 2) {
            if (input.charAt(i) != input.charAt(i - 1)) {
                return -i;
            }
        }
        return 1;
    }
}
