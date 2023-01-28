package main;

public class AccountHolder {
    private String firstName;
    private String lastName;

    private AccountHolder() {

    }
    public AccountHolder(String firstName, String lastName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}