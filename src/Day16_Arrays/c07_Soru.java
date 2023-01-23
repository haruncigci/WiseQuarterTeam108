package Day16_Arrays;

public class c07_Soru {
    public static void main(String[] args) {
        //Verilen bir array’de istenen bir elemanin var olup olmadigini ve
        //  varsa kac kere kullanildigini yazdiran bir method olusturun

        int []arr={2,3,4,2,5,2,6,7,4,5,1,2,4,6,3,1,9};
        int aranansayi=2;

        elemanbul(arr,aranansayi);//Aradiginiz sayi 2 array de 4adet Kullanilmistir
        elemanbul(arr,8); //Aranan Sayi Arry de yok
        elemanbul(arr,5);//Aradiginiz sayi 5 array de 2adet Kullanilmistir








    }
    public static void elemanbul(int [] arr,int arananSayi){
        int sayac=0;


        for (int i = 0; i < arr.length; i++) {

            if (arr[i]==arananSayi){
                sayac++;
            }

        }
        if (sayac==0){
            System.out.println("Aranan Sayi Arry de yok");
        }else {
            System.out.println("Aradiginiz sayi " + arananSayi + " array de " + sayac + "adet Kullanilmistir");
        }

    }


}
