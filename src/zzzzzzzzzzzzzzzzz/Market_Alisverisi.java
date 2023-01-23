package zzzzzzzzzzzzzzzzz;

import java.util.Scanner;

public class Market_Alisverisi {
    public static void main(String[] args) {
        /*
        Market alisverisi
        Kullanicidan almis oldugu ürün miktari üzerinden indirim yaparak
        ödemesi gereken toplam Tutari söyleyin
        eger aldigi üründen;
        1-10 arasi satin aldiysa %10,
        10-50 arasi satin aldiysa %20,
        50 ve üstü satin aldiysa %25 indirim yapalim

         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen aldiginiz ürünün miktarini Giriniz:  ");
        int miktar=scan.nextInt();

        System.out.println("Lütfen Aldiginiz Ürünün Fiyatini Giriniz: " );
        int fiyat=scan.nextInt();

        int tutar=miktar*fiyat;
        int yüzdeOn=tutar*90/100;
        int yüzdeYirmi=tutar*80/100;
        int yüzdeYirmiBes=tutar*75/100;

        if (miktar<10) System.out.println("Ödenmesi Gereken Normal Tutar: " + tutar + "\nÖdenmesi Gerekn Indirimli Tutar: " + yüzdeOn);
        if (miktar>=10 && miktar<50) System.out.println("Ödenmesi Gereken Normal Tutar: " + tutar + "\nÖdenmesi Gerekn Indirimli Tutar: " + yüzdeYirmi);
        if (miktar>=50) System.out.println("Ödenmesi Gereken Normal Tutar: " + tutar + "\nÖdenmesi Gerekn Indirimli Tutar: " + yüzdeYirmiBes);




    }
}
