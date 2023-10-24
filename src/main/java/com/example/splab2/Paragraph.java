package com.example.splab2;

public class Paragraph implements Element{
    private String text;

    public Paragraph(String text) {
        this.text = text;
    }
    @Override
    public void add(Element e) {

    }

    @Override
    public void remove(Element e) {

    }

    public void print() {
        System.out.println(text);
    }


}
