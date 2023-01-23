package day25_inheritance;

public class APersonel {
    protected String isim="Isim atanmadi";
    protected String Soyisim="Soy isim atanmadi";
    protected String telefon="Telefon Atanmadi";

    protected void maas(){
        System.out.println("Hastanemizde Uygulanan Asgari Ücret 1700 Euro'dur.");



    }
    protected void özelsigorta(){
        System.out.println("Tüm Personelin Özel Saglik Sigortasi hakki mevcuttur.");
    }

    private void privateMethod(){
        System.out.println("Private method");
    }


}
