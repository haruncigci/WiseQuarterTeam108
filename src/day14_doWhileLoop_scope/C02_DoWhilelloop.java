package day14_doWhileLoop_scope;

import java.util.Scanner;

public class C02_DoWhilelloop {
    public static void main(String[] args) {

        //Kullanicidan istedigi kadar sayi alin ve toplayin
        //kullanici deger olarak 0 a basarsa islemi bitirin

        Scanner scan=new Scanner(System.in);

        int girilenSayi=0;
        int toplam=0;

        do {
            System.out.println("Lütfen Toplanmak icin Tamsayi Giriniz");
            girilenSayi=scan.nextInt();
            toplam+=girilenSayi;

        }while (girilenSayi!=0);
        System.out.println("Girilen Sayilarin Toplamu: " + toplam);
        /*
        While loop da eger ilk sart saglanmazsa loop body hic calismaz
        Do-While Loop da önce Body calistigi icin , sart yanlis olsa bile loop Body si en az bir kere calismis olur

         */
    }
}
