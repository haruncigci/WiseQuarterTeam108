package zzzzzzzzzzzzzzzzz;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        // Kullanicidan gunu ismini girmesini isteyin,
        // girilen gun hafta ici bir gun ise “Simdi calisma zamani tatile .. gun var”
        // seklinde hafta sonu tatiline kac gun kaldigini yazdirin,
        // girilen gun hafta sonu ise “Simdi dinlenme zamani” yazdirin
/*
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Gün Ismini Giriniz: ");
        String girilenGün=scan.nextLine();
        String kullanilacakGün=girilenGün.toUpperCase();

        switch (girilenGün){
            case "Pazartesi":
                System.out.println(girilenGün + "Calisma Günüdür. Dinlenmeye 5 Gün Var..");
                break;
            case "Sali":
                System.out.println(girilenGün + " " +  "Calisma Günüdür. Dinlenmeye 4 Gün Var..");
                break;
            case "Carsamba":
                System.out.println(girilenGün + " " +  "Calisma Günüdür. Dinlenmeye 3 Gün Var..");



        //Kullanicidan iki sayi alin
        //ve kullaniciya istedigi islemi sorun
        //+,-,* ve bölme isaretlerinden hangisini girerse
        //2 sayi icin o islemi yapin
        //bu isaretlerden birini girmezse
        //"Yanlis islem tercihi" yazdirin
 */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Isleme sokmak istediginiz Sayilari Giriniz:  ");
        int sayi1=scan.nextInt();
        int sayi2=scan.nextInt();

        System.out.println("LÜtfen Islem Türünü Seciniz: \nToplama : + \nCikarma : - \nCarpma : * \nBölme : / ");
        char islem=scan.next().charAt(0);

        char toplama= '+';
        char cikarma= '-';
        char carpma= '*';
        char bölme= '/';

        switch (islem){
            case '+':
                System.out.println("Toplama Isleminizin Sonucu: " + (sayi2+sayi1) );
                break;
            case '-':
                System.out.println("Cikarma Isleminizin Sonucu: " + (sayi1 - sayi2) );
                break;
            case '*':
                System.out.println("Carpma Isleminizin Sonucu: " + (sayi1*sayi2));
                break;
            case '/':
                System.out.println("Bölme Isleminizin Sonucu: " + (sayi1/sayi2));
                break;
            default:
                System.out.println("Girilen Islem Gecersiz");


        }















    }
}
