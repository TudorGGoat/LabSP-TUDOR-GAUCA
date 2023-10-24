package com.example.splab2;

import java.util.List;

public class Book extends Section{
    private String title;

    public Book(String title, String title1) {
        super(title);
        this.title = title1;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                '}';
    }

    public void addAuthor(Author rpGheo) {
    }

    public void addContent(Paragraph paragraph) {
    }
}
