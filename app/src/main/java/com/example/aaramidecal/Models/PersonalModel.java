package com.example.aaramidecal.Models;

public class PersonalModel {

    private String name;
    private String contact;
    private String email;
    private String gender;
    private String dob;
    private String blood;
    private String status;
    private String height;
    private String weight;
    private String emrcontact;
    private String location;

    public PersonalModel(String name, String contact, String email, String gender, String dob, String blood, String status, String height, String weight, String emrcontact, String location) {
        this.name = name;
        this.contact = contact;
        this.email = email;
        this.gender = gender;
        this.dob = dob;
        this.blood = blood;
        this.status = status;
        this.height = height;
        this.weight = weight;
        this.emrcontact = emrcontact;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public String getContact() {
        return contact;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public String getDob() {
        return dob;
    }

    public String getBlood() {
        return blood;
    }

    public String getStatus() {
        return status;
    }

    public String getHeight() {
        return height;
    }

    public String getWeight() {
        return weight;
    }

    public String getEmrcontact() {
        return emrcontact;
    }

    public String getLocation() {
        return location;
    }
}
