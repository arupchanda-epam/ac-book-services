package com.book.management.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="books")
@Entity
public class Book {

    @Id
    private Long bookid;
    private String bookname;
    private String author;
    private String category;
    private String description;

    public Long getBookid() {
        return bookid;
    }

    public String getBookname() {
        return bookname;
    }

    public String getAuthor() {
        return author;
    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }
}
