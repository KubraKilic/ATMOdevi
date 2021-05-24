package com.kubrakilic.atm.atmislemler;


public class AtmIslemlerImplKurumsalMusteri implements AtmIslemler{

    @Override
    public void paraYatir(String musteriNo) {
        double yatacakMiktarKurumsal = 50000.00;
        System.out.println("Müşteri No:  " + musteriNo + " olarak Kurumsal Müşteri  hesabınıza " +  yatacakMiktarKurumsal + " TL yatırılıyor.");
        System.out.println("İşlemi reddetmek için ana menüye dön");
    }

    @Override
    public double paraCek(String musteriNo) {
        double paraCekilecekMiktarKurumsal = 1000.00;
        System.out.println("Müşteri No:  " + musteriNo + " olarak Kurumsal Müşteri  hesabınızdan " +  paraCekilecekMiktarKurumsal + " TL çekiliyor.");
        System.out.println("İşlemi reddetmek için ana menüye dön");
        return paraCekilecekMiktarKurumsal;
    }
}
