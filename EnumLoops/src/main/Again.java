package main;

import java.util.Scanner;

public class Again {
    public static void again() {
        System.out.println("\n\nWeitere Auswahl? [Y/N]");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toUpperCase();


        switch (input) {
            case "Y":
                Options.options();
                break;
            case "N":
                break;
            default:
                System.out.println("ERROR");
                again();
                break;
        }
    }
}
