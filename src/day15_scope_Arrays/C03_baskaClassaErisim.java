package day15_scope_Arrays;

public class C03_baskaClassaErisim {
    public static void main(String[] args) {
        /*


        Static olarak isaretlenen class üyelerine
        classIsmi.staticUyeIsmi seklinde ulasabilirz
        Static olmayan class üyelerine erisebilmek icin obje olusturmamiz gerekir
        Java runtime programdir
        basinca calisir,calistigi sürece yapilan islemleri KALICI olarak tutar.
        calisma bittiginde HERSEY YOK OLUR

         */


        System.out.println(C01_Hastane.hastaneAdres); //Cankaya/Ankara
        C01_Hastane.method1(); // Cankaya/Ankara
        System.out.println(C01_Hastane.HastaneIsmi); //Yildiz Hastanesi

        C01_Hastane per1=new C01_Hastane();
        System.out.println(per1.personelAdresi);
        System.out.println(per1.HastaneIsmi);

        per1.personelIsmi="Belkis";
        per1.personelAdresi="Istanbul";
        per1.HastaneIsmi="ÜSküdar";

        System.out.println(per1.personelIsmi); //Belkis
        System.out.println(per1.personelAdresi); // Istanbul
        System.out.println(per1.HastaneIsmi); //Üsküdar
        System.out.println(per1.personelTel); //null



    }
}
