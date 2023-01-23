package Day12_MethodOlusturma;

import java.util.Scanner;

public class C05_hesapmakinesi {
    public static void main(String[] args) {
        /*
        Kullanicidan 2 sayi alin ve istedgii islemi alin (+/*-)
        bir method olusturup sayilara istenen islemi uygulayip
        sonucu bize göndürün
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen iki sayi giriniz ");
        double sayi1=scan.nextDouble();
        double sayi2=scan.nextDouble();
        System.out.println("Lütfen Islem Türünü Secin +/*-");
        char islem=scan.next().charAt(0);


        System.out.println(hesapmakinesi(sayi1, sayi2, islem));



    }
    public static double hesapmakinesi(double sayi1,double sayi2,char islem){

        switch (islem){
            case '+':
                return sayi1+sayi2;

            case '-':
                return sayi1-sayi2;

            case '*':
                return sayi1*sayi2;

            case '/':
                return sayi1/sayi2;
            default:
                return 0;



        }





    }

}
