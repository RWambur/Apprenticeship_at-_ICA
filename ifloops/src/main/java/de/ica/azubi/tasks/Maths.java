package de.ica.azubi.tasks;

import java.util.ArrayList;

public class Maths {

    public boolean isPositive(int value) {
        return value > 0;
    }

    public boolean isNegative(int value) {
        return !isPositive(value);
    }

    public int greatestOf(int valueOne, int valueTwo, int valueThree) {
        if (valueOne > valueTwo && valueOne > valueThree) {
            return valueOne;
        } else if (valueTwo > valueThree && valueTwo > valueOne) {
            return valueTwo;
        } else if (valueThree > valueOne && valueThree > valueTwo) {
            return valueThree;
        }
        return 0;
    }

    public int[] multiplicationTable(int value) {
        int[] multiplicationTable = new int[value + 1];

        for (int i = 0; i < multiplicationTable.length; i++) {
            multiplicationTable[i] = i * value;
        }

        return multiplicationTable;
    }

    public int countDigits(int value) {
        if (value < 10) {
            return 1;
        }
        int count = 0;
        do {
            count++;
            value /= 10;
        } while (value != 0);

        return count;
    }

    public boolean areSame(int valueOne, int valueTwo) {
        return valueOne == valueTwo;
    }

    public int sumOfDigits(int value) {
        int valueLength = String.valueOf(value).length();
        ArrayList<Integer> arrayOfDigits = new ArrayList<>();

        int finalSum = 0;
        int digitToBeSummed = 0;
        int calculator = 1;

        for (int i = 0; i < valueLength; i++) {
            calculator = calculator * 10;
            int digit = value / calculator;
            for (int j = 0; j < 1; j++) {
                digitToBeSummed = digit % 10;
            }
            if (digitToBeSummed == 0) {
                digitToBeSummed = value % 10;
            }
            arrayOfDigits.add(digitToBeSummed);
        }

        for (Integer i : arrayOfDigits) {
            finalSum += Integer.parseInt(String.valueOf(i));
        }

        return finalSum;
    }

    public int sumOfDigitsV2(int value) {

        int result = 0;
        do {
            result += value % 10;
            value /= 10;
        } while (value != 0);

        return result;
    }
}
