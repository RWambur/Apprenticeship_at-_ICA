package main;

import java.util.ArrayList;
import java.util.List;

public class Database {
    private final List<Book> persistedBooks = new ArrayList<>(); //final -- lassen sich nicht -überschreiben- aber Inhalt kann modifiziert werden
    private final List<Author> persistedAuthor = new ArrayList<>();

    public void persistBook(Book book) {
        this.getPersistedBooks().add(book);
    }

    public void persistAuthor(Author author) {
        this.getPersistedAuthor().add(author);
    }

    private List<Book> getPersistedBooks() {
        return persistedBooks;
    }

    private List<Author> getPersistedAuthor() {
        return persistedAuthor;
    }

    private List<Book> getCopyOfPersistedBooks() {
        return List.of(persistedBooks.toArray(Book[]::new)); // unmodifizierbar
        //return new ArrayList<>(persistedBooks);
    }

    public List<Book> getBooksWithNoAuthor() {
        List<Book> filteredBooks = new ArrayList<>();
        for (Book book : persistedBooks) {
            if (book.hasNoAuthor()) {
                filteredBooks.add(book);
            }
        }
        return filteredBooks;
    }

    public List<Author> getAuthorsWithNoBooks() {
        List<Author> filteredAuthor = new ArrayList<>();
        for (Author author : persistedAuthor) {
            if (author.hasNoBook()) {
                filteredAuthor.add(author);
            }
        }
        return filteredAuthor;
    }

    public List<Book> getAuthorWithBook() {
        List<Book> authorsWithBooks = new ArrayList<>();
        for (Book book : persistedBooks) {
            if (book.hasAuthorAssigned()) {
                authorsWithBooks.add(book);
            }
        }
        return authorsWithBooks;
    }

    public void removeConnectionIndex(int index) {
        Book book = getCopyOfPersistedBooks().get(index);
        removeConnection(book);
    }

    private void removeConnection(Book book) {
        book.getAuthor().setBook(null);
        book.setAuthor(null);
    }
}
