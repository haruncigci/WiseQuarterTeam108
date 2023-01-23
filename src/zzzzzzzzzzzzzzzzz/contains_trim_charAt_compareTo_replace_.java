package zzzzzzzzzzzzzzzzz;

public class contains_trim_charAt_compareTo_replace_ {

    public static void main(String[] args) {

        /*
        contains>>>iceriyor mu diye bakar

        trim>>>> bosluk karakterlerini temizler

        charAt>>>>>indexteki karakteri alir mesela diller.charAt(20)  gbi

        compareTo>>>> iki stringi karsilastirir. mesela diller.compareTo("Almanca") gibi yni hangisi alfade dah önce onu bize gösterir


        replace>>>> String icerisinde degisiklik yapar. mesela diller.replace("ispanyolca" , "arapca"); gibi



         */

        String diller= "ingilizce , fransizca , ispanyolca , türkce";
        System.out.println(diller.contains("ingilizce")); // treu

        System.out.println(diller.trim());

        System.out.println(diller.charAt(22)); // ,

        System.out.println(diller.replace("fransizca", "arapca"));




    }
}
