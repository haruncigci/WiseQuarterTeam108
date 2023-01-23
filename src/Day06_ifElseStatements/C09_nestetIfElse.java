package Day06_ifElseStatements;

import java.util.Scanner;

public class C09_nestetIfElse {
    public static void main(String[] args) {



       /* Soru 1- Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
         Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.

         Eger Degisken sayimiz birden fazla ise
         degiskenlerden birini öncelige alarak,
         ona göre bi if else yapisi kurulur.
         örnegin bu soruda kadin/erkek secimini ana degisken yapalim*/


        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Cinsiyatinizi Giriniz\nK:Kadin, E:Erkek");
        char cinsiyet=scan.next().charAt(0);

        System.out.println("Lütfen Yasinizi Giriniz ");
        int yas=scan.nextInt();

        if(cinsiyet=='K'||cinsiyet=='k'){
            if(yas<18 ||yas>85) System.out.println("GEcersiz Yas Girisi");
            else if (yas>60) System.out.println("Emekli Olabilirsiniz");
            else System.out.println("Emekli olabilmek icin "+(60-yas)+"yil kadar daha calismalisiniz");

        } else if (cinsiyet=='K'||cinsiyet=='k') {
            if (yas < 18 || yas > 85) System.out.println("GEcersiz Yas Girisi");
            else if (yas > 60) System.out.println("Emekli Olabilirsiniz");
            else System.out.println("Emekli olabilmek icin " + (60 - yas) + "yil kadar daha calismalisiniz");


        }

    }
}
