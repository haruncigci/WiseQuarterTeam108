package day13_methodOverloading_whileLoop;

import java.util.Scanner;

public class C05_WhileLoop {
    public static void main(String[] args) {
        /*
    Kullanicidan toplamak üzere sayii alin,
    toplanan sayilar 500 ü gecerse "Bu kadar yeter " yazin



    Bu soruyu for loop ile de yapariz
     */
        Scanner scan=new Scanner(System.in);
        int sayi=0;
        int toplam=0;

        for (int i = 0; i < 100000; i++) {
            System.out.println("Lütfen Toplanmak üzere sayi giriniz");
            sayi=scan.nextInt();

            toplam+=sayi;
            if (toplam>=500){
                System.out.println("Bu kadar sayi yeter. Toplamlari " + toplam + " oldu..");
                break;

            }


        }
        //============================While Loop Ile Cözüm=====================
            toplam=0;
        sayi=0;

        while (toplam<500){
            System.out.println("Lütfen Toplanmak üzere sayi giriniz");
            sayi=scan.nextInt();
            toplam+=sayi;
        }
        System.out.println("Bu kadar sayi yeter. Toplamlari " + toplam + " oldu..");


    }



}
