package javacore.date.test;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationTest01 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowAfterMonth = LocalDateTime.now().plusMonths(1);
        LocalTime timeNow = LocalTime.now();
        LocalTime timeAfter = LocalTime.now().plusHours(5);
        Duration d1 = Duration.between(now, nowAfterMonth);
        Duration d2 = Duration.between(timeNow, timeAfter);
        Duration d3 = Duration.between(now, nowAfterMonth.plusMonths(2));
        Duration d4 = Duration.ofDays(5);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
    }
}
