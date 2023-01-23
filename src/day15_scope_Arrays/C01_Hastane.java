package day15_scope_Arrays;

public class C01_Hastane {

    static String HastaneIsmi="Yildiz Hastanesi";
    static String hastaneAdres=" Cankaya/Ankara";


    String personelIsmi;
    String personelAdresi;
    String personelTel;

    public static void main(String[] args) {
        /*
        Eger tüm methodlardan kullanilabilecek variable lar olsuturmak isterseni
        bu variable lari class level da olusturuyoruz
        Class Level da olusturulacak variabla lar icin 2 iki ihtimal vardir
        1-static variable (Class variable)
        2-instance (static olmayan) variable(onje variable)

        Kural1-static variablelar tüm objeler icin tek bir deger alir
        instance variablelar her obje icin java tarafindan cogaltilir
        Kural2- class level variablelara deger atamasakta da kullanabiliriz
                biz deger atamasak bile java class level variablelara default degerler atar
                non-primitive ===>null (String)
                sayisal primitive===>0
                char ===>hiclik ''
                boolean===>false
        Kural3-Static olan methodlardan static olmayan variable ve methodlara direk ulasilamaz.
                instance variable ve static olmayan methodlari static alanlardan kullanmak isterseniz
                obje üzerinden kullanabilirsiniz..
        Kural4-class da olsuturulan instance variable lar ilk deger atamasini yapar
                yanibir obje ilk olusturuldugunda otomatik olarak instance variable a atanan degeri alir
                deger atamamissa default degerleri alir
                obje olusturulduktan sonra obje üzerinden yapilan atamalar
                class leveldaki instance variable a degil, java tarafindan olusturuluü
                objeye yapistirlan kopya variabla a yapilir
        Kural5-Static variabla a tüm classdan direk ulasilabilir
               Static variabla in degeri degisirse ,tüm objeler iin degismis olur



         */
        C01_Hastane per1=new C01_Hastane();


        System.out.println(per1.personelIsmi); // null
        System.out.println(per1.personelAdresi); // null
        System.out.println(per1.personelTel); // null

        per1.personelIsmi="Fidan";
        per1.personelAdresi="Germany";
        per1.personelTel="015255648335";


        C01_Hastane per2=new C01_Hastane();
        System.out.println(per2.personelIsmi); //null

        per1.personelIsmi="Yusuf";
per2.HastaneIsmi="Java Hastanesi";
        System.out.println(HastaneIsmi);

    }
    public static void method1(){
        System.out.println(HastaneIsmi);
    }
    public void method2(){
        System.out.println(HastaneIsmi);
    }
}
