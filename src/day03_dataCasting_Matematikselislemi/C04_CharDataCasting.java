package day03_dataCasting_Matematikselislemi;

import java.util.Scanner;

public class C04_CharDataCasting {
    public static void main(String[] args) {
        /*
        Char data türünün ekstra bir özelligi vardir.
        eger matematiksel bir islemde char data türünden bir deger kullanirsaniz
        Java o charin ascii degerini gözönünde ulundurarak matematiksel islemi gerceklestirir.

        System.out.println('a'+'b'); //195
        System.out.println('a'-32);

        //'a'-32 nin char olarak sonucunu yazdirin;

        System.out.println((char) ('a'- 32)); //A
        //Kullanicidan bir char alip ascii table dan kullanicinin girdigi charin sonrasindaki 3 karakteri yazdirin
        //örnek input :a autput :b,c,d olacak

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Bir Karakter Giriniz: ");
        char krk=scan.next().charAt(0);
        System.out.println((char) (krk+1)+","+
                           (char) (krk+2)+","+
                           (char) (krk+3));

        //parantez icinde char yazdik cünkü matematiksel olarak sonuc istemedigimiz icin casting yaptik
        */

        //Kullanicidan iki tam sayi alip ,bunlari biribirine bölün ve sonucu double olarak yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen tamsayilari Girin: ");
        int a=scan.nextInt();
        int b=scan.nextInt();


        double sonuc=a/b;
        //Java önce sag tarafi yapar. Ama yukardaki kuraldan dolayi 3 yapar.
        System.out.println("Sayilarin double olarak Bölüm Soucu: " +sonuc);
        double dogrusonuc=(double)a/b;
        System.out.println("Simdi Dogru Sonuc : "+dogrusonuc);






    }



}
