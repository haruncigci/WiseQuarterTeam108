package Day18_arraylists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C10_sorular {
    public static void main(String[] args) {
        /*
        Soru 2- Kullanicidan istedigi kadar isim alip,
        Q’ya bastiginda girdigi isimleri bize
        liste olarak dondurecek bir method olusturun.
         */

        List<String> isimlerListesi=isimListesiOlustur();
        System.out.println(isimlerListesi);


    }

    public static List<String>isimListesiOlustur(){

        List<String>isimListesi=new ArrayList<>();

        String girilenIsim="";
        Scanner scan=new Scanner(System.in);

        while (!girilenIsim.equalsIgnoreCase("q")){

            System.out.println("Listeye Eklemek Icin bir Isim Giriniz:  \nBitirmek icin q ya basin");
            girilenIsim=scan.nextLine();
            if (!girilenIsim.equalsIgnoreCase("q"))
            isimListesi.add(girilenIsim);
        }

        return isimListesi;
    }
}
