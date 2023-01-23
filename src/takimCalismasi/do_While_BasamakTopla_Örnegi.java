package takimCalismasi;

import java.util.Scanner;

public class do_While_BasamakTopla_Örnegi {
    public static void main(String[] args) {
        /*
        Soru-8) Kullanicidan üc basamaklı bir sayı alin.
        Kullanicidan alinan bu sayinin basamaklari toplamini ekranda yazdirin.
        ipuclari:
        Matematiksel Islemler konusuna bakalim.
        Bölme islemi kullanarak sayinin basamaklarini alalim ve
        toplam adli bir konteynira (Variable) atalim.
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen Bir Sayi Giriniz: ");
        int sayi=scanner.nextInt();

        int toplam=0;

        do {
            toplam+=sayi%10;
            sayi=sayi/10;
            System.out.println("Toplam= " + toplam + " Sayi= " + sayi);

        }
        while (sayi>0);

        System.out.println("Toplam= " + toplam);




    }
}
