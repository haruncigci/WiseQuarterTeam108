package Day08_String_Manipulations;

import java.util.Locale;

public class C02_toUpperCaseLocal {
    public static void main(String[] args) {
        String str="JAVA CANDIR";
        System.out.println(str.toLowerCase());//Java candir

        str=str.toLowerCase(Locale.forLanguageTag("Tr"));
        System.out.println(str);//java candır

        str="sevgi insani hayata baglar";

        System.out.println(str.toUpperCase());
        str=str.toUpperCase(Locale.forLanguageTag("Tr"));



    }
}
