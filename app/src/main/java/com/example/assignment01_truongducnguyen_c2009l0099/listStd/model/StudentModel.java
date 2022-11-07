package com.example.assignment01_truongducnguyen_c2009l0099.listStd.model;

import android.text.TextUtils;

public class StudentModel {
    private String name;
    private String rollNumber;

    public StudentModel(String name, String rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public StudentModel() {
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

}
