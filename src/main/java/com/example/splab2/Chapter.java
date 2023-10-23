package com.example.splab2;

import java.util.List;

public class Chapter {
    private Long id;
    private String title;
    private Book book;
    private List<Chapter> subChapters;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Chapter(Long id) {
        this.id = id;
    }

    private Chapter parentChapter; // Self-referencing relationship
    // Other chapter-related properties and methods
}
