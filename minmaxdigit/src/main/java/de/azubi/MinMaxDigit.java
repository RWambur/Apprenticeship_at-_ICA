package de.azubi;

import java.util.ArrayList;
import java.util.List;

public class MinMaxDigit {
    public MinMaxPair<Long> minMaxDigit(long input) {
        List<Long> digits = new ArrayList<>();
        long runningValue = input < 0 ? input * -1 : input;
        do {
            digits.add(runningValue % 10);
            runningValue /= 10;
        } while (runningValue > 0);

        long min = 9;
        long max = 0;

        for (int i = 0; i < digits.size(); i++) {
            min = digits.get(i) < min ? digits.get(i) : min;
        }
        for (long l : digits) {
            max = l > max ? l : max;
        }

        return new MinMaxPair<>(min, max);
    }
}
