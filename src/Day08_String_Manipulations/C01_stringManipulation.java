package Day08_String_Manipulations;

import java.util.Scanner;

public class C01_stringManipulation {
    public static void main(String[] args) {
        // Kullanicidan gunu ismini girmesini isteyin,
        // girilen gun hafta ici bir gun ise “Simdi calisma zamani tatile .. gun var”
        // seklinde hafta sonu tatiline kac gun kaldigini yazdirin,
        // girilen gun hafta sonu ise “Simdi dinlenme zamani” yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen Gun ismini giriniz");
        String girilenGun= scan.next();
        String kullanilacakGun=girilenGun.toLowerCase();
        /*
           string ifadeler case sensitive'dir
           kullanicinin Pazar, PAzar, PazaR, PAZAR ... gibi 32 farkli sekilde yazma ihtimali

           Kullanicinin girdigi degeri direk kalici olarak degistirmek tercih edilmez.
           Bunun yerine kullanicinin girdigi degeri degistririp yeni bir variable a atama yapar
           ve kodlarimizdan yeni variable i kullaniriz.
           Konsola yazdiracagimiz zaman istersek kullanicinin yazdigi orginal hali ile yada
           bizim istedigimiz sekilde yazdirabiliriz.

         */
        switch (kullanilacakGun){
            case "pazartesi":
                System.out.println(girilenGun + " calisma zamani, tatile 5 gun var");
                break;
            case "sali":
                System.out.println(girilenGun + " calisma zamani, tatile 4 gun var");
                break;
            case "carsamba":
                System.out.println(girilenGun + " calisma zamani, tatile 3 gun var");
                break;
            case "persembe":
                System.out.println(girilenGun + " calisma zamani, tatile 2 gun var");
                break;
            case "cuma":
                System.out.println(girilenGun + " calisma zamani, tatile 1 gun var");
                break;
            case "cumartesi":
            case "pazar":
                System.out.println("Simdi dinlenme zamani");
                break;
            default:
                System.out.println("Yanlis gun ismi");
        }
    }
}
