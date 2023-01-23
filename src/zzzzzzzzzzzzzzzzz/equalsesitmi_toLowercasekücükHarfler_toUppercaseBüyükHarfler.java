package zzzzzzzzzzzzzzzzz;

public class equalsesitmi_toLowercasekücükHarfler_toUppercaseBüyükHarfler {

    public static void main(String[] args) {

         String isim="HArun";
         String isim2="Harun";

        System.out.println(isim.equals(isim2)); // false

        System.out.println(isim.equalsIgnoreCase(isim2)); // true

        System.out.println(isim2.toUpperCase()); // HARUN
        System.out.println(isim.toLowerCase()); // harun
    }
}
