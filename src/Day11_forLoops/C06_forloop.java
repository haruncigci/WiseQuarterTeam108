package Day11_forLoops;

import java.util.Scanner;

public class C06_forloop {

    public static void main(String[] args) {
        /*
        Soru 8: Interview
        Kullanicidan pozitif bir sayi alin,
        1 den baslayark tüm tamsayilari yazdirin,
        3 ile bölünebilen bir sayiya gelirse , sayi yerine fizz
        5 ile bölünebilen bir sayiya gelirse sayi yerine buzz
        hem 3 ile hem 5 ile bölünebilen bir sayiya gelirse sayi yerine fizzbuzz yazdirin
         */

        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen bir pozitif Tam sayi Giriniz: ");
        int input= scan.nextInt();

        for (int i = 1; i <=input ; i++) {
            if(i%3==0 && i%5==0) System.out.println("fizzbuzz");
            else if(i%3==0) System.out.print("fizz ");
            else if (i%5==0) System.out.print("Buzz ");
            else System.out.print(i + " ");

        }



    }
}
