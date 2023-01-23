package Day05_IfStatements;

import java.util.Scanner;

public class C05_ifstatements {
    public static void main(String[] args) {
        /*
        Soru 2- Kullanicidan bir harf alin, harf ile baslayan bir ay varsa yazdirin.
        NOT: Buyuk harf, kucuk harf hassasiyeti olmasin.
        Kullanici o veya O yazdiginda output Ocak olsun.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Yazdirmak Istediginiz Ayin Ilk Harfini Girin: ");
        char ilkharf=scan.next().charAt(0);

        if(ilkharf=='o'|| ilkharf=='0')System.out.println("Ocak");
        if(ilkharf=='s'|| ilkharf=='s')System.out.println("subat");
        if(ilkharf=='m'|| ilkharf=='m')System.out.println("mart");
        if(ilkharf=='n'|| ilkharf=='n')System.out.println("nisan");
        if(ilkharf=='m'|| ilkharf=='m')System.out.println("mayis");
        if(ilkharf=='h'|| ilkharf=='h')System.out.println("haziran");
        if(ilkharf=='t'|| ilkharf=='t')System.out.println("temmuz");
        if(ilkharf=='a'|| ilkharf=='a')System.out.println("agustos");
        if(ilkharf=='e'|| ilkharf=='e')System.out.println("eylül");
        if(ilkharf=='e'|| ilkharf=='e')System.out.println("ekim");
        if(ilkharf=='k'|| ilkharf=='k')System.out.println("kasim");
        if(ilkharf=='a'|| ilkharf=='a')System.out.println("aralik");
    }
}
