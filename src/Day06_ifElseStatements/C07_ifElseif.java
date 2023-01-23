package Day06_ifElseStatements;

import java.util.Scanner;

public class C07_ifElseif {
    public static void main(String[] args) {

        //Soru 2:Kullanicinin kilo(kg) ve boyunu (cm)isteyip
        //vucut kitle endeksini hesaplayin(kilo*10000 / (boy*boy))
        //Vucut kitle endeksi 30 veya daha büyükse obez,
        //25-30 arasi ise kilolu,
        //20-25 arasi ise normal,
        //20'den kücükse zayif yazdirin..

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Kilonuzu Giriniz ve ardindan Boyunuzu cm Olarak giriniz: ");
        double kilo=scan.nextDouble();
        double boy=scan.nextDouble();

        double vke=kilo*10000/(boy*boy);

        System.out.println("Vücut Kitle Endeksiniz: " + vke);

        if (vke>= 30 ) System.out.println("Obezsiniz, gec Kalmadan kendine Ceki düzen vermelisin");
        else if (vke>=25) System.out.println("Kilonuz Var ");
        else if (vke>=20) System.out.println("Kilonuz Normal,Böyle Devam edin");
        else System.out.println("Zayifsiniz, Kilo almalisiniz");


    }
}
