package javacore.date.test;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;

public class LocalDateTest01 {
    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2002, Month.MAY, 20);
        LocalDate dateNow = LocalDate.now();

        System.out.println(date);
        System.out.println(dateNow);
        System.out.println(date.getYear());
        System.out.println(date.isLeapYear());
        System.out.println(date.get(ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR));
        System.out.println(date.lengthOfMonth());


    }
}
