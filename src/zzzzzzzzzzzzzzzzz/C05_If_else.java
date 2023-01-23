package zzzzzzzzzzzzzzzzz;

import java.util.Scanner;

public class C05_If_else {
    public static void main(String[] args) {
        /*Kullanicidan bir tam sayi alin
        Sayi rakam ise "Girilen Sayi Rakamdir"
        Sayi iki basamakli ise "Girilen Sayi Iki Basamakli"
        Sayi iki basamaktan büyük ise "Büyük SAyi yazdirin"
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("LÜtfen Bir Tam Sayi Degeri Giriniz: ");

        int sayi=scan.nextInt();

        if (sayi>= 0 && sayi<10){
            System.out.println("Girilen Sayi Rakamdir..");

        } else if (sayi>=10 && sayi<=99) {
            System.out.println("Girilen Sayi iki Basamaklidir..");

        }else if (sayi>=100) System.out.println("Girilen Sayi Büyüktür..");
        else System.out.println("Girilen sayi Negatiftir.");


    }

}
