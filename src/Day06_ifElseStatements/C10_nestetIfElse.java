package Day06_ifElseStatements;

import java.util.Scanner;

public class C10_nestetIfElse {
    public static void main(String[] args) {

        // Soru 3- Kullanicidan aldigi urun adedi ve ve liste fiyatini alin,
        // kullaniciya musteri karti olup olmadigini sorun.
        // Musteri karti varsa 10 urunden fazla alirsa %20, yoksa %15 indirim yapin,
        // Musteri karti yoksa 10 urunden fazla alirsa %15, yoksa %10 indirim yapin

        /*Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen urun adedini giriniz");
        int urunAdedi= scan.nextInt();
        System.out.println("urunun liste fiyatini giriniz");
        double listeFiyati= scan.nextDouble();
        System.out.println("Musteri kartiniz var mi? \nE:Evet  H:Hayir");
        char kartVarmi=scan.next().charAt(0);
        // Urun miktari ana degisken olsun
        if (urunAdedi>10){ // urun sayisi 10'dan fazla
            if (kartVarmi=='E' || kartVarmi=='e')System.out.println("%20 indirimli toplam fiyat : " + urunAdedi*listeFiyati*0.8);
            else if (kartVarmi=='H' || kartVarmi=='h') System.out.println("%15 indirimli toplam fiyat : " + urunAdedi*listeFiyati*0.85);
            else System.out.println("hatali kart bilgisi");
        } else if (urunAdedi>0) { // urun sayisi 0-10 arasinda
            if (kartVarmi=='E' || kartVarmi=='e')System.out.println("%15 indirimli toplam fiyat : " + urunAdedi*listeFiyati*0.85);
            else if (kartVarmi=='H' || kartVarmi=='h') System.out.println("%10 indirimli toplam fiyat : " + urunAdedi*listeFiyati*0.9);
            else System.out.println("hatali kart bilgisi");
        }else{ // urun sayisi 0 veya daha az
            System.out.println("Hatali urun adedi");
        }
        */
        /*

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Aldiginiz ürünün adedini Giriniz:");
        int ürünadedi= scan.nextInt();
        System.out.println("Lütfen Girdiginiz Ürünün Liste Fiyatini Giriniz: ");
        int listeFiyati= scan.nextInt();

        System.out.println("Müsteri Kartiniz Var mi? \nEvet: E\nHayir: H");
        char kart =scan.next().charAt(0);
        int tutar=listeFiyati*ürünadedi;
        int indirim15=tutar*85/100;
        int indirim10=tutar*90/100;
        int indirim20=tutar*80/100;

        if(kart=='E' || kart=='e'){
            if (ürünadedi>10) System.out.println("%20 Indirimli Tutar: " + indirim20);
            else if (ürünadedi>0) {
                System.out.println("%15 Indirimli Tutar: " + indirim15);
            }else System.out.println("Hatali Giris Yapildi");


         */

        }
}
