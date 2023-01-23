package zzzzzzzzzzzzzzzzz;

import java.util.Scanner;

public class C06_if_ElseSorular {
    public static void main(String[] args) {
        //Soru 3- Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri ,
        // Erkek 65 yas ve uzeri emekli olabilir.
        // Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin”
        // veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.
/*


        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Cinsiyetinizi Giriniz:\nE:Erkek K:Kadin");
        char cinsiyet = scan.next().charAt(0);

        System.out.println("Lütfen Yasinizi Giriniz: ");
        int yas = scan.nextInt();

        if ((cinsiyet == 'K' || cinsiyet == 'k') && yas >= 60) {
            System.out.println("Kadin Emekli olabilir");
        } else if ((cinsiyet == 'K' || cinsiyet == 'k') && yas >= 18) {
            System.out.println("Emekli olmak icin " + (60 - yas) + " yil daha calismalisin");
        } else if ((cinsiyet == 'E' || cinsiyet == 'e') && yas >= 65) {
            System.out.println("Emekli olabilir");
        } else if ((cinsiyet == 'E' || cinsiyet == 'e') && yas >= 18) {
            System.out.println("Emekli olmak icin " + (65 - yas) + "yil daha calismalisin");
        } else {
            System.out.println("Gecersiz Bilgi");
        }

        Soru 1- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise “Eskenar ucgen”
yazdirin, degilse “Eskenar degil” yazdirin.


        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Ücgenin kenar Uzunluklarini Giriniz");
        int kenar1= scan.nextInt();
        int kenar2= scan.nextInt();
        int kenar3= scan.nextInt();

        if(kenar1==kenar2&&kenar1==kenar3) System.out.println("Eskenar Ücgen");
        else System.out.println("Eskenar Degildir");

        Soru 2- Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”, 50’den kucukse “Maalesef
kaldin” yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Aldiginiz Notunuzu Giriniz:");

        int not= scan.nextInt();

        if(not>=50 && not<=100) System.out.println("Tebrikler GEctiniz");
        else System.out.println("Malesef Kaldiniz");

        Soru 3- Kullanicidan yasini isteyin, 65 yas ve uzeri ise ”Emekli olabilirsin” yazdirin, yoksa emekli
olmasi icin calismasi gereken yil sayisini yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Yasinizi Giriniz: ");
        int yas=scan.nextInt();

        if(yas>=65) System.out.println("Emekli Olabilirsiniz");
        else if(yas<65 && yas>=18) System.out.println("Emekli olabilmek icin " +(65-yas)+" yil 49kadar yiliniz var");
        else System.out.println("Emekli Olamazsiniz");

        Soru 4- Kullanicidan bir karakter girmesini isteyin, girilen karakterin buyuk harf olup olmadigini
yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir Karakter Giriniz : ");
        char krk=scan.next().charAt(0);

        if(krk>'a'&&krk<'z') System.out.println("Girilen Karakter Büyük Harf degildir");
        else System.out.println("Girilen Karakter Büyük Harftir");

        Soru 5- Kullanicidan bir harf isteyin, girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
yoksa girilen harfi yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Bir Karakter Giriniz: ");
        char krk=scan.next().charAt(0);

        if (krk>'a'&&krk<'z') System.out.println("Girilen Karakterin Büyük Harfi su sekildedir:"+ (char)(krk-32));
        else System.out.println("Girilen karakter kücük harflidir:" +krk);

        Soru 1- Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli
olabilir. Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin” veya “Emekli olmak icin .. Yil
daha calisman gerekir” yazdirin.


        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Yasinizi Giriniz: ");
        int yas=scan.nextInt();
        System.out.println("Lütfen Cinsiyetinizi Giriniz");
        char cinsiyet=scan.next().charAt(0);


        if((cinsiyet=='K'||cinsiyet=='k') && (yas>=60)){
            System.out.println("Emekli Olabilirsiniz");
        } else if ((cinsiyet=='K'||cinsiyet=='k') && (yas<60)) {
            System.out.println("Emekli Olabilmek Icin " +(60-yas)+ "yil daha calismalisiniz");
        } else if ((cinsiyet=='E'||cinsiyet=='e') && (yas>=60)){
            System.out.println("Emekli Olabilirsiniz");
        } else if ((cinsiyet=='E'||cinsiyet=='e') && (yas<65)) {
            System.out.println("Emekli Olabilmek Icin " +(65-yas)+ "yil daha calismalisiniz");
        }else System.out.println("Gecersiz Giris Yaptiniz");

        Soru 2- Kullanicinin kilo(kg) ve boyunu(cm) isteyip vucut kitle endeksini hesaplayin (kilo*10000 /
(boy *boy)) vucut kitle endeksi 30’dan buyukse obez, 25-30 arasi ise kilolu, 20-25 arasi
ise normal, 20’den kucukse zayif yazdirin.
 */
        Scanner scan=new Scanner(System.in);
        System.out.println("Kilonuzu Giriniz:  ");
        double kilo=scan.nextDouble();
        System.out.println("Lütfen Boyunuzu cm Olarak Giriniz:");
        double boy=scan.nextDouble();
        double vke=kilo*10000/(boy*boy);

        if(vke<30) System.out.println();


    }

}
