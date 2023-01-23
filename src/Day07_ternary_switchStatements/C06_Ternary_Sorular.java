package Day07_ternary_switchStatements;

import java.util.Scanner;

public class C06_Ternary_Sorular {
    public static void main(String[] args) {
        // Kullanicidan notunu alin 50 veya daha buyukse "Sinifi Gectin",
        // 50’den kucukse "Maalesef kaldin" yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Notunuzu Giriniz: ");
        int sayi= scan.nextInt();
        System.out.println(sayi>=50?"Sinifi Gectin": "Malesef Kaldin");


        //Soru 3- Kullanicidan bir harf isteyin, girilen karakter kucuk harf ise
        // onu buyuk harf olarak yazdirin, yoksa girilen harfi yazdirin
        System.out.println("Lütfen Bir Harf Giriniz: ");
        char harf=scan.next().charAt(0);

        System.out.println(harf>='a'&&harf<'z'?(char)(harf-32):harf);

        //soru:6 Kullanicidan bir sayi alin ve mutlak degerini yazdirin
        System.out.println("Lütfen Bir sayi Giriniz");
        int sayi1= scan.nextInt();
        System.out.println(sayi1>=0?sayi1:(sayi1)*(-1));

        //mutlak deger |5| = 5
        //mutlak deger |-4|=(-1)*(-4)=4



    }


}
