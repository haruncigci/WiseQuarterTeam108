package day03_dataCasting_Matematikselislemi;

public class C05_WrapperClass {
    public static void main(String[] args) {
        int sayi=10;
        String str="Java Candir";
        /*
        int primitive oldugundan hazir methodlari yoktur
        string non primitive oldugu icin hazir methodlara sahiptir.
        int, char , boolean gibi variabl türlerinde hazir method kullanmak icin Java Integer, Character,Boolean
        gibi wrapper class'lar olusturmustur. Bunlar primitivelerle ayni degerlari alabilir
        ama ekstradan methodlarida vardir.
         */
        Integer sayi2=20;
        /*
        islemlermizi yaparken bazen String olarak tanimlanmis
        ancak matematiksel icerik barindiran variabla lar ile karsilasabiliriz.
        Bu durumda bu tür String variable lari sayiya cevirmek ihtiyacimiz olabilir.
        eger sayiya cevrimek istedigimiz metinlerde harf veya sayi olmayan baska karakter varsa
        Java hata verir.
        Eger sayiya cevrimek istedigimiz metinlerde
        harf veya sayi olmayan karakter varsa java hata vrir.

         */
        String str2="123";
        String str3="354";
        System.out.println(str3+str2);

        int str2Int= Integer.parseInt(str2);
        int str3Int= Integer.parseInt(str3);

        System.out.println(str2Int+str3Int); //377

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        char krk1='9';

        System.out.println(Character.isDigit(krk1));//true
        System.out.println(Character.isAlphabetic(krk1));//false
        System.out.println(Character.isDigit(krk1));//treu

        short sayi3=4;
        int sayi4=sayi3;
        //Wrapper classlarda casting olmaz

        Short sayi6=45;
        //Integer sayi7=sayi6;



    }
}
