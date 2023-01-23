package zzzzzzzzzzzzzzzzz;

import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        /*
        Kullanicidan girmis oldugu tamsayinin pozitif mi negatif mi yoksa 
        nötr(0) mi oldugunu dogrulayan ve consola yazan bir program yaziniz
        
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Bir Tamsayi Giriniz: ");
        int sayi=scan.nextInt();
        
        if (sayi<0) System.out.println("Girilen Sayi Negatiftir..");
        else if (sayi==0) {
            System.out.println("Girilen Sayi Nötr sayidir..");
        } else if (sayi>0) {
            System.out.println("Girilen Sayi Pozitif Bir Tamsayidir..");
        }else System.out.println("Hatali Giris Yaptiniz..");
    }
}
