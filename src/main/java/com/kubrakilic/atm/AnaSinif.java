package com.kubrakilic.atm;

import com.kubrakilic.atm.atmislemler.AtmIslemlerImplBireyselMusteri;
import com.kubrakilic.atm.atmislemler.AtmIslemlerImplKurumsalMusteri;
import com.kubrakilic.atm.musteri.BireyselMusteri;
import com.kubrakilic.atm.musteri.KurumsalMusteri;
import com.kubrakilic.atm.musteri.Musteri;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AnaSinif {
    public static void main(String[] args) {

        Musteri bireyselMusteri1 = new BireyselMusteri();
        ((BireyselMusteri)bireyselMusteri1).setTcNo("14203348556");
        bireyselMusteri1.setMusteriNo("111");
        ((BireyselMusteri)bireyselMusteri1).setAdSoyad("Kübra Kılıç");
        bireyselMusteri1.setHesapBakiyesi(7000.00);
        ((BireyselMusteri)bireyselMusteri1).setEvAdresi("Cumhuriyet Mahallesi No:10");
        System.out.println("TC No:" + ((BireyselMusteri)bireyselMusteri1).getTcNo() + " -- " + "Müşteri No: " + bireyselMusteri1.getMusteriNo() + " -- " + "Adı Soyadı: " + ((BireyselMusteri)bireyselMusteri1).getAdSoyad());


        BireyselMusteri bireyselMusteri2 = new BireyselMusteri();
        bireyselMusteri2.setTcNo("90382786514");
        bireyselMusteri2.setMusteriNo("222");
        bireyselMusteri2.setAdSoyad("Hilal Kara");
        bireyselMusteri2.setHesapBakiyesi(6000.00);
        bireyselMusteri2.setEvAdresi("Karaca Sokak No:5");
        System.out.println("TC No:" + bireyselMusteri2.getTcNo() + " -- " + "Müşteri No: " + bireyselMusteri2.getMusteriNo() + " -- " + "Adı Soyadı: " + bireyselMusteri2.getAdSoyad());

        BireyselMusteri bireyselMusteri3 = new BireyselMusteri();
        bireyselMusteri3.setTcNo("13579012678");
        bireyselMusteri3.setMusteriNo("333");
        bireyselMusteri3.setAdSoyad("Büşra Pekcan");
        bireyselMusteri3.setHesapBakiyesi(3000.00);
        bireyselMusteri3.setEvAdresi("Fikret Sokak No:25");
        System.out.println("TC No:" + bireyselMusteri3.getTcNo() + " -- " + "Müşteri No: " + bireyselMusteri3.getMusteriNo() + " -- " + "Adı Soyadı: " + bireyselMusteri3.getAdSoyad());

        KurumsalMusteri kurumsalMusteri1 = new KurumsalMusteri();
        kurumsalMusteri1.setVergiNo("1234567890");
        kurumsalMusteri1.setMusteriNo("101");
        kurumsalMusteri1.setSirketAdi("Testinium");
        kurumsalMusteri1.setHesapBakiyesi(80000.00);
        System.out.println("Vergi No:" + kurumsalMusteri1.getVergiNo() + " -- " + "Müşteri No: " + kurumsalMusteri1.getMusteriNo() + " -- " + "Şirket Adı: " + kurumsalMusteri1.getSirketAdi());

        KurumsalMusteri kurumsalMusteri2 = new KurumsalMusteri();
        kurumsalMusteri2.setVergiNo("9087654321");
        kurumsalMusteri2.setMusteriNo("102");
        kurumsalMusteri2.setSirketAdi("Doğuş Holding");
        kurumsalMusteri2.setHesapBakiyesi(300000.00);
        System.out.println("Vergi No:" + kurumsalMusteri2.getVergiNo() + " -- " + "Müşteri No: " + kurumsalMusteri2.getMusteriNo() + " -- " + "Şirket Adı: " + kurumsalMusteri2.getSirketAdi());

        Map<String,Musteri> musterilerMap = new HashMap<>();
        musterilerMap.put("111",bireyselMusteri1);
        musterilerMap.put("222",bireyselMusteri2);
        musterilerMap.put("333", bireyselMusteri3);
        musterilerMap.put("101", kurumsalMusteri1);
        musterilerMap.put("102", kurumsalMusteri2);

        System.out.println("------------------------------------------------------------");

        for(Map.Entry musteri : musterilerMap.entrySet()){
            System.out.println("Müşteri No: " + musteri.getKey() + " -- " + "Müşteri: " + musteri.getValue());
        }

        System.out.println("------------------------------------------------------------");

        AtmIslemlerImplBireyselMusteri atmIslemlerImplBireyselMusteri = new AtmIslemlerImplBireyselMusteri();
        atmIslemlerImplBireyselMusteri.paraCek("111");
        atmIslemlerImplBireyselMusteri.paraYatir("111");

        System.out.println("------------------------------------------------------------");

        atmIslemlerImplBireyselMusteri.paraYatir("333");
        atmIslemlerImplBireyselMusteri.paraCek("333");

        System.out.println("------------------------------------------------------------");

        atmIslemlerImplBireyselMusteri.paraCek("222");
        atmIslemlerImplBireyselMusteri.paraYatir("222");

        System.out.println("------------------------------------------------------------");

        AtmIslemlerImplKurumsalMusteri atmIslemlerImplKurumsalMusteri = new AtmIslemlerImplKurumsalMusteri();
        atmIslemlerImplKurumsalMusteri.paraCek("102");
        atmIslemlerImplKurumsalMusteri.paraYatir("102");

        System.out.println("------------------------------------------------------------");
        atmIslemlerImplKurumsalMusteri.paraCek("101");
        atmIslemlerImplKurumsalMusteri.paraYatir("101");

        System.out.println("------------------------------------------------------------");


        Scanner scannerRakam = new Scanner(System.in);
        System.out.println("Para Yatırma İşlemi için 1 Para Çekme İşlemi 2: ");

        int kullanicidanAlinanRakam = scannerRakam.nextInt();
        System.out.println("Kullanıcıdan Alınan Rakam: " + kullanicidanAlinanRakam);

        if (kullanicidanAlinanRakam == 1){
            System.out.println("Para Yatırma İşlemleri için Yönlendiriliyorsunuz");
            atmIslemlerImplBireyselMusteri.paraYatir("111");
            atmIslemlerImplKurumsalMusteri.paraYatir("101");
        }
        if(kullanicidanAlinanRakam == 2){
            System.out.println("Para Çekme İşlemleri için Yönlendiriliyorsunuz");
            atmIslemlerImplBireyselMusteri.paraCek("222");
            atmIslemlerImplKurumsalMusteri.paraCek("102");
        }


        System.out.println("------------------------------------------------------------");

        Scanner scannerMusteriNo = new Scanner(System.in);
        System.out.println("Müşteri numarasını giriniz: ");

        String musteriNo = scannerMusteriNo.nextLine();
        System.out.println("Müşteri No: " + musteriNo);

        switch (musteriNo){
            case "111":
                System.out.println("Bireysel Müşteri ");
                System.out.println("Müşter No: " + musteriNo + " TC No: " + ((BireyselMusteri) bireyselMusteri1).getTcNo() + " Adı Soyadı: " + ((BireyselMusteri) bireyselMusteri1).getAdSoyad() + " Ev Adresi: " + ((BireyselMusteri) bireyselMusteri1).getEvAdresi() + " Hesap Bakiyesi: " + bireyselMusteri1.getHesapBakiyesi() );
                break;
            case "222":
                System.out.println("Bireysel Müşteri ");
                System.out.println("Müşteri No: "+ musteriNo + " TC No: " + bireyselMusteri2.getTcNo() + " Adı Soyadı: " + bireyselMusteri2.getAdSoyad() + " Ev Adresi: " +bireyselMusteri2.getEvAdresi() + " Hesap Bakiyesi: " + bireyselMusteri2.getHesapBakiyesi());
                break;
            case "333":
                System.out.println("Bireysel Müşteri ");
                System.out.println("Müşteri No: "+ musteriNo + " TC No: " + bireyselMusteri3.getTcNo() + " Adı Soyadı: " + bireyselMusteri3.getAdSoyad() + " Ev Adresi: " +bireyselMusteri3.getEvAdresi() + " Hesap Bakiyesi: " + bireyselMusteri3.getHesapBakiyesi());
                break;
            case "101":
                System.out.println("Kurumsal Müşteri ");
                System.out.println("Müşteri No: "+ musteriNo + " Vergi No: " + kurumsalMusteri1.getVergiNo() + " Şirket Adı: " + kurumsalMusteri1.getSirketAdi() + " Hesap Bakiyesi: " + kurumsalMusteri1.getHesapBakiyesi());
                break;
            case "102":
                System.out.println("Kurumsal Müşteri ");
                System.out.println("Müşteri No: "+ musteriNo + " Vergi No: " + kurumsalMusteri1.getVergiNo() + " Şirket Adı: " + kurumsalMusteri1.getSirketAdi() + " Hesap Bakiyesi: " + kurumsalMusteri1.getHesapBakiyesi());
                break;
            default:
                System.out.println("Girdiğiniz müşteri numarasına sahip Müşteri bulunmamaktadır..");
                break;
        }

    }
}
