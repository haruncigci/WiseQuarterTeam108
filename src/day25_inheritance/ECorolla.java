package day25_inheritance;

public class ECorolla extends DToyota{
    ECorolla(){
        System.out.println("Parametresiz Corolla Contructeri Calisti");
    }

    String model="Corolla";
    String üretimYeri="Türkiye";

    ECorolla (String param1){
        System.out.println("String Parametreli Corolla Constructer Calisti");
    }

    public static void main(String[] args) {

        ECorolla cor1=new ECorolla();


    }
    /*
    Bir obje olusturuldugunda ilk deger atamasi yapilabilmesi icin
    Constructer calismalidir
    Inheritance da biliyoruz ki Child classtan olusturulan her Obje
    Parent classtaki özelliklere de sahip olur

    Parent classtaki özelliklere sahip olabilmesi icin
    Parent Classtaki constructerlarda calismalidir.

    Java bu calismayi süper() sayesinde saglar
    Java da her olusturulan classda görünmese de default constructer
    olsugu gibi, extends keyword kullanilan her classta olusturulan her
    constructer n ilk satirinda görünmese de
     */
}
