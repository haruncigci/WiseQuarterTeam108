package zzzzzzzzzzzzzzzzz;

import java.util.Scanner;

public class ic_ice_if_Kullanimi_Asker_Örnegi {
    public static void main(String[] args) {
        /*
        Kullanicidan yas ve cinsiyet bilgisini Aliniz ve
        Askere gidip gidemeyecgini yazdiralim

         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Cinsiyetinizi Giriniz: ");

        String cinsiyet=scan.next();

        System.out.println("lütfen Yasinizi Giriniz: ");
        int yas=scan.nextInt();

        if (!cinsiyet.equalsIgnoreCase("Erkek")) System.out.println("Askere Gidemezsiniz..");
            if (yas<20) System.out.println("Askere Gitmek icin henüz yasiniz Kücük");
                if (cinsiyet.equalsIgnoreCase("Erkek")&& (yas>=20)&& (yas<=60)) System.out.println("Askerlik Subesine Gidip Kaydinizi Yaptirmalisiniz");





    }
}
