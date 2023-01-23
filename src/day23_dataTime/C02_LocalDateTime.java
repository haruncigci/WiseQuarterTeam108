package day23_dataTime;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class C02_LocalDateTime {
    public static void main(String[] args) {
        LocalDateTime ldt=LocalDateTime.now(ZoneId.of("Turkey"));

        System.out.println(ldt); //2022-12-20T12:29:34.607964

        ldt=LocalDateTime.now();

    }
}
