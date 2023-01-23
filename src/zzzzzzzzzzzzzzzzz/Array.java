package zzzzzzzzzzzzzzzzz;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        //Java da köseli Parantez [] array i tanimlar
        /*
        int [] sayi=new int[5];

        int [] sayilar= {5,10,15,20,25};

        String [] isimler= {"Harun" , "Ayse", "Hanife" , "Sevgi"};// yada
        String [] isimle=new String[7];
        System.out.println(Arrays.toString(sayilar));

         */

        /*
        Verilere yeni atama yaparken;

        int [] sayilar= {5,10,15,20,25};
        sayilar[2]=13;
        System.out.println(sayilar[2]);

         */

        /*
        Verileri daha sonra eklemek istersek
         */

        /*
        Verilen Bir Arraydeki Pozitif tam sayilari toplayip sonucu bize döndren bir method yaziniz
         */

        int []arr= {3,5,9,-6,15,-98,45};

        int toplam=0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>0){
                toplam+=arr[i];
            }

        }







/*
int toplam=0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i]>0){

                toplam += arr[i];
            }
        }

        return toplam;

 */




















    }
}
