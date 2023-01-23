package day13_methodOverloading_whileLoop;

public class C03_overloading {
    public static void main(String[] args) {

        /*
        ilk olarak yüzde yüz parametreleri arar java
        Eger yüzde yüz uyumlu yoksa calisabilecek method var mi diye kontrol eder
        calisacak method birden fazla olursa, min. casting yaparak kullanabilecegini tercih eder
         */

    }
    public static void toplama(int sayi1,int sayi2){
        System.out.println("2 Tam sayinin Toplami:  " + (sayi1+sayi2));
    }
    public static void toplam(int a, int b){
        System.out.println("2 Tam sayinin Toplami:  "+(a+b));
    }
    public static void toplam(int sayi1,int sayi2,int sayi3){
        System.out.println("3 Tam SAyinin toplami:   ");
    }
}
