package day02_Variables_scanner;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen Isminizi Giriniz: ");
        String girilenIsim = scan.nextLine();
        System.out.println("Lütfen Soyisminizi Giriniz: ");
        String soyIsim =scan.nextLine();
        System.out.println("Yasinizi Giriniz:" );
        int yas=scan.nextInt();
        System.out.println("\nIsminiz   :"+girilenIsim+
                           "\nSoyisminiz: "+soyIsim+
                            "\nYas      : "+yas+
                            "\nKaydiniz Basariyla Yapilmistir..");





    }
}
