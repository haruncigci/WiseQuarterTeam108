package takimCalismasi;

import java.util.Scanner;

public class soru3 {
    public static void main(String[] args) {
        /*
        Soru 3-)
Kullanicidan 5 tane sayi alin,alinan bu sayilarin ortalamasini hesaplayan java kodunu yaziniz.
Ipuclari:
* Sayilarin ortalamasi: toplam/5 (edited)

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen 5 Sayi Giriniz: ");
        int sayi1=scan.nextInt();
        int sayi2=scan.nextInt();
        int sayi3=scan.nextInt();
        int sayi4=scan.nextInt();
        int sayi5=scan.nextInt();

        int ort=(sayi1+sayi2+sayi3+sayi4+sayi5)/5;

        System.out.println(ort);



        Kullanıcıdan bir sayı alın ve aldiginiz bu sayının küpünün yarısını konsola yazdırin.
Ipuclari:
* Sayinin küpü: sayi*sayi*sayi (edited)


        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Bir sayi alin:");

        double sayi=scan.nextDouble();

        double sonuc=(sayi*sayi*sayi)/2;

        System.out.println(sonuc);


Kullanıcıdan karenin kenar uzunluğunu alın. Aldiginiz uzunluklarla karenin alanını ve çevresini hesaplayan kodu yazın.
Ipuclari:
Google yaparak karenin alaninin ve cevresinin nasil bulundugunu ögrenin :-)


        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Karenin Kenarini Giriniz: ");
        double kenar=scan.nextInt();

        double alan=kenar*kenar;
        double cevre=kenar*4;



                /*
                Soru 7-)  Kullanicidan Double türünde bir sayi alin. Alinan bu sayiyi tam sayiya cevirerek konsolda yazdirin.
        (Istege bagli) Float degerinde bir sayi alin bu sayiyi da short degisken türünde bir sayiya döndürün
        ipuclari:
        Data Casting konusuna bakiniz. Auto Widening ve Explicit Narrowing konularini hatirlayalim. (edited)


        Scanner scan=new Scanner(System.in);
        System.out.println("Lütgen Bir SAyi Giriniz: ");
        float sayi= scan.nextFloat();
        short sayi1=(short) sayi;
        System.out.println("sayi1= " + sayi1);

         */
/*
Soru-8) Kullanicidan üc basamaklı bir sayı alin.
        Kullanicidan alinan bu sayinin basamaklari toplamini ekranda yazdirin.
        ipuclari:
        Matematiksel Islemler konusuna bakalim.
        Bölme islemi kullanarak sayinin basamaklarini alalim ve
        toplam adli bir konteynira (Variable) atalim.





        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen 3 Basamakli Bir sayi Giriniz: ");
        int sayi= scan.nextInt();

        int birlerBasamagi=sayi%10;
        System.out.println(birlerBasamagi);

        int onlarbasamagi=(sayi%100/10);
        System.out.println(onlarbasamagi);
        int yüzlerBasamagi=sayi/100;
        int sonuc=birlerBasamagi+yüzlerBasamagi+onlarbasamagi;
        System.out.println(sonuc);

        Soru 9-)  Girilen zamanı saniyeye çeviriniz.
        Örnek: 2 saat 3 dakika 10 saniye ==>     7390 saniye
        Ipucu:
        Saati alıp saniyeye cevirebilirsiniz.  Kullanıcıdan ayrı ayrı alabilirsiniz veya  kullanıcıdan hepsini birlikte alabilirsiniz.
 */
/*
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen saati giriniz:");

        double saat= scan.nextDouble();
        System.out.println("Lütfen Dakika Giriniz");

        double dakika= scan.nextDouble();
        System.out.println("Lütfen Saniye Giriniz: ");

        double saniye= scan.nextDouble();

        double toplmaSaniye=(saat*60*60) + (dakika*60) + (saniye);

        System.out.println("Toplam SAniye: "  + toplmaSaniye);


        Soru 10-)
        Kullanıcıdan kilosunu ve boyunu isteyin ve kütleyi hesaplayan bir program yazın
                **indeks Hesaplama: İPUCU : Vücut Kitle İndeksi = Ağırlık (kg) / Boy uzunluğunun karesi (m) // If konusunu hatırlayın!***
                Kullanıcıya aşağıdaki gibi mesaj verin:
                Eğer VKİ 18.5'ten az ise --> zayıfsınız
        Eğer VKİ 18.5 ile 25 arasında ise --> kilo idealdir
        Eğer VKİ 25 ila 30 arasındaysa --> şişmansınız
        VKİ 30'a eşit veya daha fazlaysa --> obez
        */


        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Kilonuzu Kg cinsinden Giriniz: ");
        double kilo=scan.nextDouble();

        System.out.println("Lütfen Boyunuzu m cinsinden Giriniz: ");
        double boy= scan.nextDouble();

        double vke= kilo/(boy*boy);

        if (vke>0 && vke<300){
            if (vke<18.5){
                System.out.println("Zayifsiniz,kilo Almalisiniz");
            } else if (vke>=18.5 && vke<25) {
                System.out.println("Kilonuz Idealdir");

            } else if (vke>=25 && vke <30) {
                System.out.println("şişmansınız");

            } else if (vke>=30) {
                System.out.println("obezsiniz");
            }
        }else System.out.println("Hatali Giris Yaptiniz..");


































    }
}
