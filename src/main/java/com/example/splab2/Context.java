package com.example.splab2;

public class Context {
    private int pageWidth=156;

    public Context() {
    }

    public Context(int pageWidth) {
        this.pageWidth = pageWidth;
    }

    public int getPageWidth() {
        return pageWidth;
    }

    public void setPageWidth(int pageWidth) {
        this.pageWidth = pageWidth;
    }
}