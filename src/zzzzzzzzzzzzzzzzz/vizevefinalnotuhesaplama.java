package zzzzzzzzzzzzzzzzz;

import java.util.Scanner;

public class vizevefinalnotuhesaplama {
    public static void main(String[] args) {
        /*
        Kullanicinin girmis oldugu vize ve final sinav notlarini kullanarak
        harf notu hesaplayan bir program yaziniz

        0-40>>FF
        41-50>>DD
        51-60>>CC
        61-70>>BB
        71-80>>BA
        81-100>>AA

        vize =>%40
        Final=>%60

         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Vize Notunuzu Giriniz: ");
        int vize=scan.nextInt();
        System.out.println("Lütfen Final Notunuzu Giriniz: ");
        int finalSonucu=scan.nextInt();

        int notOrtalamasi=(vize*40/100)+(finalSonucu*60/100);

        if (notOrtalamasi<=40){
            System.out.println("Not Ortalamaniz : FF kaldiniz" );
        } else if (notOrtalamasi>40 && notOrtalamasi<=50) {
            System.out.println("Not Ortalamaniz :  DD Sinirda gectiniz");
        } else if (notOrtalamasi>50 && notOrtalamasi<=60) {
            System.out.println("Not Ortalamaniz  : CC");
        } else if (notOrtalamasi>60 && notOrtalamasi<=70) {
            System.out.println("Not Ortalamaniz  :BB");
        } else if (notOrtalamasi>70 && notOrtalamasi<=80) {
            System.out.println("Not Ortalamaniz : BA");
        } else if (notOrtalamasi>80 && notOrtalamasi<=100){
            System.out.println("Not Ortalamaniz: AA Tebrikler");
        }else System.out.println("yanlis Not Girisi");



    }
}
