package Day07_ternary_switchStatements;

import java.util.Scanner;

public class C01_ifElseif {
    public static void main(String[] args) {
        /*Kullanicidan bir tam sayi alin
        Sayi rakam ise "Girilen Sayi Rakamdir"
        Sayi iki basamakli ise "Girilen Sayi Iki Basamakli"
        Sayi iki basamaktan büyük ise "Büyük SAyi yazdirin"
         */

        //Eger if else cümleleri else ile bitmiyorsa tüm durumlari kapsamaz, yani bazi degerler icin hicbir
        //if body si calismayabilir.Bu tür sorulari cözerken , sartlarin tamamini tamamini dikkatli yazmak gerekir.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Bir Tam Sayi Giriniz: ");
        int girilenSayi=scan.nextInt();

        if(0<=girilenSayi&&girilenSayi<=9) System.out.println("Girilen Sayi Rakam");
        else if (10<girilenSayi&&girilenSayi<=99) System.out.println("Girilen Sayi 2 Basamakli");
        else if (girilenSayi>100) System.out.println("Büyük Sayi");
    }
}
