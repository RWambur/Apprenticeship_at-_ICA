package main;

import java.util.ArrayList;
import java.util.List;

public class Database {
    private final List<BankAccount> persistedAccounts = new ArrayList<>();

    public void persist(BankAccount bankAccount) {
        this.persistedAccounts.add(bankAccount);
    }

    public BankAccount findForPin(int pinToSearchFor) {
        for (BankAccount bankAccount : persistedAccounts) {
            if (bankAccount.getPin() == pinToSearchFor) {
                return bankAccount;
            }
        }
        return null;
    }
}
