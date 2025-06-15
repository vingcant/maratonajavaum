package javacore.date.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        Locale localeBrazil = new Locale("pt", "br");
        Locale localePortugal = new Locale("pt", "pt");
        Locale localeEngland = new Locale("en", "EN");

        Calendar calendar = Calendar.getInstance();

        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeBrazil);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localePortugal);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeEngland);

        System.out.println(df1.format(calendar.getTime()));
        System.out.println(df2.format(calendar.getTime()));
        System.out.println(df3.format(calendar.getTime()));
        System.out.println(localeBrazil.getDisplayCountry(localePortugal));
    }
}
