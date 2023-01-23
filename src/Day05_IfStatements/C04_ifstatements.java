package Day05_IfStatements;

import java.util.Scanner;

public class C04_ifstatements {
    public static void main(String[] args) {
        /*
        Soru 3- Kullanicidan bir sayi alin, sayi 3 ile bolunuyorsa “Uc ile bolunebilen sayi”, 5 ile bolunebiliyorsa “Bes ile bolunebilen sayi” yazdirin.

        Eger if body'si icin yazilacak kod 1 satirdan fazlaysa
        MUtlaka { } kullanilmalidir
         */
        Scanner scan =new Scanner(System.in);
        System.out.println("lütfen bir tamsayi Giriniz: ");
        int sayi= scan.nextInt();

        if(sayi%3==0){
            System.out.println("Üc ile Bölünebilir");
        }
        if(sayi%5==0){
            System.out.println("Sayi 5 ile bölünebilir.");
        }

    }
}
