package Day16_Arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {
        //Verilen bir String array in elementlerini yazdirin

        String[] isimler={"Hüseyin","Yusuf","Mehmet","Akile","Said"}; //[Hüseyin, Yusuf, Mehmet, Akile, Said]

        System.out.println(Arrays.toString(isimler));
        for (int i = 0; i < isimler.length; i++) {

            System.out.print(isimler[i] +" ");
        }


    }
}
