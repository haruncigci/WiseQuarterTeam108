package zzzzzzzzzzzzzzzzz;

import java.util.Scanner;

public class Kullanici_Adi_Sifre_örnegi {
    public static void main(String[] args) {
        /*
        Kullanicidan Girmis oldugu Kullanici Adi ve Sifre
        bilgilerini kontrol ederek sisteme giris yapip yapamadigini kontrol eden
        bir program yaziniz

         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Kullanici Adinizi Giriniz: ");
        String kullaniciAdi=scan.next();
        System.out.println("Lütfen Sifrenizi Giriniz: ");
        String sifre=scan.next();

        if (kullaniciAdi.equalsIgnoreCase("admin")&&(sifre.equals("12345"))){
            System.out.println("Giris Basarili..");
        }
        if (!kullaniciAdi.equals("admin")){
            System.out.println("Kullanici Adinizi Hatali Girdiniz..");
        }
        if (!sifre.equals("12345")){
            System.out.println("Sifrenizi Hatali Girdiniz..");
        }
    }
}
