package zzzzzzzzzzzzzzzzz;

import java.util.Scanner;

public class semsiyeörnegi_ifelseif {
    public static void main(String[] args) {
        /*
        Kullaniciya yanina semsiye alip almamasi gerektigini söyleyen bir program yazalim
        Kosullar:
        1-Hava Aygmurlu olabilir
        2-Arabasi olabilir
        
        araba varsa >>hava yagmurluysa
        araba varsa>>hava yagmurlu degil
        
        araba yoksa >>hava yagmurluysa
        araba yoksa>>hava yagmurlu degilse
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Arabaniz Var mi? (true/false)");
        boolean araba=scan.nextBoolean();
        
        System.out.println("Hava Yagmurlu mu?(treu/false)");
        boolean yagmur=scan.nextBoolean();
        
        if (araba){
           if (yagmur) System.out.println("Yagmur yagiyor ancak semsiyeye gerek yok");
        } else if (!araba) {
            if (yagmur) System.out.println("Kesinlikle Semsiye Almalisin");
        }else System.out.println("Semsiye Almana gerek Yok ");


    }
}
