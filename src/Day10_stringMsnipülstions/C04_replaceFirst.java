package Day10_stringMsnipülstions;

public class C04_replaceFirst {
    public static void main(String[] args) {
        String str="Java heyecandir";

        // eger tum a'lari degil de sadece ilk a'yi degistirmek isterseniz
        System.out.println(str.replaceFirst("a","A"));//JAva heyecandir

        //Ilk harf veya Rakami * yapalim

        System.out.println(str.replaceFirst("\\w","*"));//*ava heyecandir


    }
}
