package Day09_stringManipulation;

public class C05_Indexof {
    public static void main(String[] args) {
        String str="Java ile kodlama cok kolay";
        //str "cok" iceriyor mu
        System.out.println(str.contains("cok"));//true

        //Kullanicidan aldigimiz cümle "cok" ile baslayan ilk kelimeyi yazdirin

        System.out.println(str.indexOf('a'));//1 char ile
        System.out.println(str.indexOf("v"));//2 string ile
        System.out.println(str.indexOf("cok"));//17 ile basliyor ve onu veriyor
        System.out.println(str.indexOf("a", 5));//13 de. 5 den sonra ki ilk a 13. siradadir bunu gösterir

        System.out.println(str.indexOf("o"));//10. sirada ilk "o" var.

        int ilkindexofo=str.indexOf("o");
        int ikinciindexof=str.indexOf("o",ilkindexofo+1);
        System.out.println(ilkindexofo + " " + ikinciindexof);
        int ücüncüindekofo=str.indexOf("o",ikinciindexof+1);
        System.out.println(ücüncüindekofo);
    }
}
