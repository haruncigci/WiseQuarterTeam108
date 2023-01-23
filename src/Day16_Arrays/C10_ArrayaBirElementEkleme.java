package Day16_Arrays;

import java.util.Arrays;

public class C10_ArrayaBirElementEkleme {

    public static void main(String[] args) {
        //Soru 7- Verilen bir array’e istenen bir elemani ekleyip
        // bize donduren bir method yazin, eski array’e yeni degeri atayin.
        String []isimler={"Ali","Veli" , "Cem"};
        String eklenilecekIsim="Kemal";
        isimler=arayaElemanEkleme(isimler,eklenilecekIsim);
        System.out.println(Arrays.toString(isimler));

    }
    public static String [] arayaElemanEkleme(String[]eklenilecekArray,String eklenecekElement){
        String[]temp=new String[eklenilecekArray.length+1];

        for (int i = 0; i < eklenilecekArray.length; i++) {
            temp[i]=eklenilecekArray[i];
        }
        temp[temp.length-1]=eklenecekElement;
        return temp;
    }


}

