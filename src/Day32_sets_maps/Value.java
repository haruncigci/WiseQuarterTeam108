package Day32_sets_maps;

import java.util.Map;

public class Value {
    public static void main(String[] args) {
        /*
        MapOlustur methodu bize bir map döndürüyor
        -biz o classdaki map i kullanmak istiyoruz ama
        her seferinde o class a gidip o map i yeniden olusturmamiz isimize yaramaz
        Bu class da bir map olusturmak istedigimizde
        new HashMap<>() yaziyoruz
        ancak bu bize bos bir map getiriyor
        bu kodun yerine mapMethodDepodan ögrenciMApOlustur methodunu calistirirsak
        bize dolu bir map getirir
        bizde onu icinde oldugumuz class da olusturdugumuz ögrenci mape atama yapariz
         */
        Map<Integer,String> ögrenciMap=MapMethodDepo.ogrenciMapOlustur();
        ögrenciMap.put(110,"Cemal-Han-12-M-MF");
        System.out.println(ögrenciMap);


        System.out.println(ögrenciMap.keySet());

        System.out.println(ögrenciMap.values());


    }
}
