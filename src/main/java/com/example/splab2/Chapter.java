package com.example.splab2;

import java.util.List;

public class Chapter {
    private String name;
    private List<Paragraph> paragraphList;

    public Chapter(String name) {
        this.name = name;

    }
    public void addParagraph(String pText) {
        Paragraph paragraph = new Paragraph(pText);
        paragraphList.add(paragraph);
    }
    public void print() {
        System.out.println(name);
    }
}

