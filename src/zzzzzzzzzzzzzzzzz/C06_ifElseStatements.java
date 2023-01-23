package zzzzzzzzzzzzzzzzz;

import java.util.Scanner;

public class C06_ifElseStatements {
    public static void main(String[] args) {

       /*Soru 1- Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli
       olabilir. Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin” veya “Emekli olmak icin .. Yil
        daha calisman gerekir” yazdirin.


        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Cinsiyetinizi Giriniz: \nErkek:E \nKadin:K");
        char cinsiyet=scan.next().charAt(0);
        System.out.println("Lütfen Yasinizi Giriniz: ");
        int yas= scan.nextInt();

        if((cinsiyet=='K' || cinsiyet=='k') && yas>=60){
            System.out.println("Emekli Olabilirsiniz");
        } else if ((cinsiyet=='K' || cinsiyet=='k') && yas<60) {
            System.out.println("Emekli olabilmek icin"+(60-yas)+"Yil daha calismalisin..");

        } else if ((cinsiyet=='E'||cinsiyet=='e')&&yas>=65) {
            System.out.println("Emekli Olabilirsiniz");
        } else if ((cinsiyet=='E'||cinsiyet=='e')&&yas<65) {
            System.out.println("Emekli Olabilmek Icin "+(65-yas)+" kadar yil daha calismalisiniz..");
        }else System.out.println("Gecersiz Bilgi Girisi Yaptiniz..");


        Soru 2- Kullanicinin kilo(kg) ve boyunu(cm) isteyip vucut kitle endeksini hesaplayin (kilo*10000 /
(boy *boy)) vucut kitle endeksi 30’dan buyukse obez, 25-30 arasi ise kilolu, 20-25 arasi
ise normal, 20’den kucukse zayif yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Kilonuzu Giriniz:");
        double kilo=scan.nextDouble();
        System.out.println("Lütfen Boyunuz cm Olarak Giriniz:");
        double boy=scan.nextDouble();

        double vke=kilo*10000/(boy*boy);

        if(vke>30) {
            System.out.println("Malesef Obezsiniz,Zayiflamalisiniz");
        }else if (vke>25&&vke<30) {
            System.out.println("Kilolusunuz");
        } else if (vke>20 &&vke<25) {
            System.out.println("Normal Kilo");
        } else if (vke<20) {
            System.out.println("Zayif");
        }else System.out.println("Gecersiz Giris Yaptiniz");

        Soru 3- Kullanicidan aldigi urun adedi ve ve liste fiyatini alin, kullaniciya musteri karti olup
olmadigini sorun. Musteri karti varsa 10 urunden fazla alirsa %20, yoksa %15 indirim
yapin, Musteri karti yoksa 10 urunden fazla alirsa %15, yoksa %10 indirim yapin

        Scanner scan=new Scanner(System.in);
        System.out.println("Müsteri Kartiniz Var mi?\nEvet:E \nHayir:H");
        char kart=scan.next().charAt(0);
        System.out.println("Lütfen Aldiginiz Ürün Adedini giriniz:");
        int ürünadedi=scan.nextInt();
        System.out.println("Lütfen Aldiginiz Ürünün Liste Fiyatini Giriniz:");
        int listeFiyati=scan.nextInt();

        int tutar=listeFiyati*ürünadedi;

        if ((kart=='E'||kart=='e')&&ürünadedi>10){
            System.out.println(tutar*0.80);
        } else if ((kart=='H'||kart=='h')&&ürünadedi>10) {
            System.out.println(tutar*0.85);
        } else if ((kart=='H'||kart=='h')&&ürünadedi<10) {
            System.out.println(tutar*0.90);
        }else System.out.println("Gecersiz Giris Yaptiniz");

        Soru 4- Kullanicidan mesafeyi kilometre olarak alin ve cevirmek istedigi birimi sorun, istedigi birim
metre veya santimetre ise cevirip yazdirin, yoksa “istediginiz birim sisteme kayitli degil”
yazdirin.


Soru 13) Interview Question
Kullanicidan artik yil olup olmadigini kontrol etmek icin yil
girmesini isteyin.
Kural 1: 4 ile bolunemeyen yillar artik yil degildir
Kural 2: 4 ile bolunup 100 ile bolunemeyen yillar artik
yildir
Kural 3: 4’un kati olmasina ragmen 100 ile bolunebilen
yillardan sadece 400’un kati olan yillar artik yildir
        */



    }
}
