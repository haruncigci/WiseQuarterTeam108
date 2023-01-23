package Day09_stringManipulation;

import java.util.Scanner;

public class C04_endsWith {
    public static void main(String[] args) {
        String str="Java ögrenen issiz kalmaz";

        System.out.println(str.endsWith("kalmaz"));//treu
        System.out.println(str.endsWith("Java ögrenen issiz kalmaz"));//true

        System.out.println(str.endsWith(""));//treu

        System.out.println(str.endsWith("ögrenen"));//false
        /*
        SORU : kullanicidan bir mail alin
  - mail @ icermiyorsa “gecersiz mail”
  - mail @gmail.com icermiyorsa, “mail gmail olmali”
  - mail @gmail.com ile bitmiyorsa, “mailde yazim hatasi var”
 yazdirin.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Mail adresinizi Giriniz:");
        String mail=scan.nextLine();

        if (!mail.contains("@")){
            System.out.println("Gecersiz Mail");
        }else if (!mail.contains("@gmail.com")){
            System.out.println("mail gmail.olmali");
        } else if (!mail.endsWith("@gmail.com")) {
            System.out.println("mailde yazim hatasi var");
        }else System.out.println("girilen MAil adresi yanlis..");


    }
}
