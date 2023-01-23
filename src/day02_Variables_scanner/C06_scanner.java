package day02_Variables_scanner;

import java.util.Scanner;

public class C06_scanner {
    public static void main(String[] args) {
        /*Kullanicidan bir sayi isteyin
        ve sayinin karesini yazdirin */

        System.out.println("Karesi alinacak sayiyi girin" );


        Scanner scan= new Scanner(System.in);


        double GirilenSayi = scan.nextDouble();
        System.out.println("Girilen Sayi Sonucu: "+GirilenSayi*GirilenSayi);




    }
}
