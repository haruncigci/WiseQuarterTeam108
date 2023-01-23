package Day09_stringManipulation;

public class C03_startsWith {
    public static void main(String[] args) {
        String str="Java Mutluluktur";

        System.out.println(str.startsWith("Java"));//treu

        System.out.println(str.startsWith("j"));//false

        System.out.println(str.startsWith("Java Mutluluktur"));//true

        System.out.println(str.startsWith(""));//treu
        System.out.println(str.contains("Mutlu"));//treu

        System.out.println(str.startsWith("Mutlu", 5));//true
        System.out.println(str.startsWith("va", 2));//true




    }
}
