package de.ica.azubi.arrays;

public class Reverser {
    public int[] reverse(final int[] values) {
        if (values.length == 0) {
            return new int[0];
        }
        return reverseInternal(values);
    }

    private static int[] reverseInternal(final int[] values) {
        for (int i = 0; i < values.length / 2; i++) {
            int temp = values[i];
            values[i] = values[values.length - 1 - i];
            values[values.length - 1 - i] = temp;
        }
        return values;
    }

    public boolean double23(int[] nums) {
        if (nums[0] == nums[1]) {
            return true;
        } else if (nums. == 1 && nums[0] != nums[1]) {
            return false;
        }
        return false;
    }
}
