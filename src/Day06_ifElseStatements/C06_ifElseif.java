package Day06_ifElseStatements;

import java.util.Scanner;

public class C06_ifElseif {
    public static void main(String[] args) {

        //Soru 1- Kullanicidan cinsiyetini ve yasini alin,
        //Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
        //Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin” veya
        //“Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.


        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Cinsiyetinizi Giriniz\nK:Kadin, \nE:Erkek ");
        char cinsiyet = scan.next().charAt(0);
        System.out.println("Lütfen Yasinizi Giriniz: ");
        int yas = scan.nextInt();

        if ((cinsiyet == 'K' || cinsiyet == 'k') && yas >= 60 && yas < 95) {
            System.out.println("Emekli Olabilir");
        } else if ((cinsiyet == 'K' || cinsiyet == 'k') && yas > 18) {
            System.out.println("Emekli olmak icin" + (60 - yas) + "yil daha calismalisiniz");
        } else if ((cinsiyet == 'E' || cinsiyet == 'e') && yas > 65 && yas > 95) {
            System.out.println("Emekli Olabilir");
        } else if (cinsiyet == 'E' || cinsiyet == 'e' && yas > 18) {
            System.out.println("Emekli olabilmek icin " + (65 - yas) + " kadar daha Calismalisiniz");
        } else {
            System.out.println("Gecersiz Bilgi Girisi Yaptiniz");
        }
    }
}
