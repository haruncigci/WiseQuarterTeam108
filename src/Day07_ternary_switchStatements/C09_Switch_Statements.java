package Day07_ternary_switchStatements;

import java.util.Scanner;

public class C09_Switch_Statements {
    public static void main(String[] args) {
        //Kullanicidan gün numarasini alip
        //gün ismini yazdirin



        int günno=7;
        switch (günno){
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Sali");
            case 3:
                System.out.println("Carsamba");
                break;
            case 4:
                System.out.println("Persembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Gün Sayisi Bilgisei Gecersiz");




        }


    }
}
