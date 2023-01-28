package de.ica.azubi.service;

public class FizzBuzz {

    public String fromValue(int value) {
        boolean fizz = value % 3 == 0 && value > 0;
        boolean buzz = value % 5 == 0 && value > 0;
        boolean fizzBuzz = fizz && buzz;

        if (fizzBuzz) {
            return "FizzBuzz";
        } else if (fizz) {
            return "Fizz";
        } else if (buzz) {
            return "Buzz";
        } else {
            return Integer.toString(value);
        }
    }
}
