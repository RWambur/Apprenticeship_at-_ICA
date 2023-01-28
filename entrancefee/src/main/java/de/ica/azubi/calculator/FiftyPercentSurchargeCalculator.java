package de.ica.azubi.calculator;

public class FiftyPercentSurchargeCalculator implements ICalculator {

    @Override
    public double calculate(double ticketPrice) {
        return ticketPrice * 1.5;
    }

    @Override
    public String getAdditionText(int age) {
        return "50% Zuschlag";
    }
}
