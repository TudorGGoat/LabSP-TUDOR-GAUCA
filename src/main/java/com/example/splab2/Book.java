package com.example.splab2;

import java.util.ArrayList;
import java.util.List;
public class Book extends Section{
    private ArrayList<Author> authors=new ArrayList<>();
    public Book(String title) {
        super(title);
    }

    public void addAuthor(Author author){
        authors.add(author);
    }

    public void addContent(Element element){
        super.add(element);
    }

}