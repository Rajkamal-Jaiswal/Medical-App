package com.example.aaramidecal.ui.models;

public class MyDoctorData {

    private int image;
    private String docName;
    private String address;

    public MyDoctorData(int image, String docName, String address) {
        this.image = image;
        this.docName = docName;
        this.address = address;
    }

    public int getImage() {
        return image;
    }

    public String getDocName() {
        return docName;
    }

    public String getAddress() {
        return address;
    }
}
