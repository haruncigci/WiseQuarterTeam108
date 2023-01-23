package Day09_stringManipulation;

public class C02_contains {
    public static void main(String[] args) {
        String str="Java ögren,mutlu ol";

        //str mutlu icerir mi?
        System.out.println(str.contains("mutlu"));//true

        //charSequence:char dizisi

        System.out.println(str.contains("j"));//false
        System.out.println(str.contains(" "));//true
        System.out.println(str.contains("ö"));//true






























    }
}
