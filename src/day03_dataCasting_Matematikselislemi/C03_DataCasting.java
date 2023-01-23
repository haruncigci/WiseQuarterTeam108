package day03_dataCasting_Matematikselislemi;

import java.util.Scanner;

public class C03_DataCasting {
    public static void main(String[] args) {
        System.out.println(28/5); //5
        System.out.println(29/5); //5
        //Java bir bölme isleminde 2 int isleme giriyorsa sonucu int olarak verir.

        int sayi1=25;
        int sayi2=6;

        System.out.println(sayi1/sayi2); //4
        double dbl=6; //4.1666

        System.out.println(sayi1/dbl);   //4.26

        //Kullanicidan 2 tamsayi alin
        //1.tamsayiyi 2. ye bölüp ondalik olarak yazdirin

        Scanner scan =new Scanner(System.in);
        System.out.println("Birinci Tam Sayi Degerini Giriniz:");

        int tamSayi=scan.nextInt();

        System.out.println("Ikinci Tam Sayi Degerini Giriniz: ");

        int tamsayi=scan.nextInt();

        System.out.println("Islem Sonucu: "+(double)tamSayi/tamsayi);
        //herhangi bir sayinin yanina double yazarsak cikan sonuc ondalikli gösterilir



    }
}
