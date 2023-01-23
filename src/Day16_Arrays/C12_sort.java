package Day16_Arrays;

import java.util.Arrays;

public class C12_sort {
    public static void main(String[] args) {
        /*
        Verilen bir Array i Natural Ordera göre siralayip yazdirin
         */
        String[] isimler={"Hüseyin","Yusuf","Mehmet","Akile","Said", "Mahmut" , "ahmet","adnan"};

        System.out.println(Arrays.toString(isimler));

        Arrays.sort(isimler);

        System.out.println(Arrays.toString(isimler));
        //Eger Büyükten Kücüge Siralamak Istersek
        //Önce sort kullanarak natural order a siralar
        //sonra gecici bir array kullanarak siralamayi terse ceviririz.

    }
}
