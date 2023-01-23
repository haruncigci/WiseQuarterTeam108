package day02_Variables_scanner;

import java.util.Scanner;

public class C10_Scanner {
    public static void main(String[] args) {
        /* Kullanicidan bir double birde int sayi alip bunlarin toplamini ve carpimini yazdirin.

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Bir Double Sayi Girin");
        double sayiDbl= scan.nextDouble();
        System.out.println("Lütfen Bir Tam Sayi Girin : ");
        int sayiInt= scan.nextInt();

        System.out.println("Sayilarin Toplami: " + (sayiDbl*sayiInt));
        System.out.println("");


    }
}
