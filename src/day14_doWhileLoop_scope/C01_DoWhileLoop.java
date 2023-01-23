package day14_doWhileLoop_scope;

import java.util.Scanner;

public class C01_DoWhileLoop {
    public static void main(String[] args) {


        //Kullanicidan istedigi kadar sayi alin ve toplayin
        //kullanici deger olarak 0 a basarsa islemi bitirin

        Scanner scan=new Scanner(System.in);

        int girilenSayi=0;
        int toplam=0;
        while (girilenSayi!=0) {
            System.out.println("Lütfen Toplanmak icin bir Tamsayi Giriniz: ");
            girilenSayi = scan.nextInt();


            toplam += girilenSayi;
        }
        System.out.println("Girilen Sayilarin Toplami : " + toplam);
/*
                    While loop un 2 tane negatif yönü vardir.
                    1- Loop dan önce olusturdugumuz ve loop da kullancagimiz variable lara yanlisbir deger  verirsek
                    loop body si hic calismayabilir
                    2- Loop conditioni loop bodysinden bir kez fazla calisir
                    bu negatif yönler onu kullanilmaz yapacak degildir,
                    ancak bu negatifliklerden kurtulmak istersek do-while loop kullanabiliriz
 */

    }
}
