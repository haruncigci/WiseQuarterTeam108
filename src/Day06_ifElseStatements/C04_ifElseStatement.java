package Day06_ifElseStatements;

import java.util.Scanner;

public class C04_ifElseStatement {
    public static void main(String[] args) {
        /*
        Soru 4 Kullanicidan bir karakter girmesini isteyin,
        Girilen karakterin büyük harf olup olmadini yazdirin
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen Bir Karakter Giriniz: ");
        char girilenKarakter = scan.next().charAt(0);

        if (girilenKarakter >= 'A' && girilenKarakter <= 'Z') {
            System.out.println("girilen karakter büyük degil");
        } else {
            System.out.println("Girilen Karakter Büyük Degil");
        }
    }
}
