package main.misc;

import java.util.ArrayList;
import java.util.List;

public class IntListGenerator {

    public static List<Integer> generateIntListStartByOne(int maxValue) {
        return generateIntListFromTo(1, maxValue);
    }

    public static List<Integer> generateIntListStartByZero(int maxValue) {
        return generateIntListFromTo(0, maxValue);
    }

    private static List<Integer> generateIntListFromTo(int from, int to) {
        List<Integer> result = new ArrayList<>();
        for (int i = from; i <= to; i++) {
            result.add(i);
        }
        return result;
    }
}
