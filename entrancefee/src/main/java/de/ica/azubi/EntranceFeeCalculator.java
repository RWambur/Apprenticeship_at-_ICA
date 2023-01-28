package de.ica.azubi;

import de.ica.azubi.calculator.AgeCalculatorInvestigator;
import de.ica.azubi.calculator.ICalculator;
import de.ica.azubi.calculator.RowCalculatorInvestigator;

public class EntranceFeeCalculator {
    private final AgeCalculatorInvestigator ageInvestigator = new AgeCalculatorInvestigator();
    private final RowCalculatorInvestigator rowInvestigator = new RowCalculatorInvestigator();

    public String calculate(double ticketPrice, int age, int row) {
        if(age <= 0 ) {
            return "Sie sind nicht alt genug für den Film";
        }

        ICalculator iCalculatorAge = ageInvestigator.getAgeCalculator(age);
        ICalculator iCalculatorRow = rowInvestigator.getRowCalculator(row);

        double finalPrice = iCalculatorAge.calculate(ticketPrice);
        finalPrice = iCalculatorRow.calculate(finalPrice);

        return String.format("%s u. %s %.2f", iCalculatorAge.getAdditionText(age), iCalculatorRow.getAdditionText(age), finalPrice);
    }
}
