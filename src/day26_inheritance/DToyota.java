package day26_inheritance;

public class DToyota {
    /*
    Bir Objenin data türü , constructer olarak kullanilan class
    veya o clasin parent classlari olabilir
   Data türü olarak parent class secilmesindeki
    amac child classtan olusturulan objenin parent classin
    tüm child classlarinin tasidigi  ortak özellikleri vurgulamaktadir
    (personel toplantisina katilan doktor kemal , bashemsire ayse gibi)

    Data türü ile constructer farkli oldugunda variable ile methodlar
    ffarkli davranirlar
    Variable larin alacagi degeri bulmak icin aramaya
    data türü olan classdan baslariz
    o class da yoksa parentlarina bakariz
    ve ilk buldugumuz degeri atama yapariz
    data türü olan class veya parentlarinda bulunamazsa CTE olur

     */

    String marka="Toyota";
    String model="Model Belirtilmedi";
    String motor="Motor Belirtilmedi.";
    String yakit="Yakit Belirtilmedi";

}
