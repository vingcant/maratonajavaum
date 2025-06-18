package javacore.date.test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {
        LocalDateTime anniversary = LocalDateTime.of(2006, Month.MAY,19,4,57);
        LocalDateTime now = LocalDateTime.now();

        System.out.println(ChronoUnit.YEARS.between(anniversary, now)+" anos");
        System.out.println(ChronoUnit.MONTHS.between(anniversary, now)+" meses");
        System.out.println(ChronoUnit.WEEKS.between(anniversary, now)+" semanas");
        System.out.println(ChronoUnit.DAYS.between(anniversary, now)+" dias");
    }
}
