package main.abstractClass;

import main.Book;
import main.Database;
import main.misc.IntListGenerator;

public class AddBook extends AbstractExecutableBookstoreFunction {

    public AddBook(Database database) {
        super(database);
    }

    @Override
    protected void executeFunction() {
        System.out.printf("%s-----Buchhandel----- %sBuch %sTitel: ", System.lineSeparator(), System.lineSeparator(), System.lineSeparator());
        String title = consoleInputReader.nextLine();
        System.out.print("ISBN: ");
        int iSBN = failsafeInputReader.readUserInputFailsafe(IntListGenerator.generateIntListStartByOne(50000));
        System.out.printf("%sDas Buch %s mit dem ISBN %s wurde hinzugefügt!%s", System.lineSeparator(), title, iSBN, System.lineSeparator());

        database.persistBook(new Book(title, iSBN));
    }
}
