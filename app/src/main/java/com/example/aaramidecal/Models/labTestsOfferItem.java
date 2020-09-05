package com.example.aaramidecal.Models;

public class labTestsOfferItem {

    private String healthCheckup;
    private String newPrice;
    private String testCare;
    private String oldPrice;
    private String noOfTests;

    public labTestsOfferItem(String healthCheckup, String newPrice, String testCare, String oldPrice, String noOfTests) {
        this.healthCheckup = healthCheckup;
        this.newPrice = newPrice;
        this.testCare = testCare;
        this.oldPrice = oldPrice;
        this.noOfTests = noOfTests;
    }

    public String getHealthCheckup() {
        return healthCheckup;
    }

    public String getNewPrice() {
        return newPrice;
    }

    public String getTestCare() {
        return testCare;
    }

    public String getOldPrice() {
        return oldPrice;
    }

    public String getNoOfTests() {
        return noOfTests;
    }
}
