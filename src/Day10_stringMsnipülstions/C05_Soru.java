package Day10_stringMsnipülstions;

import java.util.Scanner;

public class C05_Soru {
    public static void main(String[] args) {
        // Soru 1 : Kullanicidan bir cumle alin
        // - cumlede ev geciyorsa, "home home sweet home" yazdirin
        // - cumlede is geciyorsa, "calismak guzeldir"
        // - ikisini de iceriyorsa "Hem ev lazim hem is"
        // - hicbirini icermiyorsa "cok calisman lazim" yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Bir Cümle Giriniz: ");



        String cümle=scan.nextLine();
        cümle=cümle.toLowerCase();

        if (cümle.contains("ev")&& (cümle.contains("is"))){
            System.out.println("Hem ev lazim hem is");
        } else if (cümle.contains("is")) {
            System.out.println("calismak guzeldir");
        }else if (cümle.contains("ev")){
            System.out.println("home home sweet home");
        }else {
            System.out.println("Cok Calismam LAzim");
        }
    }
}
