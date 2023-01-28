package main.abstractClass;

import main.Database;
import main.misc.FailsafeInputReader;
import main.misc.IntListGenerator;

import java.util.Scanner;

public abstract class AbstractExecutableBookstoreFunction {

    protected final Database database;
    protected static final Scanner consoleInputReader = new Scanner(System.in);
    protected FailsafeInputReader failsafeInputReader = new FailsafeInputReader();
    protected PrettyPrint prettyPrint = new PrettyPrint();

    protected AbstractExecutableBookstoreFunction(Database database) {
        this.database = database;
    }

    public void execute() {
        if (shouldExit()) {
            return;
        }
        executeFunction();
    }

    private boolean shouldExit() {
        System.out.printf("%S--Fortfahren?-- %sJa - 1 %sZurück - 0 %sAuswahl: ", System.lineSeparator(), System.lineSeparator(), System.lineSeparator(), System.lineSeparator());
        int i = failsafeInputReader.readUserInputFailsafe(IntListGenerator.generateIntListStartByZero(1));
        return i <= 0;
    }

    protected abstract void executeFunction();
}
