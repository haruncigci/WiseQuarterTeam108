package Day11_forLoops;

import java.util.Scanner;

public class C03_AsalSayi {
    public static void main(String[] args) {
        /*
        Input olarak verilen bir tamsayinin
        asal sayi olup olmadigini yazdirin
         */
        Scanner scan =new Scanner(System.in);
        System.out.println("LÜtfen Bir Tam Sayi Giriniz:  ");

      int sayi= scan.nextInt();
      String sonuc="Sayi Asaldir";
        for (int i = 2; i <sayi ; i++) {
            if (sayi%i==0){
                sonuc="Sayi Asal Sayi Degildir";
                break;
            }
        }
        System.out.println(sonuc);
    }
}
