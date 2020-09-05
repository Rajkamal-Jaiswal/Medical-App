package com.example.aaramidecal.Models;

import android.graphics.drawable.Drawable;

public class testLabItem {

    private String belong;
    private String btn_gender;
    private int backImg;

    public testLabItem(String  belong, String btn_gender, int backImg) {
        this.belong = belong;
        this.btn_gender = btn_gender;
        this.backImg = backImg;
    }

    public String getBelong() {
        return belong;
    }

    public String getBtn_gender() {
        return btn_gender;
    }

    public int getBackImg() {
        return backImg;
    }
}
