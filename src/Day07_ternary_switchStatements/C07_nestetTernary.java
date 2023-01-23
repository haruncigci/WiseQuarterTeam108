package Day07_ternary_switchStatements;

import java.util.Scanner;

public class C07_nestetTernary {
    public static void main(String[] args) {
        /*
        Kullanicidan bir tamsayi alin.
 Sayi pozitifse, cift sayi veya cift sayi degil seceneklerinden uygun olani yazdirin
 Sayi pozitif degilse, 3 basamakli veya 3 basamakli degil seceneklerinden uygun olani yazdirin
         */

            Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Bir sayi Giriniz: ");
        int sayi= scan.nextInt();

        System.out.println(sayi>0?sayi%2==0
                                 ?"Sayi Ciftir"
                                 :"Sayi Tektir"
                                 :sayi<-99&&sayi>=-999
                                 ?"Sayi Üc Basamakli"
                                 :"Sayi Üc Basamakli Degil");






        //System.out.println(sayi>0?"Sayi Pozitif":"Sayi Pozitif Degil");

    }
}
