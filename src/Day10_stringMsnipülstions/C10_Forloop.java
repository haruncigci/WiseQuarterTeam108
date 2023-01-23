package Day10_stringMsnipülstions;

import java.util.Scanner;

public class C10_Forloop {
    public static void main(String[] args) {
        // input olarak verilen sayidan baslayip
        // 7'ser 7'ser artirarak input olarak verilen bitis sayisina kadar
        // - tum sayilari
        // - kac adet sayi oldugunu
        // - ve bu sayilarin toplaminin kac oldugunu yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Sirasiyla Baslangic ve Bitis Degerlerini Giriniz: ");
        int baslangic= scan.nextInt();
        int bitis=scan.nextInt();

        int sayac=0;
        int toplam=0;
        for (int i = baslangic; i <bitis ; i+=7) {
            System.out.print(i+" ");
            sayac++;
            toplam+=i;

        }
        System.out.println();
        System.out.println("Sayilarin Toplami : " + toplam
                                + "\nToplam Sayi adedi : " + sayac);
    }
}
