package zzzzzzzzzzzzzzzzz;

import java.util.Scanner;

public class ternary {
    public static void main(String[] args) {
        /*
        Ternary
        Kosul ? birinci : ikinci
             Bir kosul var ve birde bu kosulun aksi durumu varsa kisa kodlarda bunu kullanabiliriz


        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Bir Deger Giriniz: ");
        int sayi=scan.nextInt();

        String isim="";

        isim=sayi>20 ?
                    (sayi>50 ? "Fatma":"hatice")
                    :"Ayse";



        System.out.println(isim);


        Kullanicidan almis oldgunuz 2 sayiyi farkli sayidan büyük olan sayiyi "ternary " kullanarak
        bulan bir program yazalim


        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen ilk Sayiyi Giriniz: ");
        int sayi1=scan.nextInt();
        System.out.println("Lütfen ikinci Sayiyi Giriniz: ");
        int sayi2=scan.nextInt();

        String büyükOlan="";

        büyükOlan=sayi1==sayi2 ? "Girilen Sayilar Esittir"
                                : sayi1>sayi2 ? "Girilen Ilk Sayi Büyüktür " + sayi1
                                : "Girilen Ikinci Sayi Büyüktür " + sayi2;

        System.out.println(büyükOlan);

         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Vize Notunuzu Giriniz: ");
        int vize=scan.nextInt();
        System.out.println("Lütfen Final Notunuzu Giriniz: ");
        int finalSonucu=scan.nextInt();

        int notOrtalamasi=(vize*40/100)+(finalSonucu*60/100);
        String harfNotu="";

        harfNotu= notOrtalamasi<=40 ? "Not Ortalamaniz : FF kaldiniz"
                                    :notOrtalamasi<=50 ? "Not Ortalamaniz :  DD Sinirda gectiniz"
                                    :notOrtalamasi<=60 ? "Not Ortalamaniz: CC "
                                    :notOrtalamasi<=70 ? "Not ortalamaniz : BB"
                                    :notOrtalamasi<=80 ? "Not Ortalamaniz : BA"
                                    :notOrtalamasi<=100 ? "Not Ortalamaniz : AA": "Gecersiz Not Girisi";
        System.out.println(harfNotu);







    }
}
