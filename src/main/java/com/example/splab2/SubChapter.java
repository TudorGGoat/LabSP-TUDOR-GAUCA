package com.example.splab2;

import java.awt.*;
import java.util.List;
public class SubChapter {
    private String name;
    private void print(){

    }

    public SubChapter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "SubChapter{" +
                "name='" + name + '\'' +
                '}';
    }
}
