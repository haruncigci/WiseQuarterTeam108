package zzzzzzzzzzzzzzzzz;

public class faktöriyel {
    public static void main(String[] args) {
        int sayi=5;
        int faktöriyel=1;

        for (int i = 1; i <=5 ; i++) {
            for (int j = (5-i); j > 1; j--) {

                System.out.print(i+j);
            }
            System.out.println();
        }
    }
}
