package day02_Variables_scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C08_Scanner {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen dikdörtgenin iki kenar uzunluklarini girin");
        double kenar1= scan.nextDouble();
        double kenar2= scan.nextDouble();

        System.out.println("Dikdörtgenin alani : "+kenar1*kenar2);



    }
}
