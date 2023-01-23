package zzzzzzzzzzzzzzzzz;

import java.util.Scanner;

public class günde_kac_saat_uyuyorsun {
    public static void main(String[] args) {

        /*
        Kullanicidan aldigimiz "günde kac saat Uyuyorsun" bilgisini kullanarak toplam uykuda gecen
        süreleri yazdiralim

         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Günlük kac Saat uyudugunuzu giriniz: ");

        double uykuSaati=scan.nextDouble();

        double aylikuyku=30*uykuSaati/24;
        double yillikuyku=365*uykuSaati/24;
        double ömürlükuyku=365*uykuSaati*60/24;

        System.out.println("Ayda " + aylikuyku +  " gününüz uykuda geciyor");
        System.out.println("Yilda " + yillikuyku + " gününüz uykuda geciyor..");
        System.out.println("60 yillik Ömrünüzde " + (ömürlükuyku/365 )+ " yil uykuda geciyor");




    }
}
