package de.ica.azubi.calculator;

public class ThreeQuarterPriceCalculator implements ICalculator {

    @Override
    public double calculate(double ticketPrice) {
        return ticketPrice * 0.75;
    }

    @Override
    public String getAdditionText(int age) {
        return "3/4 Vollpreis";
    }
}
