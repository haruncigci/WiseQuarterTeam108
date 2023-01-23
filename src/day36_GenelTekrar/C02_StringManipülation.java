package day36_GenelTekrar;

public class C02_StringManipülation {
    public static void main(String[] args) {
        /*
        Verilen bir cümleden istenen kelimenin kac kere gectigini bulu yazdiran bir method olusturalim
         */

        String cümle="Java basladi ve bitti. Java meger ne güzelmis. Ne pyhton ne C,JAva en iyisi";
        String kelime="ne";

        kullanilanKelimeSayisiBul(cümle,kelime);
    }

    private static void kullanilanKelimeSayisiBul(String cümle, String kelime) {
        int kullanimSayisi=0;
        int index=0;

      while (index<cümle.length()){
          index=cümle.indexOf(kelime,index);
          if (index==-1){
              if (kullanimSayisi==0){
                  System.out.println("Cümlede Aranan Kelime Yok");
                  break;
              }else {
                  System.out.println("Kelime Cümlede" + kullanimSayisi + "kadar Kullanilmistir.");
              }

          }else {
              kullanimSayisi++;
              index++;
          }
      }
    }
}
