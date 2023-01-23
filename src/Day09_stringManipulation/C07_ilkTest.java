package Day09_stringManipulation;

import java.util.Scanner;

public class C07_ilkTest {
    public static void main(String[] args) {
        //Gittigimiz web sayfasinda aldigimiz String arama sonuclarinda
        //arama sayisinin 50 den fazla oldugunu test edin

        String input="1-48 of 87 results for \"nutella\"";

        /*
        Scanner scan=new Scanner(System.in);


        String nutella=scan.nextLine();

        int index=input.indexOf("87"); //87 degisken oldugu icin her zaman cikmayabilir. bu yüzden bunu kullanmayiz.
        String str=input.substring(index, index + 2);
        int sayi=Integer.parseInt(str);
        if(sayi>50){
            System.out.println("arama sonucu 50 den fazla");
        }else{
            System.out.println("arama sonucu 50 den az");
        }

         */

        int indexof=input.indexOf("of");
        int indexResults=input.indexOf("results");
        String sonucSayisiString=input.substring(indexof+3,indexResults-1);


        //arama sayisinin 50 den fazla oldgunu test edin

        int sonucSayisiInt=Integer.parseInt(sonucSayisiString);//icine yazdigimiz stringi integer a ceviriyor. yada Walue of kullaniriz

        if(sonucSayisiInt>50){
            System.out.println("Nutella arama testi Passed");
        }else System.out.println("Istenen kadar sonuc yok, arama testi failed");
















    }
}
