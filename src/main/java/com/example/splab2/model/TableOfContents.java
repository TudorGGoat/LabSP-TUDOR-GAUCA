package com.example.splab2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import com.example.splab2.services.Visitor;


@Data
@Entity
public class TableOfContents implements Element{
    @Id
    private int id;
    private String something;

    @Override
    public void print() {
        System.out.println("Something: " + something);
    }

    @Override
    public void add(Element element) {

    }

    @Override
    public void remove(Element element) {

    }

    @Override
    public Element get(int id) {
        return null;
    }

    @Override
    public void accept(Visitor v) {
        v.visitTableOfContents(this);
    }
}