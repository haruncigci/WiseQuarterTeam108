package Day10_stringMsnipülstions;

import java.util.Scanner;

public class C11_Forloop {
    public static void main(String[] args) {
        // verilen sayinin faktoryelini hesaplayin
        // 5! = 5*4*3*2*1

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Faktöriyelini ögrenmek istediginiz Sayiyi Giriniz: ");
        int sayi= scan.nextInt();

        int faktöriyel=1;
        for (int i = sayi; i >=1 ; i--) {
            faktöriyel*=i;

        }
        System.out.println(faktöriyel);
    }
}
