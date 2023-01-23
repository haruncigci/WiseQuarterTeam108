package day02_Variables_scanner;

public class C03_NonPrimitiveDataTypes {

    public static void main(String[] args) {

        String str="Java Candir";
        int sayi=10;

        /*
        primitive data türlerinin hazir methodlari yoktur.
        ancak nnon-primitive data türlerinin önceden hazirlanmis methodlari vardir.
        primitive data türlerini bas harflari kücük harfle baslar

         */

        System.out.println(str.toLowerCase()); //java candir olarak degistirir. harfleri kücük harflerle yazdirir.
                                                // ancak anlik degistirir. kalici degistirmez. yani yeni bir kod yazilinca gider
        System.out.println(str.toUpperCase()); //java candir yazisinin harflerini büyütür.

        System.out.println(str.isEmpty());//false cvbini verecek. cünkü bos mu diye soruyor.




    }
}