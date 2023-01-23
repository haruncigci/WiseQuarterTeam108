package Day10_stringMsnipülstions;

public class C01_NullPointer {
    public static void main(String[] args) {
        String str1="";
        String str2="   ";
        String str3;
        String str4=null;
        System.out.println(str1.length()); //0
        System.out.println(str2.length()); // 4
        System.out.println(str1.isEmpty()); //true



        //null bir deger degil bir isaretcidir(null pointer)
        //null pointer :non prmitive bir objeninolusturuldugunu
        //              ancak bilincli olarak deger atanmadigini isaretlifir.
        //              str4 ün degeri null dir cümlesi yanlis
        //              str4 null olarak isaretlenmistir cümlesi dogrudur.


        //System.out.println(str3.length());

        //System.out.println(str3.concat("Ali Can"));
        //System.out.println(str3.substring(3, 4));
        /*
        java bir variabla i olusturup deger atanmamasina izin verir
        bir variable i deger atamadan olsuturabilirsiniz ama kullanamazsaniz.
        deger atanmayan bir variablei kullanmaya kalkarsaniz
        Java cte verir.

         null pointer ise bu variable a bir deger atanmadigini ve bunun bilincli bir tercih oldugunu Java ya söyler
         dolayisiyla Java kodlarin calismaya devam etmesine izin verir.
         Ancak deger atanmadigi icin methodlarla kullanmaya calisirsaniz
         NullPointerExpention  verir.


         */
        str4=null;

        //System.out.println(str4.length());  //NullPointerExpention
        //System.out.println(str4.substring(3, 4)); // NullPointerExpention

        System.out.println(str4); // null
        System.out.println(str4 + "ALi Can"); // nullAli Can
        System.out.println(str4.concat("Ali Can")); // NullPointerExpention












    }
}
