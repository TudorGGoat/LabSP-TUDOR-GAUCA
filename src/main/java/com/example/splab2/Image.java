package com.example.splab2;

public class Image {
    private String imageName;
    private void print(){

    }

    public Image(String imageName) {
        this.imageName = imageName;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    @Override
    public String toString() {
        return "Image{" +
                "imageName='" + imageName + '\'' +
                '}';
    }
}
