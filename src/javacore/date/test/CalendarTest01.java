package javacore.date.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        Date date = c.getTime();
        System.out.println(date);;
        System.out.println(c.get(Calendar.DAY_OF_YEAR ));

        //date e calendar majoritariamente estão em sistema legado
    }
}
