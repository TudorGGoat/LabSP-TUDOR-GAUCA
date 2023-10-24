package com.example.splab2;

public class Section implements Element{
    private String title;

    public Section(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Section{" +
                "title='" + title + '\'' +
                '}';
    }
}
