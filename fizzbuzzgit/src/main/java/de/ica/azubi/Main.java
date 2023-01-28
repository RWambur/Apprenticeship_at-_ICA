package de.ica.azubi;

import de.ica.azubi.service.FizzBuzz;

public class Main {

    static FizzBuzz fizzBuzz = new FizzBuzz();

    public static void main(String[] args) {
        int value = 0;
        do {
            value++;
            System.out.println(fizzBuzz.fromValue(value));
        } while (value < 100);
    }
}
