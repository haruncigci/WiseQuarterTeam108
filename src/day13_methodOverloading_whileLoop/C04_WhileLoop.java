package day13_methodOverloading_whileLoop;

public class C04_WhileLoop {
    public static void main(String[] args) {
        /*
        iki basamakli sayilardan 7 ile bölünebileri yazdirin
         */
        for (int i = 0; i < 100; i++) {
            if (i%7==0) System.out.println(i+" ");
        }
        System.out.println("================While Loop ile Cözümü =============================");
        int sayi=10;
        while (sayi<100){
            if (sayi%7==0) System.out.println(sayi+" ");
            sayi++;
        }

        // for loop ile yapilabilecek soruyu while ile yapmak cok da gerekli degil

    }
}
