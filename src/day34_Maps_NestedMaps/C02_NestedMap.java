package day34_Maps_NestedMaps;

import java.util.HashMap;
import java.util.Map;

public class C02_NestedMap {
    public static void main(String[] args) {
        /*
        {
"firstname" : "Ahmet",
"lastname" : "Bulut",
"totalprice" : 500,
"depositpaid" : false,
"bookingdates" : {
       "checkin" : "2021-06-01",
       "checkout" : "2021-06-10"
          },
"additionalneeds" : "wi-fi" }
         */
        Map<String,String> bookingdatesMap=new HashMap<>();
        bookingdatesMap.put("checkin","2021-06-01");
        bookingdatesMap.put("checkout","2021-06-10");

        Map<String,Object> bookingMap=new HashMap<>();
        bookingMap.put("firstname","Ahmet");
        bookingMap.put("Lastname","Bulut");
        bookingMap.put("TotalPrice",500);
        bookingMap.put("depositpaid",false);
        bookingMap.put("bookingdates",bookingdatesMap);
        bookingMap.put("additionalneeds","Wi-fi");
    }

}
