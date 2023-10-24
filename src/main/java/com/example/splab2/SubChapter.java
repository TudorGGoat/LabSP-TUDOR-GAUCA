package com.example.splab2;

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
        return "ro.uvt.info.splab.SubChapter{" +
                "name='" + name + '\'' +
                '}';
    }
}
