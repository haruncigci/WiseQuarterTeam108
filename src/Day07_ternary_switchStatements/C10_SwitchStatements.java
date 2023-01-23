package Day07_ternary_switchStatements;

public class C10_SwitchStatements {
    public static void main(String[] args) {
        //Kullanicidan gün numarasini alin ve
        //haftaici veya hafta sonu oldugunu yazdirin

        int günno=7;
        switch (günno) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Haftaici");
                break;
            case 6:
            case 7:
                System.out.println("haftasonu");
                break;
            default:
                System.out.println("Gün Sayisi Bilgisei Gecersiz");


        }
    }
}
