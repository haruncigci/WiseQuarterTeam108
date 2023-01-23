package Day16_Arrays;

import java.util.Arrays;
import java.util.Scanner;

import static Day16_Arrays.C10_ArrayaBirElementEkleme.arayaElemanEkleme;

public class C11_Ödev {
    public static void main(String[] args) {
        /*
        Kullanicidan Yeni Isimler Alip var olan bir Arraya ekleyen bir Method Olusturun
        Kullanici yeni deger verdigi müddetce C10 daki methodu kullanarak eklemeye devam edin
        Kullanici Q ye bastiginda Arrayin son Halini Döndürün..

         */

        String []isimler= {"Ali", "Veli", "Cem"};
        Scanner scanner=new Scanner(System.in);

        System.out.println("Lütfen Bir Isim Giriniz: ");
        String eklenecekIsim=scanner.nextLine();

        isimler=arayaElemanEkleme(isimler,eklenecekIsim);
        System.out.println(Arrays.toString(isimler));

        while(eklenecekIsim!="q" && eklenecekIsim!="Q"){
            System.out.println("Lütfen Bir Isim Ekleyiniz: ");
            eklenecekIsim=scanner.nextLine();
            isimler=arayaElemanEkleme(isimler,eklenecekIsim);
            System.out.println(Arrays.toString(isimler));
            if(eklenecekIsim.equalsIgnoreCase("Q")){
                break;
            }

        }

    }
    public static String []arayaelemanekleme(String []eklenilecekArray,String eklenecekElement){

        String []temp =new String[eklenilecekArray.length+1];

        for (int i = 0; i < eklenilecekArray.length; i++) {
            temp [i]=eklenecekElement;


        }

        temp[temp.length-1]=eklenecekElement;
        return temp;

    }

}
