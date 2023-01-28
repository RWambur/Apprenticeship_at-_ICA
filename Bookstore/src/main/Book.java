package main;

public class Book {
    private String title;
    private int iSBN; // eindeutige identifikation
    private Author author;

    public Book(String title, int iSBN) {
        this.title = title;
        this.iSBN = iSBN;
    }

    public String getTitle() {
        return title;
    }

    public int getiSBN() {
        return iSBN;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public boolean hasAuthorAssigned() {
        return this.author != null;
    }

    public boolean hasNoAuthor() {
        return !hasAuthorAssigned();
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", this.iSBN, this.title, getAuthorInfoOrEmpty());
    }

    private String getAuthorInfoOrEmpty() {
        if (hasAuthorAssigned()) {
            // "Vorname Nachname"
            return this.author.toString();
        }

        return "";
    }
}
