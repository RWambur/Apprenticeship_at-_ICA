package de.ica.azubi.arrays;

public class HighScoreIdentifier {
    public int findHighScore(final int[] values) {
        if (values.length == 0) {
            return 0;
        } else {
            return findHighScoreInternal(values);
        }
    }

    private static int findHighScoreInternal(final int[] values) {
        int greatest = values[0];
        for (int i = 0; i < values.length; i++) {
            greatest = values[i] > greatest ? values[i] : greatest;
        }
        return greatest;
    }
}
