package de.ica.azubi.calculator;

public class RowCalculatorInvestigator {

    public ICalculator getRowCalculator(int row) {
        if (row < 5) {
            return new ThirtyPercentReductionCalculator();
        } else if (row < 9) {
            return new FullPriceCalculator();
        } else if (row < 12) {
            return new ThirtyPercentSurchargeCalculator();
        } else {
            return new FiftyPercentSurchargeCalculator();
        }
    }
}
