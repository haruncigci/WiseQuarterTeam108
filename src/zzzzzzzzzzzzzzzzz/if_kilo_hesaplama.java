package zzzzzzzzzzzzzzzzz;

import java.util.Scanner;

public class if_kilo_hesaplama {
    public static void main(String[] args) {
        /*
        Kullanicidan kilo ve boy bilgisini alarak vucut kitle endeksini hesaplayalim;
        vke <18.5 ise "Zayifsin, Kilo Almalisin " yazdiralim..
        18.5 <= vke <25 ise "ideal Kilodasiniz" yazdiralim..
        25 <=vke<30 ise "kilolusunuz, biraz egsersiz yapmalisiniz" yazdiralim..
        vke>30 ise "Obezlik,sagligina dikkat etmelisiniz.." yazdiralim

         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Boyunuzu metre cinsinden Giriniz: " );
        float boy= scan.nextFloat();
        System.out.println("Lütfen kilonuzu kg cinsinden Giriniz: ");
        float kilo=scan.nextFloat();

        float vke= kilo/(boy*boy);
        System.out.println("Vücut Kitle Endeksiniz: " + vke);

        if(vke<18.5) System.out.println("Zayifsin, Kilo Almalisin");
        if(vke>=18.5 && vke<25 ) System.out.println("ideal Kilodasiniz");
        if(vke>25 && vke<=30) System.out.println("kilolusunuz, biraz egsersiz yapmalisiniz");
        if(vke>30) System.out.println("Obezlik,sagligina dikkat etmelisiniz..");




    }
}
