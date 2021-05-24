package com.kubrakilic.atm.atmislemler;


public class AtmIslemlerImplBireyselMusteri implements AtmIslemler{

    @Override
    public void paraYatir(String musteriNo) {
        double yatacakMiktarBireysel = 200.00;
        System.out.println("Müşteri No:  " + musteriNo + " olarak Bireysel Müşteri hesabınıza " +  yatacakMiktarBireysel + " TL yatırılıyor.");
        System.out.println("İşlemi reddetmek için ana menüye dön");
    }

    @Override
    public double paraCek(String musteriNo) {
        double paraCekilecekMiktarBireysel = 1000.00;
        System.out.println("Müşteri No:  " + musteriNo + " olarak Bireysel Müşteri hesabınızdan " +  paraCekilecekMiktarBireysel + " TL çekiliyor.");
        System.out.println("İşlemi reddetmek için ana menüye dön");
        return paraCekilecekMiktarBireysel;
    }
}
