package Day18_arraylists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C11_soru {
    public static void main(String[] args) {
        /*
        Soru 3- Verilen String bir listede istenmeyen harf iceren elementleri silip,
        kalan kismini list olarak bize donduren bir method olusturun
         */

        List<String> isimler= C10_sorular.isimListesiOlustur();
        System.out.println("Istenmeyen harfin oldugu isimler silindi. \nKalan Isimler  "
                                + istenmeyenIsimleriSil(isimler) );

    }


    public static List<String>istenmeyenIsimleriSil(List<String>isimler){
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen iceren isimleri silmek icin bir harf giriniz");
        String istenmeyenHarf=scan.next().substring(0,1);

        List<String>yeniliste=new ArrayList<>();
        for (int i = 0; i < isimler.size(); i++) {
                if (!isimler.get(i).contains(istenmeyenHarf)){
                    yeniliste.add(isimler.get(i));

                }
        }return yeniliste;
    }
}

