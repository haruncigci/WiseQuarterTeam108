package day03_dataCasting_Matematikselislemi;

import java.util.Scanner;

public class C06_DataCasting {
    public static void main(String[] args) {
        /*
        Kullanicidan bir double bir tam sayi alin
        double sayiyi ikinci sayiya bölün
        ve bölüm isleminin sonucunu tamsayi kismini yazdirin
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir ondalikli sayi Girin: ");
        double dbl=scan.nextDouble();
        System.out.println("Lütfen bir tamsayi Giriniz: ");
        int tamSayi= scan.nextInt();
        System.out.println("isleminizin Sonucu: "+ dbl/tamSayi);//sonucu double olarak yazar.
        System.out.println("isleminizin Sonucu: "+ (int)(dbl/tamSayi));


    }
}
