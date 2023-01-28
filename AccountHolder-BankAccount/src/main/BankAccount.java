package main;

public class BankAccount {
    private AccountHolder accountHolder;
    private int transactions;
    private int balance = 0;
    private int pin;

    private BankAccount() { //private um kreieren von acc, ohne holder zu verhindern
    }

    public BankAccount(AccountHolder accountHolder) {
        this.setAccountHolder(accountHolder);
    }

    public int getTransactions() {
        return transactions;
    }

    public int getBalance() {
        return balance;
    }

    public void withdraw(int withdraw) {
        if (withdraw > balance) {
            throw new IllegalArgumentException("Not enough balance!");
        } else if (withdraw < 0) {
            throw new IllegalArgumentException("Can't withdraw a negative!");
        }

        balance -= withdraw;
        transactions++;
    }

    public void deposit(int deposit) {
        if (deposit < 0) {
            throw new IllegalArgumentException("Can't deposit a negative!");
        }

        balance += deposit;
        transactions++;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public int getPin() {
        return pin;
    }

    public AccountHolder getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(AccountHolder accountHolder) {
        this.accountHolder = accountHolder;
    }
}
