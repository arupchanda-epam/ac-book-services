package com.book.management.controller;

import com.book.management.exception.BookNotFoundException;
import com.book.management.model.Book;
import com.book.management.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController

public class BookController {
    @Autowired
    BookService bookService;

    @GetMapping("/books")
    private Iterable<Book> getBooks() {
        return bookService.list();
    }


    @GetMapping("/books/{id}")
    private Optional<Book> getBook(@PathVariable Long id) {
        Optional<Book> book = bookService.get(id);
        if(book.isEmpty()){
            throw new BookNotFoundException("Book id= " + id + " Not found");
        }
        return book;
    }

    @PostMapping("/books")
    private Book addBook(@RequestBody Book book){
        return bookService.save(book);
    }

    @PutMapping("/books")
    private void updateBook(@RequestBody Book book){
        bookService.update(book);
    }

    @DeleteMapping("/books/{id}")
    public void deleteBook(@PathVariable Long id) {
        bookService.delete(id);
    }


}
