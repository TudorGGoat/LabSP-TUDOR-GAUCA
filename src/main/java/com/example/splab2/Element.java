package com.example.splab2;

import lombok.Data;

import com.example.splab2.Visitor;
import java.util.concurrent.TimeUnit;

@Data
public interface Element {
    void print();
    void add(Element element);
    void remove(Element element);
    Element get(int id);
    void accept(Visitor v);
}
