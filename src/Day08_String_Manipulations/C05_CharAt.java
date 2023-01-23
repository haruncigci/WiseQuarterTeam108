package Day08_String_Manipulations;

public class C05_CharAt {
    public static void main(String[] args) {



        String str= "Java Güzeldir";//13 karakter barindirir.

        //Java da indeks sifirdan baslar
        //J sifirinci indektedir. r==12.indekstedir
        //charAt (index) ile istedigimiz indekstedi char a ulasabiliriz.

        //ilk a yi yazdiralim
        System.out.println(str.charAt(1));

        //sondan 2.harfi yazdiralim
        System.out.println(str.charAt(13-2));//karakter sayisi -2. indeksindeki eleman

        System.out.println(str.toUpperCase().charAt(13-4));//L

        //charAt ()methodu bize char döndürdügü icin tuAuppercase ()calismaz
        //String methodlarini charAt() ile kullanmak isterseniz
        //charAt() den önce kullanmaliyiz

        System.out.println(str.charAt(18));
        //Eger index olarak karakter sayisi veya daha büyük bir deger girersek
        //o index i bulamayacagi icin hata verir.

    }

}
