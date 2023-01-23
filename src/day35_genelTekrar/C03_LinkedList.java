package day35_genelTekrar;

import java.util.LinkedList;

public class C03_LinkedList {
    public static void main(String[] args) {
        /*
        Verilen Bir LinkedListde istenen iki
        indexdeki elementlerin yerlerini degistirin

         */
        LinkedList<String>isimler=new LinkedList<>();
        isimler.add("said");
        isimler.add("hüseyin");
        isimler.add("sevilay");
        isimler.add("harun");
        isimler.add("hümeyra");

        System.out.println(isimler); //[said, hüseyin, sevilay, harun, hümeyra]

        /*
        Said ile harun un yerini degistirelim
        Büyük bir Listede index degerini bilmeden yapalim.
        önce indexi bulalim sonra degistirelim
         */

        String ilkIsim="said";
        String ikinciIsim="Harun";

        String temp="";

        temp=ilkIsim;

        int ilkISimIndex=isimler.indexOf(ilkIsim);
        int ikinciIsimindex=isimler.indexOf(ikinciIsim);

        isimler.set(ilkISimIndex,ikinciIsim);
        isimler.set(ikinciIsimindex,temp);
        System.out.println(isimler);





    }
}
