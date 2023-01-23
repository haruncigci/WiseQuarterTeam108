package day15_scope_Arrays;

public class C02_HAstane {
    static String HastaneIsmi="Yildiz Hastanesi";
    static String hastaneAdres=" Cankaya/Ankara";


    String personelIsmi="Personel";
    String personelAdresi="Adres";
    String personelTel="Telefon";

    public static void main(String[] args) {
        C02_HAstane per1=new C02_HAstane();

        C02_HAstane per2=new C02_HAstane();

        per1.personelIsmi="HArun";
        per2.personelAdresi="Cankaya";
        per1.HastaneIsmi="JAva Hastanesi";

        System.out.println(per1.personelTel); // Telefon
        System.out.println(per1.personelIsmi); // HArun


    }
}
