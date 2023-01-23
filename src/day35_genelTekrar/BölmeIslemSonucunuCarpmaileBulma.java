package day35_genelTekrar;

import java.util.Scanner;

public class BölmeIslemSonucunuCarpmaileBulma {
    public static void main(String[] args) {
        /*
        Kullanicidan bölünecek sayi ve bölecek  sayiyi alip
        bölme isleminin sonucunu ,carpma islemi ile bulan ve yazdiran bir method ile olusturun
        bu islemi kullanici q ya basincaya kadar devam ettirin

         */

        Scanner scan=new Scanner(System.in);
        boolean devamedelimmi=true;
        int bölünecekSayi=1;
        do {
            System.out.println("Lütfen Bölünecek Tamsayiyi Giriniz,\nbitirmek Icin Q ya basin: ");

            bölünecekSayi= scan.nextInt();

        }while (devamedelimmi);
    }
}
