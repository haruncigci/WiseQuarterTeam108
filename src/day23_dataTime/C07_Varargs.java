package day23_dataTime;

public class C07_Varargs {
    public static void main(String[] args) {
        /*
        Kac tane String argüment yazilirsa yazilsin
        Argumentlerin en uzun olanini yazdiran bir method olusturun
        Not: en uzun kelime olarak birden fazla kelime varsa ,ilkini yazdirin
         */



        enuzunuyazdir("Ilyas","Berivan","Murat");
    }

    private static void enuzunuyazdir(String ... kelimeler) {
        String enuzunKelime=kelimeler[0];

        for (String each:kelimeler
             ) {
            if (each.length()>enuzunKelime.length()){
                enuzunKelime=each;
            }
        }
    }
}
