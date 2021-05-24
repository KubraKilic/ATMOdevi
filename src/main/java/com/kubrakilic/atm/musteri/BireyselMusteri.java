package com.kubrakilic.atm.musteri;

public class BireyselMusteri extends Musteri{
    private String tcNo;     //üzerinde işlem yapmayacağım için String tanımladım
    private String adSoyad;
    private String evAdresi;

    public BireyselMusteri(){
        System.out.println("BireyselMusteri sınıfından nesne yaratıldı ");
    }

    public BireyselMusteri(String tcNo, String adSoyad, String evAdresi) {
        this.tcNo = tcNo;
        this.adSoyad = adSoyad;
        this.evAdresi = evAdresi;
    }


    public String getTcNo() {
        return tcNo;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getEvAdresi() {
        return evAdresi;
    }

    public void setEvAdresi(String evAdresi) {
        this.evAdresi = evAdresi;
    }

}
