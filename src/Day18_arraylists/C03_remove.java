package Day18_arraylists;

import java.util.ArrayList;
import java.util.List;

public class C03_remove {
    public static void main(String[] args) {
        List<Integer>sayilar=new ArrayList<>();

        sayilar.add(10);
        sayilar.add(5);
        sayilar.add(7);
        sayilar.add(9);

        System.out.println(sayilar);//[10, 5, 7, 9]

        //sayilar.remove(5);

        /*
        eger Listemiz Integer'lardan olusuyorsa
        parametre olarak yazdigimiz sayinin index mi yoksa silmek istedigimiz obje mi oldugu belirsiz olmasin diye
        Java otomatik olarak girilen sayiyi index kabul eder

        /*
  /*
        Eger Integerlardan olusan listede obje olarak bir elementi silmek isterseniz
        önce onu tanimlamalisiniz..

         */
        Integer silinecekElement=5;
        sayilar.remove(silinecekElement);
        System.out.println(sayilar); // [10, 7, 9]


    }
}
