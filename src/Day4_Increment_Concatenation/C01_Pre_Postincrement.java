package Day4_Increment_Concatenation;

public class C01_Pre_Postincrement {
    public static void main(String[] args) {
        int sayi=20;
        //sayiyi 3 artiralim

        sayi=sayi+3;
        sayi+=3;
        //
        sayi++;
        sayi++;
        sayi++;
        System.out.println(sayi); //29
        //sayinin degerini iki azaltin
        sayi=sayi-2;
        sayi-=2;
        sayi--;
        sayi--;
        sayi--;
        System.out.println(sayi); //22
        sayi = 10;
        //sayinin degerini bir azaltin ve yazdirin

        sayi--;
        System.out.println(sayi);//

        sayi=10;
        //sayiyi önce yazdirin sonra bir azaltin

        System.out.println(sayi); //10
        sayi--;
        //ekranda görülen 10,ama sayinin son degeri 9 dur

        sayi=10;
        System.out.println(sayi++);
        /*
        Java ayni satirda iki islem oldugunda siralama yapar ve variabladn önce islem varsa önce onu yapar
         */
        System.out.println(sayi);
        sayi=10;
        System.out.println(++sayi);
        //Burda da önce islemi yapar sonra yazdirma yapar
        System.out.println(sayi);




    }
}
