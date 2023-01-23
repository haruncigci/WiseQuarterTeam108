package Day06_ifElseStatements;

import java.util.Scanner;

public class C02_ifElseStatements {
    public static void main(String[] args) {
        /*
        Kullanicidan bir ücgenin 3 kenar uzunlugunu alin
        ve ucgen eskenar ise "Ikizkenar ucgen" yazdirin, degilse "Ikizkenar Degil " yazdirin.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Ucgenin kenar Uzunluklarinin giriniz: ");
        double kenar1=scan.nextDouble();
        double kenar2=scan.nextDouble();
        double kenar3= scan.nextDouble();

        if ((kenar1==kenar2 && kenar1!=kenar3 )||
             (kenar2==kenar3 && kenar2!=kenar1 )||
                (kenar3==kenar1&& kenar3!=kenar2)){
            System.out.println("Ikizkenar Ücgen");
        }else {
            System.out.println("Ikizkenar Degil");

        }


    }
}
