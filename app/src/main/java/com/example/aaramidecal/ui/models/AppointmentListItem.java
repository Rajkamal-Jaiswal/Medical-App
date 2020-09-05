package com.example.aaramidecal.ui.models;

public class AppointmentListItem {

    private int images;
    private String AppointDoctor;
    private String address;
    private String dateTime;

    public AppointmentListItem(int images, String appointDoctor, String address, String dateTime) {
        this.images = images;
        AppointDoctor = appointDoctor;
        this.address = address;
        this.dateTime = dateTime;
    }

    public int getImages() {
        return images;
    }

    public String getAppointDoctor() {
        return AppointDoctor;
    }

    public String getAddress() {
        return address;
    }

    public String getDateTime() {
        return dateTime;
    }
}
