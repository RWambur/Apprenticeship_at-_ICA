package main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    private static Database database = new Database();

    public static void main(String[] args) {
        home();
    }

    public static void home() {
        boolean continueLoop = true;
        do {
            System.out.println("\n----Bank Ihrer Wahl----" +
                    "\nEinen Account erstellen - 1" +
                    "\nEinen Account auswählen - 2" +
                    "\nVerlassen - 3");
            System.out.print("Auswahl: ");
            int input = 0;
            try {
                input = sc.nextInt();
                continueLoop = false;
            } catch (InputMismatchException ex) {
                System.out.println(ex);
            }
            sc.nextLine();

            switch (input) {
                case 1 -> createAccount();
                case 2 -> accountSelection();
                case 3 -> continueLoop = false;
                default -> System.out.println("Ungültige Auswahl getroffen!");
            }
        } while (continueLoop);

        System.out.println("Danke dass Sie sich für [BANK IHRER WAHL] entschieden haben!" +
                "\nScnönen Tag noch!");
        System.exit(0);
    }

    public static void createAccount() {

        System.out.println("-----Bank Account-----");
        System.out.print("Vorname: ");
        String firstName = sc.nextLine();
        System.out.print("Nachname: ");
        String lastName = sc.nextLine();

        AccountHolder accountHolder = new AccountHolder(firstName, lastName);
        BankAccount bankAccount = new BankAccount(accountHolder);

        System.out.print("PIN: ");
        bankAccount.setPin(sc.nextInt());

        database.persist(bankAccount);
        System.out.println("Der Account " + accountHolder.getLastName() + ", " + accountHolder.getFirstName() + " wurde erstellt!");
        home();
    }

    public static void accountSelection() {
        boolean continueLoop = true;
        int input = 0;
        do {
            System.out.println("-----Bank Account-----");
            System.out.println("Bitte geben sie Ihren PIN ein");
            System.out.print("PIN: ");
            input = sc.nextInt();
            try {
                selection(database.findForPin(input));
                continueLoop =false;
            } catch (Exception ex) {
                System.out.println("Invalid Pin!");
                System.out.println("Try Again!");
            }
        } while (continueLoop);
    }

    public static void selection(BankAccount bankAccount) {
        boolean continueLoop = true;
        do {
            System.out.println("\n-----Bank Account-----");
            System.out.println("User: " + bankAccount.getAccountHolder().getLastName() + ", " + bankAccount.getAccountHolder().getFirstName());
            System.out.println();
            System.out.println("Einzahlen - 1");
            System.out.println("Abheben - 2");
            System.out.println("Guthaben - 3");
            System.out.println("Verlassen - 4");
            System.out.println("(Transaktionen: " + bankAccount.getTransactions() + ")");
            System.out.print("Auswahl: ");
            int input = sc.nextInt();
            switch (input) {
                case 1 -> depositInternal(bankAccount);
                case 2 -> withdrawInternal(bankAccount);
                case 3 -> balance(bankAccount);
                case 4 -> {
                    continueLoop = false;
                    home();
                }
                default -> System.out.println("Ungültige Auswahl getroffen!");
            }
        } while (continueLoop);
    }

    public static void depositInternal(BankAccount bankAccount) {
        boolean excLoop = true;
        int depositValue = 0;
        do {
            System.out.println("\n-----Bank Account-----");
            System.out.println("Wieviel möchtest du einzahlen?");
            System.out.print("Menge: ");
            try {
                bankAccount.deposit(depositValue);
                excLoop = false;
            } catch (Exception ex) {
                System.out.println(ex);
                System.out.println("Try Again!\n");
            }
        } while (excLoop);


        System.out.println(depositValue + "€ wurde zum Guthaben hinzugefügt.");
        sc.nextLine();
    }

    public static void withdrawInternal(BankAccount bankAccount) {
        boolean excLoop = true;
        int withdrawValue = 0;
        do {
            System.out.println("\n-----Bank Account-----");
            System.out.println("Wieviel möchtest du abheben?");
            System.out.print("Menge: ");
            withdrawValue = sc.nextInt();
            try {
                bankAccount.withdraw(withdrawValue);
                excLoop = false;
            } catch (Exception ex) {
                System.out.println(ex);
                System.out.println("Try Again!\n");
            }

        } while (excLoop);

        System.out.println(withdrawValue + "€ wurde vom Guthaben abgehoben.");
        sc.nextLine();
    }

    public static void balance(BankAccount bankAccount) {
        System.out.println("\n-----Bank Account-----");
        System.out.println("Guthaben: " + bankAccount.getBalance() + "€");
        sc.nextLine();
    }
}