package day30_Interfaces_Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class iterator {
    public static void main(String[] args) {

        List<Integer>sayilar=new ArrayList<>();

        sayilar.add(5);
        sayilar.add(23);
        sayilar.add(2);
        sayilar.add(3);
        sayilar.add(13);
        sayilar.add(8);
        System.out.println(sayilar);

        //Index yapisi kullanmadan tüm elementleri 3 artiralim
        for (Integer each:sayilar
             ) {
            System.out.println(each + 3);
        }
        //Index yapisini kullanmadan 5'den büyük olan elementleri silin

        Iterator itr=sayilar.iterator();
        System.out.print(itr.next());
    }
}
