package com.example.homework_421;

import android.graphics.drawable.Drawable;

public class ItemData {

    private Drawable image;
    private String title;
    private String subtitle;

    public ItemData(int image, String title, String subtitle) {
        this.image = image;
        this.title = title;
        this.subtitle = subtitle;
    }

    public Drawable getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public String getSubtitle() {
        return subtitle;
    }

}
