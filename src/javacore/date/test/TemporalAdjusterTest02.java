package javacore.date.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.*;

class nextWorkingDay implements TemporalAdjuster{
    @Override
    public Temporal adjustInto(Temporal temporal) {
        DayOfWeek dayOfWeek = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
        int days = 1;
        switch(dayOfWeek){
            case THURSDAY: days = 4;
            break;
            case FRIDAY: days = 3;
            break;
            case SATURDAY: days = 2;
            break;
        } return temporal.plus(days, ChronoUnit.DAYS);
    }
}

public class TemporalAdjusterTest02 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(new nextWorkingDay());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());


        now = LocalDate.now().withDayOfMonth(19).with(new nextWorkingDay());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

    }

}
