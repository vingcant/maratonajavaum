package javacore.date.test;

import java.time.LocalDate;
import java.time.Period;

public class PeiordTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate nowAfterMonth = LocalDate.now().plusMonths(4);
        Period p1 = Period.between(now, nowAfterMonth);
        Period p2 = Period.ofYears(10);
        Period p3 = Period.ofMonths(10);
        Period p4 = Period.ofDays(10);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);

    }
}
