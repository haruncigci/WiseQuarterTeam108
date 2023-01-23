package day26_inheritance;

public class FDizelCorolla extends ECorolla{

    String motor="1.6 Dizel Motor";
    String yakit="Dizel";
    String güvenlik="Abs";
    String renk="Renk Belirtilmedi";

    public static void main(String[] args) {

        FDizelCorolla c1=new FDizelCorolla();
        System.out.println(c1.motor);//"1.6 Dizel Motor";
        System.out.println(c1.yakit);//"Dizel";
        System.out.println(c1.güvenlik);
        System.out.println(c1.renk);

        System.out.println(c1.model);//C
        System.out.println(c1.üretimYeri);//C
        System.out.println(c1.teker);//C
        System.out.println(c1.vites);//C

        System.out.println(c1.marka);//T

        /*
        Bazen child class dan obje olusturmakla beraber
        bu child class in parent classindaki hangi özellikleri aldigini
        bilmek isteriz
        Bu Durumda data türünü constructer i kullanilan classin
        parent classlarindan secebiliriz
         */
        ECorolla c2=new FDizelCorolla();


        //FDizelCorolla c=new FDizelCorolla();












    }


}
