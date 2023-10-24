package com.example.splab2;

import java.util.concurrent.TimeUnit;

public class Image implements Element{
    private String url;
    
    public Image(String name) {
        String imageName = name;
        try {
            TimeUnit TimeUnit = null;
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Image{" +
                "url='" + url + '\'' +
                '}';
    }
}
