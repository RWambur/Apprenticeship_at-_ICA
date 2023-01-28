package de.ica.azubi.tasks;

public class SquareGenerator {
    private static final String SQUARE_PRINT_CHARACTER = "*";

    public String generateSquare(int size) {
        if (size == 0) {
            return "";
        } else if (size == 1) {
            return SQUARE_PRINT_CHARACTER;
        }

        return generateSquareInternal(size);
    }

    private String generateSquareInternal(int size) {
        String generatedSquare = "";
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                generatedSquare += String.format("%s%s", SQUARE_PRINT_CHARACTER, j + 1 == size ? "" : " " );
            }
            generatedSquare += i + 1 == size ? "" : System.lineSeparator();
        }
        return generatedSquare;
    }


}
