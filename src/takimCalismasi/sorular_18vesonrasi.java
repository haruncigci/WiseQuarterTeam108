package takimCalismasi;

public @interface sorular_18vesonrasi {

   // public static void main(String[] args) {
        /*
        Soru 18-)
        Girilen araç hızı ve yol kilometresinden,
        gidilen yere varış süresini hesaplayan bir method yazalım.
        Kullanıcıya hızını ve kilometreyi soralım, bunu methoda gönderelim
        ve bize varış süremizi hesaplasın
        İpucu:yol=Hız*zaman
         */
        /*
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen kaç km yol gittiğinizi giriniz");
        int yol=scan.nextInt();
        System.out.println("Lütfen kaç km hız ile gittiğinizi giriniz");
        int hiz=scan.nextInt();
​
        hizProblemi(yol,hiz);
​
​
    }public static void hizProblemi (double yol,int hiz){
        double zaman=0;
        zaman=yol/hiz;
        System.out.println(zaman+" saat de gittiniz");
    }
}
​
public static void main(String[] args) {
        /*
        Soru 19-)
        Kullanıcıdan doğum tarihini alınız. Burcunu hesaplayan bir method yazınız.
        ipucu:
        Switch Case kullanabilirsiniz. Veya Method yazarak Method aracılıgı ile de yapabilirsiniz.
         */
        /*
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen doğduğunuz ayı yazınız  ");
        String ay = scan.next().toLowerCase();
        System.out.println("Lütfen doğum gününüzü pozitif tam sayı olarak giriniz");
        int gun = scan.nextInt();
        burcOgrenme(ay,gun);
        ​
        ​
        }public static void burcOgrenme(String ay,int gun){
        ​
        switch (ay){
        case "ocak" : if(gun>21) System.out.println("Kova");
        else System.out.println("Oğlak");
        break;
        case "şubat" : if (gun>19) System.out.println("Balık");
        else System.out.println("Kova");
        break;
        case "mart" : if (gun>20) System.out.println("Koç");
        else System.out.println("Balık");
        break;
        case "nisan" : if (gun>20) System.out.println("Boğa");
        else System.out.println( "Koç");
        break;
        case "mayıs" : if (gun>21) System.out.println("İkizler");
        else System.out.println("Boğa");
        break;
        case "haziran" : if (gun>22) System.out.println("Yengeç");
        else System.out.println("İkizler");
        break;
        case "temmuz" : if (gun>22) System.out.println("Aslan");
        else System.out.println("Yengeç");
        break;
        case "ağustos" : if (gun>22) System.out.println("Başak");
        else System.out.println("Aslan");
        break;
        case "eylül" : if (gun>22) System.out.println("Terazi");
        else System.out.println("Başak");
        break;
        case "ekim" : if (gun>22) System.out.println("Akrep");
        else System.out.println( "Terazi");
        break;
        case "kasım" : if (gun>21) System.out.println("Yay");
        else System.out.println("Akrep");
        break;
        case "aralık" : if (gun>21) System.out.println("Oğlak");
        else System.out.println("Yay");
        break;
default:
        System.out.println("Yanlış değer girdiniz");
        ​
        ​
        }
        ​
        ​
        }
        }
        ​
public static void main(String[] args) {
        /*
        Soru 20-)
    Kullanıcıdan bir isim yazmasını isteyin, İsim uzunluğu 3 olmalıdır.
     Daha sonra ismin aynı karakterlere sahip olup olmadığını kontrol edin.
    Dize aynı karakterlere sahipse:  "Dizede yinelenen karakterler var" ;
     aynı karakterlere sahip degilse  "String benzersiz karakterlere sahip" yazdırın.
      İsim 3 karakterden uzunsa "Bu kadar uzun cümleyi anlayamam ben agam" yazdırın.
​
     Örnek:
        giriş: ama
        çıkış: Dizede yinelenen karakterler var
​
        İpucu: İf Else ve Char kullanarak çözebiliriz.
         */
        /*
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir isim giriniz");
        String isim= scan.nextLine().toLowerCase();
        ​
        if (isim.length()>3){
        System.out.println("Bu kadar uzun cümleyi anlayamam ben agam");
        } else {
        if (isim.charAt(0)==isim.charAt(1) || isim.charAt(0)==isim.charAt(2) || isim.charAt(1)==isim.charAt(2)){
        System.out.println("Dizede yinelenen karakterler var");
        }else System.out.println("String benzersiz karakterlere sahip");
        ​
        }
        ​
        }
        }
        ​
public static void main(String[] args) {
       /* Soru 21-)
        Bir aydaki gün sayısını bulmak için bir Java programı yazın
        (Mülakat Sorusu / Interview Sorusu / Leak Year)
        Örnek:
        Bir ay numarası girin: 2
        Bir yıl girin: 2016
        Şubat 2016'da 29 gün vardır
        ipucu:
        Switch Case kullanarak çözebiliriz.
        Şubat ayı senelere göre farklılık gösterir. Bunu çözmek için Şubat ayı
        için method kullanmamız gerekiyor!
        Artık yıl ile ilgili olarak NOT düşeyim değerli arkadaşlar!
        ipucu2:
        ARTIK YILI BULABİLMENİZ İÇİN İKİ KOŞULU GÖZ ÖNÜNDE BULUNDURUN!:
        1-) Bir yılın son iki rakamı "00" değilse ve bu sayı 4 e tam bölünebiliyorsa bu yıl artık yıldır.
                Mesela 2008 yılı artık yıldır. Son iki rakamı "00" değildir ve 4 e bölünebilen bir sayıdır.
        2-) Bir yılın son iki rakamı "00" ise ve bu sayı 400 e tam bölünüyorsa, yine bu yıl yine artık yıldır.
                Mesela 2000 yılı artık yıldır.Son iki rakamı "00" ve 400 e bölünebilen bir sayıdır.
     */
        /*
        ​
        ​
        Scanner scan = new Scanner(System.in);
        ​
        System.out.println("Bir yıl giriniz :  ");
        int yil = scan.nextInt();
        System.out.println("Bir ay numarasi giriniz :  ");
        int ayNo = scan.nextInt();
        ​
        switch (ayNo) {
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
        System.out.println(yil+ " Yılı" +" Gün saysi: " + "31");
        break;
        case 2:
        if (yil % 100 == 0 && yil % 400 == 0) {
        System.out.println(yil+ " Yılı" +" Gün saysi: " + "29");
        break;
        } else if (yil % 100 != 0 && yil % 4 == 0) {
        System.out.println(yil+ " Yılı" +" Gün saysi: " + "29");
        break;
        } else {
        System.out.println(yil+ " Yılı" +" Gün saysi: " + "28");
        break;
        }
        case 4:
        case 6:
        case 9:
        case 11:
        System.out.println(yil+ " Yılı" +" Gün saysi: " + "30");
        break;
default:
        System.out.println("gecersiz giriş");
        }
        ​
        }
        }
        ​
public static void main(String[] args) {
        /*
        Soru 22-)
        Kullanıcıdan 2 tamsayı girmesini isteyin, ardından GCD (En Büyük Ortak Bölen)
         ve LCM'yi bulun (En Küçük Ortak Kat)
       Giriş :30 ve 40
        Beklenen Çıktı:
        30 ve 40 için EBOB= 10
        30 ve 40 için EKOK= 120
        ipucu:
        Loopları kullanarak çözebiliriz.
        İki sayının EKOK'u sayıların çarpımının sayıların EBOB'una bölünerek bulunabilir.
         */
        /*
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen iki adet pozitif sayı giriniz");
        int sayi1= scan.nextInt();
        int sayi2=scan.nextInt();
        ​
        int ebob=0;
        int ekok=0;
        ​
        int buyukSayi=0;
        if (sayi1>sayi2){
        buyukSayi=sayi1;
        }else buyukSayi=sayi2;
        for (int i = 2; i < buyukSayi; i++) {
        if (sayi1 % i == 0 && sayi2 % i == 0) {
        ebob = i;
        }
        ​
        }ekok=(sayi1*sayi2)/ebob;
        ​
        ​
        System.out.println("Sayıların ebeobu: "+ebob+ "\n Sayıların ekoku: "+ ekok);
        }
        }
        ​
public static void main(String[] args) {
        /*
        Soru 23-)
        Girdi olarak bir tamsayı kabul eden ve bu tam sayının faktöriyelini hesaplayan bir method yazın.
         Method bize çıktıyı döndürsün.
        Örnek:
        Girdi: 6
        Çıktı: 6!=65432*1=720
        ipucu: Aldıgınız sayıyı methoda gönderin. Methodun içinde For Loop ile faktöriyelini hesaplayın.
         */
        /*
        ​
        System.out.println(faktoriyelOlustur(5));
        }
        ​
public static int faktoriyelOlustur(int sayi) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir pozitif sayı giriniz");
        sayi=scan.nextInt();
        int carpim=1;
        ​
        for (int i = sayi; i >0 ; i--) {
        carpim*=i;
        ​
        }
        return carpim;
        }
        }
        ​
        ​
public static void main(String[] args) {
        /*
        Soru 24-)20'den 0'a kadar çift sayıları yazdırın ancak decrement (i--) kullanmayın.
        Örnek:
        100'den 0'a kadar Çift Sayılar şunlardır: 20 18 16 14 12 10 8 6 4 2 0
        ipucu:
        Loop içinde if kullanarak çözebilirsiniz. % kullanmak iyi bir fikir olabilir :wink:
         */
        /*
        ​
        System.out.print("20 den 0'a kadar Çift Sayılar şunlardır: ");
        int sayi=20;
        ​
        do {
        if (sayi%2==0){
        System.out.print(sayi+" ");
        }
        sayi=sayi-2;
        }while (sayi>=0);
        ​
        }
        }
        ​
public static void main(String[] args) {
        /*
        Soru 25-)
        Alfabeyi konsola yazdırın.
        örnek:
        a b c .. .. .. .. y z
        ipucu: char kullanmak iyi bir fikir olabilir
         */
        /*
        for (int i = 97; i <123 ; i++) {
        System.out.print((char) i+" ");
        ​
        }
        }
        }
        ​
public static void main(String[] args) {
        /*
        Soru 26-)
        Sayının Mükemmel sayı olup olmadığını kontrol eden kodu yazalım.
        NOT:  Kendisi hariç, pozitif bölenlerinin toplamı o sayıya eşitse, bu tür sayılar Mükemmel Sayı olabilir.
        Örnek:
        Giriş :6
        Çıkış: 6 Mükemmel Sayıdır
        Giriş :7
        Çıkış:7 Mükemmel Sayı Değildir
        ipucu: For Loop kullanarak ve belki biraz da if else yardımı ile bu soruyu çözebilirsiniz
         */
        /*
        int toplam=0;
        int sayi=6;
        ​
        for (int i = 1; i <sayi ; i++) {
        if (sayi%i==0){
        toplam+=i;
        }
        ​
        }if (sayi==toplam){
        System.out.println(sayi+" mükemmel sayıdır");
        }else System.out.println("sayı mükemmel sayı değildir");
        }
        }
        ​
        ​
public static void main(String[] args) {
        /*
        Soru 27-) 'a' ile 'z' arasındaki karakterlerin ASCII değerlerini yazdıran bir Java programı yazın
        ipucu: For Loop ve Char kullanarak çözebilirsiniz.
        örnek:
        Ascii value of a = 97
        Ascii value of b = 98
        Ascii value of c = 99
        Ascii value of d = 100
         */
        /*
        System.out.print("Alfabenin Ascii değerleri : ");
        ​
        for (char i = 'a' ;i <='z' ; i++) {
        System.out.print((int) i+" ");
        ​
        }
        */
    }
//}
