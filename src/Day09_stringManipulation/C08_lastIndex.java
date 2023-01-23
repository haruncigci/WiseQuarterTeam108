package Day09_stringManipulation;

public class C08_lastIndex {
    public static void main(String[] args) {
        String str="Javayi iyi ögrenmek icin cok calismam cok lazim.";

        //ilk a nin indexini yazdiralim
        System.out.println(str.indexOf("a"));
        //son a nin indexini yazdiralim

        System.out.println(str.lastIndexOf("a"));
        System.out.println(str.lastIndexOf("a",15));//15.den yani n den alir geriye dogru gider
        //ilk a yi bulur ve kacinci siradaysa onu bize verir



        //Verilen str de cok kelimesinin kullanimini kontrol edip
        //-cok kelimesi kullanilmamis
        //-bir kere kullanilmis
        //-birden fazla kullanilmis
        //sonuclarindan uygun olani yazdrin

        //Javayi iyi ögrenmek icin cok calismam lazim cok



        int ilkindexof=str.indexOf("cok");
        int sonindexof=str.lastIndexOf("cok");
        if (!str.contains("cok")){
            System.out.println("cümlede Cok kullanilmamis");
        }else if (ilkindexof==sonindexof){
            System.out.println("Cümlede cok kelimesi bir defa kullanilmis");
        }else System.out.println("Cümlede Cok kelimesi birden fazla kullanilmis");



    }
}
