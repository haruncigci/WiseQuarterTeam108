package Day16_Arrays;

import java.util.Arrays;

public class C13_binarySearch {
    public static void main(String[] args) {
        /*
        Binary tree javanin kullandigi özel bi rsiralam yöntemidir
        Binary search methodu binary tree özelligini kullandigindan
        sirali olmayan arraylerde dogru sonuc döndürmeyebilir
        Eger binary search kullanilacaksa ,öncesinde mutlaka sort kullanarak siralama yapilir
        ve sonra binarysearch yapilabilir

         */

        int []arr={2,6,9,3,15,1,7};


        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        Arrays.binarySearch(arr,15);//6
    }
}
