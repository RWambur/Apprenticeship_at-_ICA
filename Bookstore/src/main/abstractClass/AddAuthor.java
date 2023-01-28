package main.abstractClass;

import main.Author;
import main.Database;

public class AddAuthor extends AbstractExecutableBookstoreFunction {

    public AddAuthor(Database database) {
        super(database);
    }

    @Override
    protected void executeFunction() {
        System.out.println(System.lineSeparator() + "-----Buchhandel-----" + System.lineSeparator() + "Autor:");
        System.out.print("Vorname: ");
        String firstName = consoleInputReader.nextLine();
        System.out.print("Nachname: ");
        String lastName = consoleInputReader.nextLine();
        System.out.printf("%s %s %s wurde als Author hinzugefügt!%n", System.lineSeparator(), firstName, lastName);

        database.persistAuthor(new Author(firstName, lastName));
    }
}
