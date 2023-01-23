package Day07_ternary_switchStatements;

import java.util.Scanner;

public class C02_ifElseif {
    public static void main(String[] args) {
        /*Kullanicidan bir tam sayi alin
        Sayi negatif ise "Negatif Sayi"
        Sayi rakam ise "Girilen Sayi Rakamdir"
        Sayi iki basamakli ise "Girilen Sayi Iki Basamakli"
        Sayi iki basamaktan büyük ise "Büyük SAyi yazdirin"
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Bir Tam Sayi giriniz: ");

        int sayi=scan.nextInt();

        System.out.println(sayi<0 ? "Negatif Sayi" :sayi<10 ? "Rakam" :sayi>10 ? "Girilen Sayi iki Basamaklidir.."
                :sayi>99 ? "Girilen Sayi Büyüktür..": "Gecersiz Girisi");






    }
}
