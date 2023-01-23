package Day12_MethodOlusturma;

public class C02_MethodOlusturma {
    public static void main(String[] args) {

        //Verilen 2 Sayiyi carpip sonucu yazdiran bir method olsuturun

        //bir method ancak method calla yapilnca calisir
        //method call icin method adi ve parametrelere uygun argument yazilmalidir
        //method call icerisinde yazilan variable veya degerlere argument denir


        carpyazdir(5,8); //40.0
        // argumentler ile parametler uyumlu degilse cte olur




    }
    public static void carpyazdir(double sayi1,double sayi2){

        System.out.println(sayi1 * sayi2);
    }

}
