package Day12_MethodOlusturma;

public class C08_palindrome {
    public static void main(String[] args) {
        /*
        Verilen bir String in Palidrome olup olmadigni yazdirin
        düz okunusu ile tersten okunusu olana denir
         */
        String str="Bu methodlar ne güzelmis";
        String tersStr=C07_terseCevirme.metniTerseCevir(str);

        if (str.equalsIgnoreCase(tersStr)){
            System.out.println("Verilen metin Palidrome");
        }else System.out.println("Verilen Metin palindrome degil");
    }
}
