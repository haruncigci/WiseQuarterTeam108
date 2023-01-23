package Day16_Arrays;

import java.util.Arrays;

public class C09_Arraye_Yeni_Deger_Atama {
    public static void main(String[] args) {
        int []arr1={1,2,3};

        //arr1={3,6,1,8}
        //arr1={5,7,1}

        //arr1=new int[5]

        System.out.println(Arrays.toString(arr1));
        /*
        14.cü satirdaki atama ile java arr1 in pointerini eski bir arrayden silip
        new keyword u ile olsuturdugumuz yeni array e yönlendirir.
        Eski elementleri de koruma istersek ne yapmaliyiz?
        O zaman atama yapmadan önce yeni array i hazirlamaliyiz
        Bunun icin bos bir yeni array olusturup
        eski arraydeki elementleri  yeni arrray a tasiyip
        sonra atamayi yapabiliriz

         */

        int []temp=new int[5];
        for (int i = 0; i < args.length; i++) {
            temp[i]=arr1[i];
        }
        System.out.println(arr1);
    }
}
