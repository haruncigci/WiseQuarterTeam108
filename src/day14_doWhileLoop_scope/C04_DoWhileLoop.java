package day14_doWhileLoop_scope;

public class C04_DoWhileLoop {
    public static void main(String[] args) {
        /*Soru 3- Kullanicidan bir pozitif sayi isteyin, sayının tam kare olup olmadığını bulunuz, tamkare ise true değilse false yazdırınız.
                Ornek : input : 16, output: 4
                */
        int input=9;
        int karekök=1;
        boolean sonuc=false;


        while (karekök*karekök<=input){


            if(karekök*karekök==input){
                System.out.println("girilen SAyinin Karekökü: " + karekök);
                sonuc=true;
                break;
            }else {
                karekök++;
            }
        }
        System.out.println(sonuc);

        //do While loop ile yapalim;
        input=144;
        karekök=1;
        sonuc=false;

        do {
            if(karekök*karekök==input){
                System.out.println("girilen SAyinin Karekökü: " + karekök);
                sonuc=true;
                break;
            }else {
                karekök++;
            }
        }while (karekök*karekök<=input);
            System.out.println(sonuc);



    }
}
