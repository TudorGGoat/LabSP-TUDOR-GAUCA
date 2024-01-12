package com.example.splab2.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.splab2.command.CreateBookCommand;
import com.example.splab2.model.*;
import com.example.splab2.persistence.BooksRepository;

@RestController
@RequestMapping("/api/books")
public class BooksController {

    private final BooksRepository booksRepository;

    @Autowired
    public BooksController(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }

    @PostMapping
    public Book createBook(@RequestBody CreateBookCommand command) {
        Book book = new Book();
        // Set properties on book using command

        // Save the book using the repository
        book = booksRepository.save(book);

        return book;
    }
}
