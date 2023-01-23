package day03_dataCasting_Matematikselislemi;

public class C02_exipilitNarrowing {
    public static void main(String[] args) {
        /*
        Eger genis kapasiteli bir data türünden dar kapasiteli bir data türüne casting yapmak isterseniz
        Java bunu otomatik olarak gerceklestirmez,sizden sorumluluk almanizi ister ve bekler.
        islemin gerceklesmesi icin cast yapmak istediginiz degerin önünde (dönüstürmek istediginiz data türü )yazilmalidir
        Exipilicit narrowing yapildiginda data kayiplari veya datanin beklenmedik bir sonuca dönüsmesi mümkündür.
         */
        double dbl=23.5;
        int sayi=(int) dbl;
        System.out.println(sayi); //23



        byte byt =(byte) sayi;
        System.out.println(byt);

        sayi=130 ;
        //byte byt =(byte) sayi; //int daha kapsamli oldugu icin otomatik atama yapmaz, bizden müdahle ister

        System.out.println("int 130'un byte hali : "+byt); // -126

        sayi=257 ;
        byt =(byte) sayi; //int daha kapsamli oldugu icin otomatik atama yapmaz, bizden müdahle ister

        System.out.println("int 255'un byte hali : "+byt); // -1
        sayi=130000 ;
        byt =(byte) sayi; //int daha kapsamli oldugu icin otomatik atama yapmaz, bizden müdahle ister

        System.out.println("int 255'un byte hali : "+byt); // -1
    }
}
