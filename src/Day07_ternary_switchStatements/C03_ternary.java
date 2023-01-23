package Day07_ternary_switchStatements;

import java.util.Scanner;

public class C03_ternary {
    public static void main(String[] args) {

        // input olarak verilen sayiyi kontrol edip
        // sayi cift ise "cift sayi"
        // degilse "tek sayi" yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Bir Sayi Giriniz..");
        int sayi= scan.nextInt();

        // if else ile yapalim
        if (sayi%2==0){
            System.out.println("Sayi Cifttir");
        }else System.out.println("Sayi Tek Sayidir");

        //ternary ile yapalim..

        System.out.println(sayi%2==0 ? "Cift Sayi" : "Tek Sayi");
    }
}
