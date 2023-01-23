package Day10_stringMsnipülstions;

public class C08_Forloop {
    public static void main(String[] args) {
        // 1 ile 1000 arasindaki sayilari(sinirlar dahil) yanyana yazdirin
        // yazdirma islemi bittiginde
        // "tum bu sayilarin toplami = " deyip sayilarin toplamini yazdirin

        int toplam=0;

        for (int i = 1; i <=100 ; i++) {
            toplam+=i;
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Tüm Sayilarin Toplami : " + toplam);
    }
}
