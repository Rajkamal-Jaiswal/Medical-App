package com.example.aaramidecal.Models;

public class DoctorProfileItem {

    private String image_sympton;
    private String sympton_name;

    public DoctorProfileItem(String image_sympton, String sympton_name) {
        this.image_sympton = image_sympton;
        this.sympton_name = sympton_name;
    }

    public String getImage_sympton() {
        return image_sympton;
    }

    public String getSympton_name() {
        return sympton_name;
    }
}
