package com.example.splab2;

import java.awt.*;
import java.util.List;
public class SubChapter extends Chapter {
    private Long id;
    private String title;

    @Override
    public String toString() {
        return "SubChapter{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", images=" + images +
                ", tables=" + tables +
                ", chapter=" + chapter +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public SubChapter(Long id, Long id1) {
        super(id);
        this.id = id1;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    private List<Image> images;

    public SubChapter(Long id) {
        super(id);
    }

    private List<Table> tables;
    private Chapter chapter;

    public void createNewParagraph(String s) {
    }

    public void createNewImage(String s) {
    }

    public void print() {
    }
    // Other sub-chapter-related properties and methods
}
