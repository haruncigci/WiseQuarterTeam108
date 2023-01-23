package Day11_forLoops;

import java.util.Scanner;

public class C01_Forloop {
    public static void main(String[] args) {

        //kullanicidan bir char alip
        //o karakterden sonra gelen 10 karakteri yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen Bir Karakter Giriniz : ");
        char karakter= scanner.next().charAt(0);

        for (int i = 1; i <=10; i++) {
            System.out.println((char)(karakter+i) +"");
        }
    }
}
