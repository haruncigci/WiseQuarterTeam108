package Day06_ifElseStatements;

import java.util.Scanner;

public class C03_ifElseStatements {
    public static void main(String[] args) {
        //Soru 5- Kullanicidan bir harf isteyin,
        // girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
        // yoksa girilen harfi yazdirin

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen Bir Karakter Giriniz: ");
        char girilenKarakter=scan.next().charAt(0);

        if (girilenKarakter>= 'a'&& girilenKarakter<='z'){
            //kücük harf ise Büyük harf olarak yazdiralim
            System.out.println((char)(girilenKarakter-32));
            System.out.println(Character.toUpperCase(girilenKarakter));
        }else {
            //Kücük harf degilse girilen harfi yazdiralim
            System.out.println(girilenKarakter);
        }


    }
}
