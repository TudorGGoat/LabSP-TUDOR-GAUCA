package com.example.splab2.example.controllers;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitter;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;
import com.example.splab2.model.Book;
import com.example.splab2.persistence.BooksRepository;
import com.example.splab2.services.AllBooksSubject;
import com.example.splab2.services.NewBookRequest;
import com.example.splab2.services.SseObserver;

@RestController
@RequestMapping("/books-sse")
public class BooksSseController {

    private  AllBooksSubject allBooksSubject;

    private final BooksRepository booksRepository;

    public BooksSseController(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }

    @GetMapping
    public ResponseBodyEmitter getBooksSse() {
        final SseEmitter emitter = new SseEmitter(0L);
        allBooksSubject.registerObserver(new SseObserver(emitter));
        return emitter;
    }

    @PostMapping
    public String newBook(@RequestBody NewBookRequest newBookRequest) {
        Book book = createBook(newBookRequest);
        book = booksRepository.save(book);
        allBooksSubject.add(book);
        return "Book saved [" + book.getId() + "] " + book.getTitle();
    }

    private Book createBook(NewBookRequest newBookRequest) {
        return null;
    }


}
