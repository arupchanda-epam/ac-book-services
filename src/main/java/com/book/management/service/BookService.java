package com.book.management.service;

import com.book.management.model.Book;
import com.book.management.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public Book save(Book book) {
        return (Book) bookRepository.save(book);
    }


    public Optional<Book> get(long id) {
        return bookRepository.findById(id);
    }

    public Iterable<Book> list() {
        return bookRepository.findAll();
    }

    @Transactional
    public void update(Book Book) {
        bookRepository.save(Book);
    }

    @Transactional
    public void delete(long id) {
        bookRepository.deleteById(id);
    }



}
