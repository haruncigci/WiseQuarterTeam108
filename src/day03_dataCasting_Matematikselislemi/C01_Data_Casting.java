package day03_dataCasting_Matematikselislemi;

public class C01_Data_Casting {
    public static void main(String[] args) {
        /*
        String str=23;
        int sayi="Merhaba Java";
        char ilkHarf=true;
         */
        short sayi2=45;

        int sayi3=sayi2;
        // int=short>> degerin kapasitesinden kücük oldugu icin sorun yok
        int sayi4=45;
        double sayi5=sayi4;
        //double = int >>degerin kapasitesinden kücük oldugu icin sorun yok
        double sayi6 =5;

        //int sayi7=sayi6;
        // int =double double olan degerin kapasitesi ,int olan variable in kapasitesinden büyük oldugu icin
        // java bunu kabul etmez cevirmez

        int sayi8=99;


    }
}
