package zzzzzzzzzzzzzzzzz;

import java.util.Scanner;

public class bardak_seker_if_örnegi {
    public static void main(String[] args) {

        /*
    Kullanicidan bir günde kac bardak cay ictigini ve bir caya kac seker attigi bilgisini alalim.
    Daha sonra 1 yilda ve 60 yillik bir ömürde kac seker kullandiginizi hesaplayip
     kendisine kilogram cinsinden söyleyelim.
     */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen günlük kac bardak ictiginizi Giriniz: ");
        int bardak=scan.nextInt();
        System.out.println("Lütfen bir bardaga kac küp seker attiginizi giriniz: ");
        int küpSeker=scan.nextInt();
        küpSeker=3*küpSeker;

        float yilliksekertüketimi=(float) (bardak*küpSeker*365)/1000;

        System.out.println("Yillik " + yilliksekertüketimi + " kg seker tüketiyorsunuz..");

    }


}
