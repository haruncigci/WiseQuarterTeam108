package day14_doWhileLoop_scope;

public class HAstane {
    static String HastaneIsmi="Yildiz Hastanesi";
    String hastaneAdresi="Cankaya/Ankara";
    String personelIsmi;
    String personelAdresi;
    String personelTel;


    public static void main(String[] args) {

        HAstane p1=new HAstane();
        p1.personelIsmi="Kemal";

        HAstane p3=new HAstane();
        p3.personelTel="1846516849";
        

    }
}
