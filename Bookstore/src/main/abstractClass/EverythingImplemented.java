package main.abstractClass;

import main.Database;

public class EverythingImplemented extends AbstractExecutableBookstoreFunction {
    public EverythingImplemented(Database database) {
        super(database);
    }

    @Override
    protected void executeFunction() {
        System.out.println("-----Buchhandel-----" + "\nAlles:");
        int i = 0;
        prettyPrint.prettyPrint(database.getAuthorsWithNoBooks().toArray(), i, "\n---Author with no Book---", "");
        prettyPrint.prettyPrint(database.getBooksWithNoAuthor().toArray(), i, "\n---Book with no Author---", "");
        prettyPrint.prettyPrint(database.getAuthorWithBook().toArray(), i, "\n---Book with Author---", "");
    }
}
