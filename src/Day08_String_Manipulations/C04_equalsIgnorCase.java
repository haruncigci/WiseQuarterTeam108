package Day08_String_Manipulations;

public class C04_equalsIgnorCase {
    public static void main(String[] args) {

        String str1 ="Pazar";
        String str2 ="PAZAR";
        String str3 ="pazar";
        String str4 ="PaZaR";

        System.out.println(str1==str2);//false
        System.out.println(str1==str3);//false
        System.out.println(str1==str4);//false

        System.out.println(str1.equals(str2));//false
        System.out.println(str1.equals(str3));//false
        System.out.println(str1.equals(str4));//false

        /*
        Eger iki metni karsilastirirken büyük kück harf duyarliligi (case sensitive)
        önemsiz ise o zaman
        equalsIgnorcase()Kullanilir
         */

        System.out.println("================================");
        System.out.println(str1.equalsIgnoreCase(str2));//true
        System.out.println(str1.equalsIgnoreCase(str3));//treu
        System.out.println(str1.equalsIgnoreCase(str4));//treu




    }
}
