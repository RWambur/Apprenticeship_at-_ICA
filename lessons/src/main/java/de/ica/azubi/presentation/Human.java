package de.ica.azubi.presentation;

import java.util.*;

public class Human {
    String name;
    int age;
    String gender;
    double weight;

    public String talk(String sentence) {
        return sentence;
    }

    public void prettyWeirdVirus() {
        List<String> strandsOfViruses = new ArrayList<>();
        Map<String, Integer> virusPotency = new HashMap<>();
        Formatter formatter = new Formatter();

        strandsOfViruses.add("NSZ Virus Gamma-B1");
        virusPotency.put(strandsOfViruses.get(0), 54);
    }

    public double easyPeasyCalculation() {
        double PI = Math.PI;
        PI = Math.round(PI);

        return PI; // 3.0
    }

    public void looseBeltShoeKnuckle(int userInput) {
        // Expressions-Statements
        double PI = Math.PI;
        double arealKreis = PI * (5 * 5);
        int sum = (int) (arealKreis + PI);

        // Deklaratorische-Statements
        String getDecelerated;
        String valueGetsDecelerated = "I am Decelerated!";
        String getDeceleratedTheFirst, getDeceleratedTheSecond;

        // Kontroll-Statement
        for (int i = 0; i < 10; i++) {
            if (userInput == 1) {
                System.out.println("Eins");
            } else if (userInput == 2) {
                break;
            } else {
                System.out.println("Null");
            }
        }
    }

    public void riceGum(int riceBalls, String relatives, boolean continueLoop) {

        if (riceBalls >= 2) {
            share();
        } else if (riceBalls > 0) {
            eat();
        } else {
            noMoreRiceBalls();
        }

        switch (relatives) {
            case "Mama" -> getSmallGift();
            case "Oma Ingrid" -> getMediumGift();
            case "Calvin Cordozar Broadus Jr" -> getLargeGift();
            default -> cry();
        }

        while (continueLoop) {
            if (riceBalls > 0) {
                eat();
            } else {
                continueLoop = false;
            }
        }
    }

    public void freddy(int riceBalls, boolean continueLoop) {

        do {
            if (riceBalls > 0) {
                eat();
            } else {
                continueLoop = false;
            }
        } while (continueLoop);


        int relatives = 10;
        for (int i = 0; i < relatives; i++) {
            getSmallGift();
        }

        String[] relativesArray = {"Mama", "Oma Ingrid", "Calvin Cordozar Broadus Jr"};
        for (String s : relativesArray) {
            if ("Calvin Cordozar Broadus Jr".equals(s)) {
                getLargeGift();
            } else {
                getSmallGift();
            }
        }
    }

    public boolean isEnoughProtein(double protein, int bodyWeight) {
        double generalRule = 152.0 / 80.0;
        double neededProtein = protein / bodyWeight;

        return neededProtein >= generalRule;
    }

    public void eat() {
    }

    public boolean modThree(int[] nums) {
        int even = 0; int odd = 0;
        boolean hasThreeEven = false; boolean hasThreeOdd = false;
        for (int num : nums) {
            if (num % 2 == 0) {
                even++;
                if (even >= 3) {
                    hasThreeEven = true;
                }
            }
            if (num % 2 != 0) {
                odd++;
                if (odd >= 3) {
                    hasThreeOdd = true;
                }
            }
        }
        return hasThreeEven;
    }

    public int loneSum(int a, int b, int c) {
        int[] nums = new int[3];
        int sum = a+b+c;

        nums[0] = a;
        nums[1] = b;
        nums[2] = c;

        if (nums[0] == nums[1]) {
            sum -= nums[1];
        } else if (nums[1] == nums[2]) {
            sum -= nums[2];
        } else if (nums[0] == nums[2]) {
            sum -= nums[0];
        }
        return sum;
    }

    public void share() {
    }

    public void noMoreRiceBalls() {
    }

    public void cry() {
    }

    public void getSmallGift() {
    }

    public void getMediumGift() {
    }

    public void getLargeGift() {
    }
}


