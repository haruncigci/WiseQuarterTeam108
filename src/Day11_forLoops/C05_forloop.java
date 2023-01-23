package Day11_forLoops;

import java.util.Scanner;

public class C05_forloop {

    public static void main(String[] args) {
        /*
        Soru 3 :Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        sinirlar dahil olarak aralarindaki tüm sayilarin toplamini yazdirin
        bitis degeri baslangic degerinden kücükse, uyari zazdirip islemi sonlandirin,


         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen Baslangic ve bitis degerleri icin iki pozitif tam sayi giriniz: ");

       int baslangic= scan.nextInt();
       int bitis=scan.nextInt();


        if (bitis<baslangic){
            System.out.println("Bitis Baslangictan kücük olamaz..");
        }else {
            int toplam=0;
            for (int i = baslangic; i <=bitis ; i++) {

                toplam+=i;
            }  System.out.println(toplam);

        }



    }
}
