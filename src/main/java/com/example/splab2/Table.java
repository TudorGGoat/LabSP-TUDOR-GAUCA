package com.example.splab2;

public class Table {

    private Long id;
    private String tableContent;

    @Override
    public String toString() {
        return "Table{" +
                "id=" + id +
                ", tableContent='" + tableContent + '\'' +
                ", subChapter=" + subChapter +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Table(Long id) {
        this.id = id;
    }

    private SubChapter subChapter;
    // Other table-related properties and methods
}
