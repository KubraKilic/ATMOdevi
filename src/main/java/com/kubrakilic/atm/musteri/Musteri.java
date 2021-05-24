package com.kubrakilic.atm.musteri;

public class Musteri {
    private String musteriNo;
    private double hesapBakiyesi;

    public Musteri() {
        System.out.println("Musteri sınıfından nesne yaratıldı");
    }

    public Musteri(String musteriNo, double hesapBakiyesi) {
        this.hesapBakiyesi = hesapBakiyesi;
    }


    public String getMusteriNo() {
        return musteriNo;
    }

    public void setMusteriNo(String musteriNo) {
        this.musteriNo = musteriNo;
    }

    public double getHesapBakiyesi() {
        return hesapBakiyesi;
    }

    public void setHesapBakiyesi(double hesapBakiyesi) {
        this.hesapBakiyesi = hesapBakiyesi;
    }

}
