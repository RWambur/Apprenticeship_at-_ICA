package com.h2database.entity;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookRepository extends CrudRepository<Book, Long> {
    List<Book> findByTitle(String title);

    List<Book> findAllByAuthor(String author);
}
