package org.example;

public class SchoolTaskLoop {

    public int sumA(int g) {
        int sum = 0;
        int members = 0;

        while (sum < g) {
            sum += ++members;
        }
        return members;
    }

    public int sumB(int g) {
        int members = 0;
        for (int sum = 0; sum < g; members++) {
            int currentGlied = members + 1;

            //sum += currentGlied % 2 == 0 ? currentGlied * -1 : currentGlied;

            if (currentGlied % 2 == 0) {
                sum += currentGlied * -1;
            } else {
                sum += currentGlied;
            }
        }
        return members;
    }

    public int sumC(int g) {
        double sum = 0;
        double members = 0;

        while (sum < g) {
            sum += 1 / ++members;
        }
        return (int) members;
    }

    public int sumD(int g) {
        int sum = 0;
        int members = 0;

        while (sum < g) {
            sum += ++members * 2;
        }
        return members;
    }
}
