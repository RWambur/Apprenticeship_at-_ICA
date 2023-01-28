package de.ica.azubi.calculator;

public class TenPercentReductionCalculator implements ICalculator {

    @Override
    public double calculate(double ticketPrice) {
        return ticketPrice * 0.9;
    }

    @Override
    public String getAdditionText(int age) {
        return "10% Ermäßigung";
    }
}
