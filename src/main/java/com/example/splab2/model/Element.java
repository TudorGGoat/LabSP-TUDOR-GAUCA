package com.example.splab2.model;

import com.example.splab2.services.Visitor;
public interface Element {
    void print();
    void add(Element element);
    void remove(Element element);
    Element get(int id);
    void accept(Visitor v);
}
