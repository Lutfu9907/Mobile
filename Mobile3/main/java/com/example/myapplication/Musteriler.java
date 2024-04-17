package com.example.myapplication;

import java.io.Serializable;

public class Musteriler implements Serializable {
    private int id;
    private String ad;
    private double odemesiGerekenRakam;

    public Musteriler(int id, String ad, double odemesiGerekenRakam) {
        this.id = id;
        this.ad = ad;
        this.odemesiGerekenRakam = odemesiGerekenRakam;
    }

    public int getId() {
        return id;
    }

    public String getAd() {
        return ad;
    }

    public double getOdemesiGerekenRakam() {
        return odemesiGerekenRakam;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public void setOdemesiGerekenRakam(double odemesiGerekenRakam) {
        this.odemesiGerekenRakam = odemesiGerekenRakam;
    }
}


