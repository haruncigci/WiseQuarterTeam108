package Day05_IfStatements;

import java.util.Scanner;

public class C01_if_statements {
    public static void main(String[] args) {

        //Ögrenciden notunu rakam olarak alip harf olarak yazdirin
        //0-49,999 DD
        //50-64,99 CC
        //65-84,99 BB
        //85-100 AA
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Notunuzu Giriniz: ");
        double not=scan.nextDouble();

        if (0<= not && not>50){
            System.out.println("Notunuz DD,maalesef kaldiniz..");

        }
        if (50<= not && not<65){
            System.out.println("Notunuz CC,Tebrikler gectiniz..");
        }
        if (65<= not && not<85){
            System.out.println("Notunuz BB,Tebrikler Gectiniz");
        }
        if (85<= not && not<=100){
            System.out.println("Tebrikler Notunuz AA");
        }


    }
}
