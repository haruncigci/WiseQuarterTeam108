package zzzzzzzzzzzzzzzzz;

import java.util.Scanner;

public class Kimliknumarasiörnegi {
    public static void main(String[] args) {
        /*
         Kullanicinin yazmis oldugu TC kimlik numarasinin uygun formatta olup olmadigini dogrulayan bir program yaziniz.

         Kural1: Kimlik No 0 ile baslayamaz
         Kural2: 11 Hane olmak Zorundadir
         Kural3:Son Rakam cift olmalidir..


         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen TC Kimlik Numaranizi Giriniz: ");
        long tcKimlikNo=scan.nextLong(); // int olmaz cünkü cok uzun rakamdan olusuyor

        long ilkHane=tcKimlikNo/1000000000l;

        String tcYazi=""+tcKimlikNo;
        boolean uzunlukDogruMu=tcYazi.length()==11;

        int sonRakam=(int)(tcKimlikNo%10);

        if (ilkHane!=0 && uzunlukDogruMu==true && sonRakam%2==0) {
            System.out.println("Tebrikler Dogru TC Kimlik Numarasi Girdiniz..");
        }
        if (ilkHane==0){
            System.out.println("Girdiniginiz TC Kimlik Numarasi 0 Ile Baslayamaz");
        }
        if (uzunlukDogruMu==false){
            System.out.println("Girilen TC kimlik Numarasi 11 Haneli Olmalidir");
        }
        if (sonRakam%2!=0){
            System.out.println("Girilen TC Kimlik Numarasinin son Hanesi Cift olmalidir");
        }



    }
}
