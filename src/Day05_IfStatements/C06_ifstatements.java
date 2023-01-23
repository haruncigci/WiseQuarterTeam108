package Day05_IfStatements;

import java.util.Scanner;

public class C06_ifstatements {
    public static void main(String[] args) {
        /*
        Soru 4 Kullanicidan Bir ücgenin 3 kenar uzunlugunu alin
        ucgen eskenar ise "eskenar ücgen" yazdirin"
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Ücgenin üc kenar uzunlugunu giriniz: ");
        double kenar1=scan.nextDouble();
        double kenar2=scan.nextDouble();
        double kenar3=scan.nextDouble();
        if (kenar3==kenar1 && kenar3==kenar2){
            System.out.println("eskenar Ücgen");
        }
        if (kenar3!=kenar1 || kenar1!=kenar2){
            System.out.println("Eskenar Ücgen Degildir");
        }
    }
}
