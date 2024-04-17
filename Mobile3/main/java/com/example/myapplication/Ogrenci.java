package com.example.myapplication;

import java.io.Serializable;

public class Ogrenci implements Serializable {
    private int no;
    private String ismi;
    private double not;

    public int getNo() {
        return no;
    }

    public String getIsmi() {
        return ismi;
    }

    public double getNot() {
        return not;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public void setIsmi(String ismi) {
        this.ismi = ismi;
    }

    public void setNot(double not) {
        this.not = not;
    }

    public Ogrenci(int no, String ismi, double not) {
        this.no = no;
        this.ismi = ismi;
        this.not = not;


    }
}
