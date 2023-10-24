package com.example.splab2;

public class Table {
    private String title;
    private void print(){

    }

    public Table(String title) {
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
        return "Table{" +
                "title='" + title + '\'' +
                '}';
    }
}
