package Day12_MethodOlusturma;

public class C04_faktoriyel {
    public static void main(String[] args) {
        //Verilen Bir sayinin 15 den kücük bir pozitif bir tamsayi oldugunu kontrol edin
        //kücükse bir method olusturup ,faktoriyel degerini yazdirin


        int input=5;
        if (input>0 && input<15){
            faktoriyelYazdir(input);
        }else {
            System.out.println("Girilen Sayi 15 den kücük pozitif sayi olmalidir");
        }



    }


    public static void faktoriyelYazdir (int sayi){

        int faktoriyelsonucu=1;

        for (int i = sayi; i >=1 ; i--) {

            faktoriyelsonucu *=i; // her loopda gelen sayiyi önceki deger ile carpalim

        }
        System.out.println("Girilen "  + sayi  + " Icin faktoriyel: " + faktoriyelsonucu);
    }
}
