package Day05_IfStatements;

import java.util.Scanner;

public class C02_Ifstatements {
    public static void main(String[] args) {
        /*
        Basit if cümleleri kodun geri kalanindan bagimsizdir. Sadece bir sarta odaklanir,if body calisir,
        o sart true ise if body calisir
        sart false ise if body calismaz
        Birden fazla bagimsiz if cümlesi kullanilmissa her cümle birbirinden bagimsiz olacagindan
        bazi degerler icin tüm if bodyleri calisirken
        bazi degerler icin
        Kullanicidan bir sayi alip
        pozitif ise sayi,
        100 ile 999 arasinda ise (sinirlar dahil)"pozitif 3 basamakli sayi"
        3 ile bölünebiliyorsa "3 ün kati"
        birler basamagi 7 ise "mükemmel "
        seceneklerinden uygun olanlari yazdirin.

         */
        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen bir tam Sayi Giriniz: ");

        int sayi=scan.nextInt();

        if (sayi>0){
            System.out.println("Sayi Pozitif");
        }

        if (100<=sayi && sayi<=999){
            System.out.println("Pozitif 3 basamakli");
        }
        if (sayi%3==0){
            System.out.println("3'ün kati");
        }
        if (sayi%10==7){
            System.out.println("mükemmel");
        }

    }
}
