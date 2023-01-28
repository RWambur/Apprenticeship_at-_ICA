package main.abstractClass;

import main.Author;
import main.Book;
import main.Database;
import main.misc.IntListGenerator;

public class ConnectAuthorsToBooks extends AbstractExecutableBookstoreFunction {

    public ConnectAuthorsToBooks(Database database) {
        super(database);
    }

    @Override
    protected void executeFunction() {
        Author selectedAuthor = selectAuthor();
        connectAuthorToBookAgain(selectedAuthor);
    }

    private Author selectAuthor() {
        System.out.printf("%s-----Buchhandel----- %sListe aller Autoren:%s", System.lineSeparator(), System.lineSeparator(), System.lineSeparator());
        int i = -1;
        prettyPrint.prettyPrint(database.getAuthorsWithNoBooks().toArray(), i, "Wähle zwischen 0 und " + (database.getAuthorsWithNoBooks().size() - 1) + " für einen Autoren.\n", "Auswahl: ");
        int input = failsafeInputReader.readUserInputFailsafe(IntListGenerator.generateIntListStartByZero(database.getAuthorsWithNoBooks().size()));
        return database.getAuthorsWithNoBooks().get(input);
    }

    private Book selectBook() {
        System.out.printf("%s-----Buchhandel------ %sListe aller Bücher:%s", System.lineSeparator(), System.lineSeparator(), System.lineSeparator());
        int i = -1;
        prettyPrint.prettyPrint(database.getBooksWithNoAuthor().toArray(), i, "Wähle zwischen 0 und " + (database.getBooksWithNoAuthor().size() - 1) + " für das passende Buch.\n", "Auswahl: ");
        int input = failsafeInputReader.readUserInputFailsafe(IntListGenerator.generateIntListStartByZero(database.getBooksWithNoAuthor().size()));
        return database.getBooksWithNoAuthor().get(input);
    }

    private void connectAuthorToBook(Author author, Book book) {
        book.setAuthor(author);
        author.setBook(book);

        System.out.printf("-----Buchhandel------ %s %s%s %s has written the Book %s with the ISBN %s. %s", System.lineSeparator(), System.lineSeparator(), book.getAuthor().getFirstName(), book.getAuthor().getLastName(), book.getTitle(), book.getiSBN(), System.lineSeparator());
    }

    private void connectAuthorToBookAgain(Author selectedAuthor) {
        boolean continueLoop = true;
        do {
            Book selectedBook = selectBook();
            connectAuthorToBook(selectedAuthor, selectedBook);

            if (!database.getBooksWithNoAuthor().isEmpty()) {
                System.out.printf("%s---Weitere Zuweisung?--- %sJa - 1 %sNein - 2 %sAuswahl: ", System.lineSeparator(), System.lineSeparator(), System.lineSeparator(), System.lineSeparator());
                int inputAgain = failsafeInputReader.readUserInputFailsafe(IntListGenerator.generateIntListStartByOne(2));
                switch (inputAgain) {
                    case 1 -> {
                    }
                    case 2 -> continueLoop = false;
                    default -> System.out.println("Ungültige Eingabe!");
                }
            } else {
                System.out.printf("%sKeine Bücher mehr zur Auswahl!%s", System.lineSeparator(), System.lineSeparator());
                continueLoop = false;
            }
        } while (continueLoop);
    }
}
