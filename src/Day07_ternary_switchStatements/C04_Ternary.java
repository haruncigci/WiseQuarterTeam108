package Day07_ternary_switchStatements;

import java.util.Scanner;

public class C04_Ternary {
    public static void main(String[] args) {
        /*
        Kullanicidan alinan deger 100 den büyük ise
        sayiyi 2 ile carpalim,
        100e esit veya kücük ise sayiya 10 ekleyelim
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Bir Sayi Giriniz: ");
        int sayi= scan.nextInt();

        //if else Ile yapalim

        if(sayi>100){
            System.out.println(sayi*2);
        }else System.out.println(sayi+10);

        System.out.println(sayi>100?sayi*2:sayi+10);

        /*
        Verilen input u inceleyim
        Eger 100 den büyükse bunu 5 e bölüp, bölüm sonucunu tek sayi olup olmadigini kontrol edelim
        Eger 100 den büüyk degilse , 10 ile bölümünden kalani bulup,bu kalani 5 artirin

        Bu tür komplex islemleri ternary ile yapmayiz
         */


    }
}
