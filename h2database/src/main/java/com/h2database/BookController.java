package com.h2database;

import com.h2database.config.BookIdMismatchException;
import com.h2database.config.BookNotFoundException;
import com.h2database.entity.Book;
import com.h2database.entity.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@Controller
public class BookController {
    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/")
    public String homePage(Model model, Book book) {
        model.addAttribute("bookList", bookRepository.findAll());
        model.addAttribute("bookValue", book);
        return "index";
    }

    // Find Books
    @GetMapping("/title-{bookTitle}")
    public List<Book> findByTitle(@PathVariable String bookTitle) {
        return bookRepository.findByTitle(bookTitle);
    }
    @GetMapping("/{id}")
    public Book findByID(@PathVariable long id) {
        Optional<Book> maybeBook = bookRepository.findById(id);
        return maybeBook.orElseThrow(BookNotFoundException::new);
    }

    // Create Books
    @GetMapping("/create-book")
    public String createBook(Model model) {
        model.addAttribute("book", new Book());
        return "/create-book";
    }
    @PostMapping("/create-book")
    public String bookSubmit(Book book) {
        bookRepository.save(book);
        return "/create-book";
    }
    // Delete Book
    @GetMapping("/delete-book")
    public String deleteBook(Model model, Book book) {
        model.addAttribute("book", book);
        return "/delete-book";
    }
    @PostMapping("/delete-book")
    public String deleteBookPost(long id, Book book) {
        bookRepository.findById(id)
                    .orElseThrow(BookNotFoundException::new);
            bookRepository.deleteById(id);
        return "/delete-book";
    }

    // Update Book
    @GetMapping("/update-book")
    public String updateBook(Model model, Book book) {
        model.addAttribute("book", book);
        return "/update-book";
    }
    @PostMapping ("/update-book")
    public String updateBook(Book book, long id) {
        if (book.getId() != id) {
            throw new BookIdMismatchException();
        }
        bookRepository.findById(id)
                .orElseThrow(BookNotFoundException::new);
        bookRepository.save(book);
        return "/update-book";
    }
}