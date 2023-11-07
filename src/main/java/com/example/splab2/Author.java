package com.example.splab2;

import java.util.List;

public class Author{
    private String name;

    public Author(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void print() {
        System.out.print("Authors: ");
        System.out.println(name);
    }
}
