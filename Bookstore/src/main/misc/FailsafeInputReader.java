package main.misc;

import java.util.List;
import java.util.Scanner;

public class FailsafeInputReader {
    static Scanner sc = new Scanner(System.in);

    public int readUserInputFailsafe(List<Integer> options) {
        boolean validValue = false;
        int userInput = 0;
        do {
            try {
                userInput = sc.nextInt();
                if (options.contains(userInput)) {
                    validValue = true;
                } else {
                    System.out.printf("Ungültige Eingabe! %sAuswahl: ", System.lineSeparator());
                }
            } catch (Exception ex) {
                System.out.printf("%sVersuche es erneut! %sAuswahl: ", System.lineSeparator(), System.lineSeparator());
            }
            sc.nextLine();
        } while (!validValue);
        return userInput;
    }
}