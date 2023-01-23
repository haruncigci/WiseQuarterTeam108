package Day08_String_Manipulations;

public class C07_substring {
    public static void main(String[] args) {
        String str="Java ögren, isi kap";


        System.out.println(str.length());//karakter sayisi :19

        //metnin tam ortasindaki karakteri nsil buluruz
        System.out.println(str.charAt(str.length()/2));//n karakteri
        //Son karakteri yazdiralim
        System.out.println(str.charAt(str.length()-1));// p karakteri

        //Bir karakteri degilde verilen Stringin icerdigi bir metin parcasini elde etmek istersek
        //örnegin"ögren"kelimesini yazdiralim
        System.out.println(str.substring(5, 9));//ögre
        //substring (baslangic,bitis) methodunda
        //baslangic olarak yazilan index dahil (inclusive)
        //bitis olarak yazilan index haric(exclusive)'dir
        System.out.println(str.substring(5, 10));//ögren

        //str dan "Java"kelimesini yazdiralim
        System.out.println(str.substring(0, 4));//java

        //str den kap yazdiralim
        System.out.println(str.substring(16, 19));//kap
        System.out.println(str.substring(16));//kap
        System.out.println(str.substring(str.length() - 3));//kap
        //substring kullanarak sadece J harfini yazdirin

        System.out.println(str.substring(0,1));//J

        //substring kullanarak 9.indeksteki harfi büyük olarak yazdirin

        System.out.println(str.substring(9, 10));//n

        System.out.println(str.toUpperCase().charAt(9));//N

        //charAt() kullanmak yerine substring kullanmak daha avantajli olabilir
        //cünkü substrin kullaninca ifade hala string oldugundan
        //method kullanmaya devam edebiliriz

        System.out.println(str.substring(5, 5));//bsy yazdirmaz, hiclik yazdirir, konsolda bos bir satir olusur
        System.out.println("=============");
        //System.out.println(str.substring(4, 3));//hata veriri
        //System.out.println(str.substring(25, 28));//hata verir

        System.out.println(str.substring(str.length())); //bos bir satir olusur
        //System.out.println(str.charAt(str.length())); //hata veriri
        //System.out.println(str.substring(str.length()+1));//hata verir



    }
}
