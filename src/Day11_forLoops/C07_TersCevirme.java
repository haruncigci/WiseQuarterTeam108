package Day11_forLoops;

public class C07_TersCevirme {
    public static void main(String[] args) {
        //Soru 10 Interview Kullanicidan bir String isteyin ve Stringi tersine cevirip kaydedin

        String str="Java ögrenmek icin cok calismak lazim";

        String terstenStr="";

        for (int i = str.length()-1; i >0 ; i--) {
            terstenStr+=str.substring(i,i+1);
        }
        System.out.println(terstenStr);









    }
}
