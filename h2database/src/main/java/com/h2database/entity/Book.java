package com.h2database.entity;

import jakarta.persistence.*;
import java.util.Random;

@Entity
public class Book {

    @Id
    private long id = randomID();

    @Column(nullable = false, unique = true)
    private String title;

    @Column(nullable = false)
    private String author;

    public long randomID() {
        Random r = new Random();
        long rId = 0;
        for (int i = 0; i < 10; i++) {
            rId = r.nextLong(1000000,9999999);
        }
        return rId;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
