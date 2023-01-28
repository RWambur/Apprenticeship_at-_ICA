package main;

import main.abstractClass.*;
import main.misc.FailsafeInputReader;
import main.misc.IntListGenerator;

public class Main {
    public static final Database database = new Database();
    static AddAuthor addAuthor = new AddAuthor(database);
    static AddBook addBook = new AddBook(database);
    static ConnectAuthorsToBooks connectAuthorsToBooks = new ConnectAuthorsToBooks(database);
    static EverythingImplemented everythingImplemented = new EverythingImplemented(database);
    static ConnectedAuthorsAndBooks connectedAuthorsAndBooks = new ConnectedAuthorsAndBooks(database);
    static FailsafeInputReader failsafeInputReader = new FailsafeInputReader();

    public static void main(String[] args) {
        if (args == null || args.length == 0) {
            System.out.println("Array is empty");
        }
        boolean continueLoop = true;
        do {
            System.out.printf("%s-----Buchhandel----- " +
                    "%sAutor hinzufügen - 1 " +
                    "%sBuch hinzufügen - 2 " +
                    "%sListe Autoren und Bücher - 3 " +
                    "%sAutor einem Buch zuweisen - 4 " +
                    "%sListe Autoren und zugewiesenen Bücher - 5" +
                    "%sVerlassen - 6" +
                    "%sAuswahl: ", System.lineSeparator(), System.lineSeparator(), System.lineSeparator(), System.lineSeparator(), System.lineSeparator(), System.lineSeparator(), System.lineSeparator(), System.lineSeparator());
            int input = failsafeInputReader.readUserInputFailsafe(IntListGenerator.generateIntListStartByOne(6));
            switch (input) {
                case 1 -> addAuthor.execute();
                case 2 -> addBook.execute();
                case 3 -> everythingImplemented.execute();
                case 4 -> connectAuthorsToBooks.execute();
                case 5 -> connectedAuthorsAndBooks.execute();
                case 6 -> continueLoop = false;
                default -> System.out.println("Ungültige Auswahl!");
            }
        } while (continueLoop);
        System.out.println("Schönen Tag noch!");
    }
}