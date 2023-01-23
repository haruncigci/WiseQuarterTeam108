package Day06_ifElseStatements;

import java.util.Scanner;

public class C05_ifElseif {
    public static void main(String[] args) {
       //Ornek :
        //Ogrencinin notu 85 ve ustu ise AA,
        //(85 ve ustu degilse) 65 ve ustu ise BB,
        //(65 ve ustu de degilse) 50 ve ustu ise CC,
        //(geriye kalanlar) DD

        Scanner scan=new Scanner(System.in);

        System.out.println("Notunuzu Giriniz: ");
        double not=scan.nextDouble();

        if (not <0 || not>100){
            System.out.println("Gecersiz Not Girdiniz..");
        } else if (not>=85) {
            System.out.println("Notunuz AA");
        } else if (not>=65) {
            System.out.println("Notunuz BB");
        } else if (not>=50) {
            System.out.println("Notunuz CC");
        } else {
            System.out.println("Notunuz DD Kaldiniz");
        }


        }


    }
