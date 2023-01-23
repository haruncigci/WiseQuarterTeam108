package Day08_String_Manipulations;

import java.util.Random;

public class C06_length {

    public static void main(String[] args) {

        String str="Java her gecen gün daha da güzellesiyor";

        //sondan 3.karakteri yazdirin

        System.out.println(str.charAt(str.length()-3));//y
        System.out.println(str.length());//50



        //rastgele bir karakterini yazdiralim
        Random rnd =new Random();//rnd degeri icin 0 ile 1 arasinda rastgele bir deger olsuturur
        int index= rnd.nextInt(str.length());//str.length ()'den kücük rastgele bir int üretir

        System.out.println(str.charAt(index));


    }
}
