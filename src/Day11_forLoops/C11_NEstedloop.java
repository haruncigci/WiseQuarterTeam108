package Day11_forLoops;

public class C11_NEstedloop {
    public static void main(String[] args) {
        /*

        input degerine kadar her satirda input sayisi bir artirarak sonra azaltip asagidaki sekli yazdirin
        *
        * *
        * * *
        * * * *
        * * *
        * *
        *
        Bu sekli yapalim
        ipucu:artis ile azalis kisimlarini 2 ayri nested loop ile yapmaliyiz


         */

        int input=10;

        for (int i = 1; i <=input ; i++) {

            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            } System.out.println(" ");

        }
        for (int i = input-1; i >=1 ; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }


    }
}
