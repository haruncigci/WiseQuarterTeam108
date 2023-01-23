package day13_methodOverloading_whileLoop;

public class C02Methodoverloading {
    public static void main(String[] args) {
        String str="Java Cok Güzel";


        System.out.println(str.substring(5));//cok güzel
        System.out.println(str.substring(3, 5));//a
        /*
        Eger sectigimiz isimde birden fazla method varsa buna oberloading denir.
        ve ayni isimdeki methodlardan hangisinin calisacagina argument/parametre uyumu karar verir.
         */
        toplama(4,8);//12
        toplama(5,6);//11
        /*
        Java ayni class icerisinde ayni isim ve ayni data türünden parametre sayisi ile 2 method olusturmaniza izin vermez
        1-Ismini degistirebilirsiniz,ancak bu durumda overloading olmaz
        Overloading ayni isimde ama farkli isleve sahip methodlar olusturmak demektir
        2-Parametre sayisini degistirince sikinti kalmaz
        3-Ayni sayida parametre yazip,parametrelerin data türünü degistirebiliriz
        veya farkli data türündeki parametrelerin yerini degistirebiliriz
         */


    }
    public static void toplama(int sayi1,int sayi2){
        System.out.println("2 Tam sayinin Toplami:  " + (sayi1+sayi2));
    }
    public static void toplam(int a, int b){
        System.out.println("2 Tam sayinin Toplami:  "+(a+b));
    }
    public static void toplam(int sayi1,int sayi2,int sayi3){
    System.out.println("3 Tam SAyinin toplami:   ");
}
}
