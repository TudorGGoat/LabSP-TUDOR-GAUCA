package com.example.splab2;

import java.util.List;

import java.util.ArrayList;

public class Book{
    private String title;
    private List <Author> authorList = new ArrayList<Author>();
    private List <Element> elementsList = new ArrayList<Element>();

    public Book(String title) {
        this.title = title;
    }
    public void addAuthor(Author author){
        authorList.add(author);
    }
    public void addContent(Element element){
        elementsList.add(element);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Author> getAuthorList() {
        return authorList;
    }

    public void setAuthorList(List<Author> authorList) {
        this.authorList = authorList;
    }

    public List<Element> getElementsList() {
        return elementsList;
    }

    public void setElementsList(List<Element> elementsList) {
        this.elementsList = elementsList;
    }

    public void print(){
        System.out.println(title);
        authorList.forEach(e -> e.print());
        elementsList.forEach(e -> e.print());
    }
}
