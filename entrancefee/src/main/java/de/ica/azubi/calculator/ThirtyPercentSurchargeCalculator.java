package de.ica.azubi.calculator;

public class ThirtyPercentSurchargeCalculator implements ICalculator {

    @Override
    public double calculate(double ticketPrice) {
        return ticketPrice * 1.3;
    }

    @Override
    public String getAdditionText(int age) {
        return "30% Zuschlag";
    }
}
