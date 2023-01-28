package de.ica.azubi.calculator;

public class NotAllowedCalculator implements ICalculator {

    @Override
    public double calculate(double ticketPrice) {
        return ticketPrice;
    }

    @Override
    public String getAdditionText(int age) {
        return "Sie sind nicht alt genug für den Film";
    }
}
