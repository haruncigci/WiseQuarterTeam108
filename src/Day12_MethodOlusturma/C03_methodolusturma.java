package Day12_MethodOlusturma;

public class C03_methodolusturma {
    public static void main(String[] args) {

        /*
        verilen bir sayinin asal olup olmadigini treu/false olarak döndüren
        bir method olusturun

        Asalsayimi methodu booelan bir sonuc döndürdügünden
        bu methodu calistirdigimizda ya direk yazdirmaliyiz
         */

        System.out.println(asalsayiMi(34)); // false

        //veya method call un getirecegi sonucu atamak icin bir variable olusturabilirim

        boolean asalsayimi59=asalsayiMi(59);
        System.out.println("59 Icin Sonuc: " + asalsayimi59); //true


    }

    public static boolean asalsayiMi(int input) {

        boolean asalsayiMi = true;

        for (int i = 2; i <input ; i++) {
            if(input%i==0){
                asalsayiMi=false;
                break;
            }

        }

        return asalsayiMi;




    }
}
