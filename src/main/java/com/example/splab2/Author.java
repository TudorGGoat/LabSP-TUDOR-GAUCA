package com.example.splab2;

import java.util.List;

public class Author {
    private String name;
    private String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname=surname;
    }

    public void print() {

        System.out.println("Name: " + name + ", surname: " + surname);
    }
}
}
