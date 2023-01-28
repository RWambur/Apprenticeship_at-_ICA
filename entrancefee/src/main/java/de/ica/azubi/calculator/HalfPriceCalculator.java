package de.ica.azubi.calculator;

public class HalfPriceCalculator implements ICalculator {

    @Override
    public double calculate(double ticketPrice) {
        return ticketPrice / 2;
    }

    @Override
    public String getAdditionText(int age) {
        return "halber Vollpreis";
    }
}
