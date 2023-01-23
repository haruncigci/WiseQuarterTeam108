package Day07_ternary_switchStatements;

import java.util.Scanner;

public class C08_SwitchStatements {
    public static void main(String[] args) {
        //Kullanicidan iki sayi alin
        //ve kullaniciya istedigi islemi sorun
        //+,-,* ve bölme isaretlerinden hangisini girerse
        //2 sayi icin o islemi yapin
        //bu isaretlerden birini girmezse
        //"Yanlis islem tercihi" yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Isleme Sokmak Istediginiz Sayilari Sirasiyla Griniz:");
        int sayi1= scan.nextInt();
        int sayi2=scan.nextInt();
        System.out.println("Lütfen Islem Türünü Seciniz: ");
        char islem=scan.next().charAt(0);


        //if else ile yapalim

        if (islem=='+'){
            System.out.println("Sayilari toplami: "+(sayi2+sayi2));
        }else if (islem=='-') {
            System.out.println("Sayilarin Farki:" +(sayi1-sayi2));
        }else if (islem=='*'){
            System.out.println("Islem Carpimi: " + (sayi1*sayi2));
        } else if (islem=='/') {
            System.out.println("Sayilarin Bölümü: " + (sayi1/sayi2));
        }else {
            System.out.println("yanlis Islem Tercihi");
        }


        // Switch statement ile Yapalim
        System.out.println("=========================");

        switch (islem){
            case '+':
                System.out.println(sayi1+sayi2);
                break;
            case '-':
                System.out.println(sayi1-sayi2);
                break;
            case '*':
                System.out.println(sayi1*sayi2);
                break;
            case '/':
                System.out.println(sayi1/sayi2);
                break;
            default:
                System.out.println("Yanlis Islem Tercihi");
        }
    }
}
