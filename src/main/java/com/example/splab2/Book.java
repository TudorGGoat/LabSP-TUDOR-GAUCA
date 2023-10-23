package com.example.splab2;

import java.util.List;

public class Book {

    private Long id;
    private String title;


    private List<Author> authors;
    private List<Chapter> chapters;
    public Book() {
        // Default constructor
    }

    public Book(String title) {
        this.title = title;
    }


    public void addAuthor(Author author) {
    }

    public int createChapter(String s) {
    }

    public Chapter getChapter(int indexChapterOne) {
    }
}