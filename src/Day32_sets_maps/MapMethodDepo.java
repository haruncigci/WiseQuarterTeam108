package Day32_sets_maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapMethodDepo {

    public static Map<Integer, String> ogrenciMapOlustur() {

        Map<Integer, String> ogrenciMap = new HashMap<>();

        ogrenciMap.put(101, "Ali-Can-11-H-MF");
        ogrenciMap.put(102, "Veli-Cem-10-K-TM");
        ogrenciMap.put(103, "Ali-Cem-11-K-TM");
        ogrenciMap.put(104, "Ayse-Can-10-H-MF");
        ogrenciMap.put(105, "Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106, "Sevgi-Can-10-K-MF");

        return ogrenciMap;
    }

    public static boolean isimIleÖgrenciCagirma(Map<Integer, String> ögrenciMap, String isim) {


        //  1- tum value'leri bir collection olarak kaydedelim
//    [Ali-Can-11-H-MF, Veli-Cem-10-K-TM, Ali-Cem-11-K-TM, Ayse-Can-10-H-MF, Sevgi-Cem-11-M-TM, Sevgi-Can-10-K-MF, Cemal-Han-12-M-MF]
        Collection<String> valuesCollection = ögrenciMap.values();
// 2- for-each kullanarak her bir value'yu ele alalim  Ali-Can-11-H-MF
// 3- -'yi kullanarak split yapalim [Ali, Can, 11, H, MF]
// 4- split yaptigimiz array'den isim bilgisini alalim 0.index
// 5- eger value'den aldigimiz isim, aranan isim ile ayni ise
//    true dondurup, for-each'i bitirelim
// 6- for-each bittiginde true olmadiysa false dondurelim


        return false;
    }
}

