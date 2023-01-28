package de.ica.azubi.arrays;

public class SumCalculator {
    public int sum(final int[] values) {
        if (values.length == 0) {
            return 0;
        } else {
            return sumInternal(values);
        }
    }

    private static int sumInternal(final int[] values) {
        int sum = 0;
        for (int i : values) {
            sum += i;
        }
        return sum;
    }
}
