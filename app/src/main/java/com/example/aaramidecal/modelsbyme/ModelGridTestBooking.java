package com.example.aaramidecal.modelsbyme;

import android.widget.ImageView;

public class ModelGridTestBooking {
    int imageres;
    String title;
    String subtitle;

    public ModelGridTestBooking(int imageres, String title, String subtitle) {
        this.imageres = imageres;
        this.title = title;
        this.subtitle = subtitle;
    }

    public int getImageres() {
        return imageres;
    }

    public String getTitle() {
        return title;
    }

    public String getSubtitle() {
        return subtitle;
    }
}
