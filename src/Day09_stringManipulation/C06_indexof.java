package Day09_stringManipulation;

import java.util.Scanner;

public class C06_indexof {
    public static void main(String[] args) {
        //Kullanicidan aldigimiz cümle "cok" ile baslayan ilk kelimeyi yazdirin
        //Cümlede "cok" kelimesi gecmiyorsa "cümlede cok kelimesi ile baslayan kelime yok"

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir Cümle Giriniz:");
        String girilenCümle=scan.nextLine();

        //Sinavlarimizda cokdan secmeli sorular kullaniyoruz
        //javayi cok seviyoruz
        //bu kadar coklu secenek olur mu


        if(!girilenCümle.contains("cok")) {
            System.out.println("cümlede cok ile baslayan kelime yok");
        }else {
            int cokIndexi=girilenCümle.indexOf("cok");
            int boslukIndexi=girilenCümle.indexOf(" ",cokIndexi+1);
            System.out.println(girilenCümle.substring(cokIndexi, boslukIndexi));
        }







    }
}
