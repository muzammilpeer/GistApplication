package com.muzammilpeer.gistapplication;

/**
 * Created by muzammilpeer on 22/07/2015.
 */

public class ViewModel {
    private String text;
    private String image;

    public ViewModel(String text, String image) {
        this. text = text;
        this.image = image;
    }

    public String getText() {
        return text;
    }

    public String getImage() {
        return image;
    }
}