package Day11_forLoops;

import java.util.Scanner;

public class C04_Forloop {
    public static void main(String[] args) {
        /*
        Eger sart i nin hicbir  degeri icin true olmuyorsa
        Loop calisir ama lopp body si devreye hic girmediginden islem yapilmaz


        input olarak verilen sayidan bire kadar tüm sayilari yazdirin

         */


        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Bir Sayi Giriniz..");
        int sayi=scan.nextInt();

        for (int i = sayi; i >1 ; i--) {
            System.out.println(i + " ");
        }







        /*
        Eger sart i nin tüm degerleri icin dogru oluyorsa
        teknik olarak sonsuz loop olusur deriz
        Bilgisayarimiz sonsuza kadar calismaz ,ram dolar veya int in siniriina ulasilir
        ama teknik olarak sonsuz loop denir

        //input olarak verilen sayidan 100 e kadar tü sayilari yazdiralim

         */

        for (int i = sayi; i <=sayi ; i++) {
            System.out.print(i +" ");

        }


    }
}
