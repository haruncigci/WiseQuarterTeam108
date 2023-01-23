package day13_methodOverloading_whileLoop;

import java.util.Random;

public class C07basitOyun {
    public static void main(String[] args) {
        /*
        random olarak 1 ile 100 arasinda bir sayi olusturun
        kullanicidan bu sayiyi bilmesini isteyin
        kullanici her deger girisinde tuttugunuz sayi ile karsilatirp
        tahminini büyüt yada kücüt deyin.
        dogru bilgidinde
        -3 veya daha az tahminde bildiyse"Vaooww"
        -4-8 tahminde bildiyse "Aferin"
        -daha fazla tahminde bildiyse
        "basarisiz" yazdirin
         */

        Random rnd=new Random();
        int tutulanSayi= rnd.nextInt(100);

    }
}
