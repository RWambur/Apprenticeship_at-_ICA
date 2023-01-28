package main;

import java.util.Scanner;

public class Options {
    public static void options() {
        System.out.println("\n-------Optionen--------\nAlle Artikel - 01\nSaisonale Artikel - 02\nNicht Seaisonale Artikel - 03\n" +
                "Kosten aller Artikel - 04\n");
        System.out.print("Auswahl: ");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toUpperCase();

        switch (input){
            case "01":
                OptionSelection.option01();
                break;
            case "02":
                OptionSelection.option02();
                break;
            case "03":
                OptionSelection.option03();
                break;
            case "04":
                OptionSelection.option04();
                break;
            default:
                System.out.println("ERROR");
                options();
                break;
        }
    }
}
