package de.ica.azubi.arrays;

public class AverageCalculator {
    public double calculateAverage(final int[] values) {
        if (values.length == 0) {
            return 0;
        }
        return calculateAverageInternal(values);
    }

    private static double calculateAverageInternal(final int[] values) {
        double sum = 0;
        for (Integer i : values) {
            sum += i;
        }
        return sum / values.length;
    }

    void foo() {
        Integer x; // default => NULL
        int y = 0; // default => 0

        Integer xx = y;

        int a = 1;
        int b = 1;

        Integer aa = 1;
        Integer bb = aa;

        // Wertevergleich primitve Typen
        boolean equal = a == b;
        // true: Wertevergleich von Objekten
        boolean equal2 = aa.equals(bb);
        // false: Vergleich von Objekt Referenz
        boolean equal3 = aa == bb;
    }
}
