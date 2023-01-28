package de.ica.azubi.tasks;

import de.ica.azubi.misc.PrettyPrint;

public class DigitsExtractor {
    private PrettyPrint prettyPrint = new PrettyPrint();

    public String extractDigits(int value) {
        return prettyPrint.prettyDigitExtractor(value, false);
    }

    public String extractDigitsInReverseOrder(int value) {
        return prettyPrint.prettyDigitExtractor(value, true);
    }

    public int[] extractDigitsAsArray(int value) {
        return prettyPrint.prettyDigitExtractorArrays(value, false);

    }

    public int[] extractDigitsAsReversedArray(int value) {
        return prettyPrint.prettyDigitExtractorArrays(value, true);
    }
}
