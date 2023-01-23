package zzzzzzzzzzzzzzzzz;

import java.util.Scanner;

public class _gmail_sorusu {
    public static void main(String[] args) {
        /*
        Kullanicidan girmis oldugu e mail adresinin gecerli bir gmail
        adresi olup olmadigini dogrulayan bir program yaziniz
        Kural1: @ isaretini icermesi Gerekiyor
        Kural2: @ isaretinden sonra "gmail.com" ifadesinin gecmesi gerekiyor.


        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Gmail Adresinizi Giriniz: ");

        String mail=scan.nextLine();

        int index=mail.indexOf("@");
        String gmail=mail.substring(index+1);

        if (!mail.contains("@")){
            System.out.println("Girilen Mail Adresi @ icermelidir");
        }
        if (!gmail.equals("gmail.com")){
            System.out.println("Girilen mail adresi Gmail olmalidir");
        }
        if (mail.contains("@")&& gmail.equals("gmail.com")){
            System.out.println("Girilen Gmail adresi Dogrudur");
        }

         */



        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen gmail Adresinizi Giriniz..");

        String email=scan.nextLine();

        int index=email.indexOf("@");

        String gmail=email.substring(index+1);

        if(!email.contains("@")) System.out.println("Girilen Email Adresinde @ olmalidir");
        if (!email.equals("gmail.com")) System.out.println("Girilen Email Gmail adresi olmalidir");
        if (email.contains("@")&&(email.equals("gmail.com"))) System.out.println("Girilen Email Adresi Dogrudur");

































    }
}
