package de.ica.azubi.misc;

import de.ica.azubi.tasks.StringReverser;

public class PrettyPrint {

    public String prettyDigitExtractor(int value, boolean shouldReverse) {
        String valueAsString = String.valueOf(value).replace("", " ").trim();
        if (shouldReverse) {
            return new StringReverser().reverse(valueAsString);
        }
        return valueAsString;
    }

    public int[] prettyDigitExtractorArrays(int value, boolean shouldReverse) {
        String valueAsString = String.valueOf(value).replace("", " ").trim();
        String[] strings = valueAsString.split(" ");
        int[] ints = new int[valueAsString.length() / 2 + 1];

        for (int i = 0; i < strings.length; i++) {
            if (shouldReverse) {
                String reversedStrings = new StringReverser().reverse(valueAsString);
                String[] reversedStringsArray = reversedStrings.split(" ");
                for (int j = 0; j < reversedStrings.length(); j++) {
                    ints[i] = Integer.parseInt(reversedStringsArray[i]);
                }
            } else {
                ints[i] = Integer.parseInt(strings[i]);
            }
        }
        return ints;
    }
}

