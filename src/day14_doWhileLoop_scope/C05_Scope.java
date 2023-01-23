package day14_doWhileLoop_scope;

public class C05_Scope {

    int sayi=10;
    static int number;

    public static void main(String[] args) {
        String mainStr="Java";
        number=10;


    }

    public static void method1(){
        String method1Str="Güzeldir";
        number=20;

    }
    public void method2(){
        String method2Str="Candir";
        number=30;

    }
}
