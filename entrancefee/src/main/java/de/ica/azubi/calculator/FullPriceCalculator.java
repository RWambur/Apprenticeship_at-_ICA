package de.ica.azubi.calculator;

public class FullPriceCalculator implements ICalculator {

    @Override
    public double calculate(double ticketPrice) {
        return ticketPrice;
    }

    @Override
    public String getAdditionText(int age) {
        return "Vollpreis";
    }
}
