package Day10_stringMsnipülstions;

import java.util.Scanner;

public class C09_Forloop {
    public static void main(String[] args) {
        // Kullanicidan baslangic ve bitis degerlerini alip
        // bu sinirlar dahil olarak, bu sayilar arasinda 5'in kati olan sayilari yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Baslangic ve Bitis Degerlerini Sirasiyla Giriniz: ");
        int baslangicSayi= scan.nextInt();
        int bitisSayi= scan.nextInt();

        for (int i = baslangicSayi; i <=bitisSayi ; i++) {
            if (i%5==0){
                System.out.print(i + " ");
            }
        }

    }
}
