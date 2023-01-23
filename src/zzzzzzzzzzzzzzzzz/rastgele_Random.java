package zzzzzzzzzzzzzzzzz;

import java.util.Random;

public class rastgele_Random {
    public static void main(String[] args) {
        /*
        Rastgele bir sayi üreterek ,
        üretilen sayinin hangi aralikta oldugunu consola a yazdiran bir program olusturunuz.
        örnegin;
        rastgele sayi=15;
        sayi 0-25 araligindadir..

        Not:Rastgele sayi üretirkenRandom Classindan yararlanabiliriz
        Random rastgele= new Random();
        rastgele.nextInt(100);
         */
        Random rastgele=new Random();

        //int sayi=rastgele.nextInt(3); //0-2 arasinda sayilar kullanir, 3 ü kullanmaz
        int sayi=rastgele.nextInt(101);
        System.out.println(sayi);
        if(sayi<=25) System.out.println("Sayi 0-25 araligindadir");
        if(sayi>25 && sayi<=50) System.out.println("Sayi 25-50 araligindadir..");
        if (sayi>50) System.out.println("Sayi 50-100 araligindadir");




    }
}
