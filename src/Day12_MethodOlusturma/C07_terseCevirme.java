package Day12_MethodOlusturma;

public class C07_terseCevirme {
    public static void main(String[] args) {
        /*
        Verilen bir Stringi terse cevirip
        o halini bize döndüren bir method olusturun

         */

        System.out.println(metniTerseCevir("Java Candir"));


    }
    public static String metniTerseCevir (String tersecevir){
         String tersStr="";

        for (int i = tersecevir.length()-1; i >=0 ; i--) {
            tersStr+=tersecevir.charAt(i);
        }
        return tersStr;
    }
}
