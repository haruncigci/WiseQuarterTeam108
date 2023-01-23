package Day10_stringMsnipülstions;

public class C02_replace {
    public static void main(String[] args) {

        String str= "Java Ögren adana ye :)";

        System.out.println(str.replace('a', 'A')); // JAvA ögren, AdAnA ye:)

        System.out.println(str.replace(" ", ""));

        System.out.println(str.replace("Java", "Yazilim"));

        String telefon="555 3451234";
        System.out.println(telefon.replace("555", "333"));

        System.out.println(telefon.replace('3', '7'));
        // istedigimiz karakteri istedigmiz seyle degistirmemize yarar


        //asagidaki arama sonucunun 10 binden fazla oldugunu test edin

        String sonuc= "1-16 of over 100,000 results for \"apple\"";

        int indexover=sonuc.indexOf("over");
        int indexresults=sonuc.indexOf("results");

        String sonucSayisiStr=sonuc.substring(indexover+5,indexresults-1);

        












    }
}
