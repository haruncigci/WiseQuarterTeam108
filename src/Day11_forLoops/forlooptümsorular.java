package Day11_forLoops;

import java.util.Scanner;

public class forlooptümsorular {




    public static void main(String[] args) {
    /*soru 1-1'den 100 e kadar sayilari ayni satirda aralarinda bir bosluk birakarak yazdirin
        for (int i = 0; i < 100; i++) {
            System.out.print(i + " ");
        }
        ==========================================================================================
   soru 2- Kullanicidan pozitif bir tamsayi alin,
   1 den girilen sayiya kadar (girilen sayi dahil) 7 ile bölünebilen sayilari yazdirin



        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Bir Tam sayi giriniz:  ");
        int sayi=scan.nextInt();

        for (int i = 1; i <=sayi ; i++) {
            if (i%7==0){
                System.out.println(i);
            }
        }

Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar dahil olarak
aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri baslangic degerinden kucukse,
uyari yazdirip islemi sonlandirin



        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Baslangic ve Bitis Degerlerini Pozitif olarak Giriniz: ");
        int baslangic=scan.nextInt();
        int bitis=scan.nextInt();
        int toplam=0;

        for (int i = baslangic; i <=bitis ; i++) {
            toplam+=i;

        }
        System.out.println(toplam);

Soru 4- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar dahil olarak
aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri baslangic degerinden kucuk olsa da
program calissin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Baslangic ve Bitis Degerlerini Pozitif olarak Giriniz: ");
        int baslangic=scan.nextInt();
        int bitis=scan.nextInt();
        int toplam=0;


        if (baslangic>bitis) {
            for (int i = baslangic; i >= bitis; i--) {

                toplam += i;
            }
            System.out.println(toplam);

        if (baslangic<bitis){
            for (int i =baslangic; i <bitis ; i++) {
                toplam+=i;
            }
            System.out.println(toplam);
        }


        }

Soru 5- Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini hesaplayin.


        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Bir 20 den kücük  olarak Giriniz: ");
        int sayi=scan.nextInt();


        if(sayi>20) {
            System.out.println("Lütfen 20 den kücük bir sayi Giriniz");
        }else {
            int faktoriyel=1;

            for (int i = sayi; i >0 ; i--) {

                faktoriyel*=i;
        }
            System.out.println(faktoriyel);
        }

Soru 6- Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini hesaplayin. Konsolda
faktoryel hesabinin yapilisini da yazdirin. Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720




        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Bir 20 den kücük  olarak Giriniz: ");
        int sayi=scan.nextInt();
        int faktoriyel=1;

        for (int i = 1; i<=sayi ; i++) {
            for (int j=0; j<=i ; j++){
        } System.out.println(faktoriyel);

 int input=10;

        for (int i = 1; i <=input ; i++) {

            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            } System.out.println(" ");

        }

*/
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Bir 20 den kücük  olarak Giriniz: ");
        int sayi=scan.nextInt();
        int faktöriyel=1;


        for (int i = 1; i <=sayi; i++) {


            System.out.println(i+"!"+"=" + sayi + "="+(faktöriyel *= i));
        }






    }
}
