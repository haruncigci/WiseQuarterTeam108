package Day11_forLoops;

import zzzzzzzzzzzzzzzzz.Scanner_scan;

import java.util.Scanner;

public class C02_Forloop {
    public static void main(String[] args) {

        /*
        input olarak verilen bir Stringde indexi tek sayi olanlari kücük harfle
        indexi cift sayi olanlari büyük harfle yazdirin
        örnek; Java   output: JaVa
         */


        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Bir cümle Giriniz=   ");

        String cümle= scan.nextLine();
        for (int i = 0; i < cümle.length(); i++) {
            System.out.print(i%2==0 ?cümle.substring(i,i+1).toUpperCase()
                                :cümle.substring(i,i+1).toLowerCase());
        }
        }
}
