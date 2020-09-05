package com.example.aaramidecal;

public class MedicalItemList {

    private int imgIcon;
    private String medicineName;
    private String companyName;
    private String price;
    private String purchase;

    public MedicalItemList(int imgIcon, String medicineName, String companyName, String price, String purchase) {
        this.imgIcon = imgIcon;
        this.medicineName = medicineName;
        this.companyName = companyName;
        this.price = price;
        this.purchase = purchase;
    }

    public int getImgIcon() {
        return imgIcon;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getPrice() {
        return price;
    }

    public String getPurchase() {
        return purchase;
    }
}
