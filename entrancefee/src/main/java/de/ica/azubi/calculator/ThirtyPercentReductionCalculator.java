package de.ica.azubi.calculator;

public class ThirtyPercentReductionCalculator implements ICalculator {

    @Override
    public double calculate(double ticketPrice) {
        return ticketPrice * 0.7;
    }

    @Override
    public String getAdditionText(int age) {
        return "30% Ermäßigung";
    }
}
