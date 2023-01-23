package Day11_forLoops;

import java.util.Scanner;

public class C10_nestedloop {
    public static void main(String[] args) {
        /*
        1
        1  2
        1  2  3
        1  2  3  4
        1  2  3  4  5
        bu sekilde yazdiralim

         */

        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen bir tam sayi Giriniz :");

        int input= scan.nextInt();

        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j + " ");

            }
            System.out.println("");
        }





    }
}
