package javacore.date.test;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(16, 42, 20);
        LocalTime now = LocalTime.now();
        System.out.println(now);
        System.out.println(time);
        System.out.println(time.getMinute());
        System.out.println(time.get(ChronoField.CLOCK_HOUR_OF_DAY));
        System.out.println(LocalTime.MIN);

    }
}
