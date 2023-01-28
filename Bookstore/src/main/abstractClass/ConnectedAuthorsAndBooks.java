package main.abstractClass;

import main.Database;
import main.misc.IntListGenerator;

public class ConnectedAuthorsAndBooks extends AbstractExecutableBookstoreFunction {
    public ConnectedAuthorsAndBooks(Database database) {
        super(database);
    }

    @Override
    protected void executeFunction() {
        boolean continueLoop = true;
        do {
            System.out.printf("%s-----Buchhandel---- %sSortiment:", System.lineSeparator(), System.lineSeparator());

            int i = -1;
            prettyPrint.prettyPrint(database.getAuthorWithBook().toArray(), i, "", "");

            System.out.printf("%s--Was möchtest du tun?-- %sZuweisung aufheben - 1 %sVerlassen - 2 %sAuswahl: ", System.lineSeparator(), System.lineSeparator(), System.lineSeparator(), System.lineSeparator());
            int input = failsafeInputReader.readUserInputFailsafe(IntListGenerator.generateIntListStartByOne(2));
            switch (input) {
                case 1 -> revokeConnection();
                case 2 -> continueLoop = false;
                default -> System.out.println("Ungültige Auswahl!");
            }
        } while (continueLoop);
    }

    private void revokeConnection() {
        System.out.printf("%s--Welche Zuweisung willst du entfernen?-- %sAuswahl: ", System.lineSeparator(), System.lineSeparator());
        int input = failsafeInputReader.readUserInputFailsafe(IntListGenerator.generateIntListStartByZero(database.getAuthorWithBook().size()));
        database.removeConnectionIndex(input);
    }
}
