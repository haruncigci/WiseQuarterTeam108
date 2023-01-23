package day25_inheritance;

public class BDoktor extends APersonel{

    /*
    Olusturdugumuz doktor clasinda isim soyisim gibi
    personel clasinda olusturulan tüm özelliklerin olmasini istiyoruz
    Bu durumda iki tercih var
    1-istenen tüm özellikleri doktor clasinda yeniden olusturabilirsiniz
    2-Doktor clasini Personelin child i yapmak

    Doktor clasini Personel clasinin childi yaptigimizda
    Doktor clasindan olusturulan objeler sadece kendi classlarindaki özelliklere sahip olmaz
    ayni zamanda parent classi olan personeldeki özelliklere de sahip olurlar


    Bir child classtan obje olusturdugumuzda o objenin
    özelliklerini belirlerken önce kendi clasina bakilir
    ve o özellik varsa kullanilir
    Eger kendi clasinda yoksa parent clasa bakilir
    onda da yoksa cte verir


    Bir class extends keyword kullanarak baska bir classi kendisine parent edinirse
    1-parent classtaki tüm özellikleri direk kullanabilir
    (isim,soyisim,telefon,özelsigorta gibi )
    2-Isterse parent classta olan bir özelligi kendisine uygulayablir
    (maas gibi)
    3-Isterse parent classta olmayan kendisine özel yeni özellikler olusturabilir
    (Nöbet gibi)
     */

    public static void main(String[] args) {
        BDoktor dokt1=new BDoktor();
        dokt1.isim="Doktor Kemal";
        dokt1.Soyisim="Bulut";

        System.out.println(dokt1.isim+"," +dokt1.Soyisim+","+dokt1.telefon);
        dokt1.maas();
        dokt1.özelsigorta();
        dokt1.nöbet();

    }
    public void maas(){
        System.out.println("Doktor Maasi 30*8*25 = " + 6000);
    }
    public static void nöbet(){
        System.out.println("Doktorlar haftada bir gün nöbet tutar..");
    }
}

