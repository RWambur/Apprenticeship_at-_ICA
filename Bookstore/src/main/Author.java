package main;

public class Author {
    private String firstName;
    private String lastName;
    private Book book;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public boolean hasBookAssigned() {
        return this.book != null;
    }

    public boolean hasNoBook() {
        return !hasBookAssigned();
    }

    @Override // Geerbte Methode. von der Klasse (Object) die von meiner Klasse (Author) ableitet, Methoden überschreiben
    public String toString() {
        return String.format("%s %s", this.firstName, this.lastName);
    }
}

