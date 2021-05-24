package com.kubrakilic.atm.musteri;

public class KurumsalMusteri extends Musteri{
    private String vergiNo;   //KurumsalMusteri'nin tcNo alanı olamayacağından vergiNo alanını ekledim
    private String sirketAdi;

    public KurumsalMusteri(){
        System.out.println("KurumsalMusteri sınıfından nesne yaratıldı");
    }

    public KurumsalMusteri(String vergiNo, String sirketAdi) {
        this.vergiNo = vergiNo;
        this.sirketAdi = sirketAdi;
    }


    public String getVergiNo() {
        return vergiNo;
    }

    public void setVergiNo(String vergiNo) {
        this.vergiNo = vergiNo;
    }

    public String getSirketAdi() {
        return sirketAdi;
    }

    public void setSirketAdi(String sirketAdi) {
        this.sirketAdi = sirketAdi;
    }
}
