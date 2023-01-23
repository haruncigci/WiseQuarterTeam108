package day02_Variables_scanner;

import java.util.Scanner;

public class C05_Scanner {

    public static void main(String[] args) {
        //Kullanicidan bsy istiyorsak scanner objesini kullaniriz

        //Kullanicidan ismini alin
        //ve girilen ismi büyük harflerle yazdirin

        //Kullanicidan deger almak icin 3 islem yapmamiz gerekir.
        //1.adim scanner objesi olusturmak

        Scanner scan = new Scanner(System.in);

        //2.adim >> kullaniciya ne istediginizi söyleyin

        System.out.println("isminizi yazin");

        //3. Adim >> Kullanicinin girecegi degeri kaydedeceginz bir variable olusturun.
        // Scan objesi ile ilgili methodu kullanarak kullanicinin girdigi degeri
        //olusturdugumuz variable a atayin

        String girilenIsim=scan.nextLine();

        //artik kullanicinin girdigi deger , girilen isim variablenda kayitli

        System.out.println(girilenIsim.toUpperCase());




    }
}
