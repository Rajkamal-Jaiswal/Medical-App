package com.example.aaramidecal.Models;

public class DoctorsDetailsProfileModel {

    private int image;
    private String docName;
    private String doc_specialist;
    private String docExp;
    private String doc_marksheet;
    private String doc_degree;
    private String address;
    private String docFee;

    public int getImage() {
        return image;
    }

    public String getDocName() {
        return docName;
    }

    public String getDoc_specialist() {
        return doc_specialist;
    }

    public String getDocExp() {
        return docExp;
    }

    public String getDoc_marksheet() {
        return doc_marksheet;
    }

    public String getDoc_degree() {
        return doc_degree;
    }

    public String getAddress() {
        return address;
    }

    public String getDocFee() {
        return docFee;
    }

    public DoctorsDetailsProfileModel(int image, String docName, String doc_specialist, String docExp, String doc_marksheet, String doc_degree, String address, String docFee) {
        this.image = image;
        this.docName = docName;
        this.doc_specialist = doc_specialist;
        this.docExp = docExp;
        this.doc_marksheet = doc_marksheet;
        this.doc_degree = doc_degree;
        this.address = address;
        this.docFee = docFee;


    }
}
