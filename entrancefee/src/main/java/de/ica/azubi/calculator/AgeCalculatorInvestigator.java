package de.ica.azubi.calculator;

public class AgeCalculatorInvestigator {

    public ICalculator getAgeCalculator(int age) {
        if (age < 0) {
            return new NotAllowedCalculator();
        } else if (age < 6) {
            return new HalfPriceCalculator();
        } else if (age < 13) {
            return new ThreeQuarterPriceCalculator();
        } else if (age <= 16) {
            return new TenPercentReductionCalculator();
        } else {
            return new FullPriceCalculator();
        }
    }
}
