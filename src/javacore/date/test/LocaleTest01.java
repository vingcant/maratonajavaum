package javacore.date.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        Locale localeBrazil = new Locale("pt", "br");
        Locale localePortugal = new Locale("pt", "pt");

        Calendar calendar = Calendar.getInstance();

        DateFormat.getDateInstance(DateFormat.FULL, localeBrazil);
        DateFormat.getDateInstance(DateFormat.FULL, localePortugal);

        System.out.println(localeBrazil.getDisplayCountry(localePortugal));
    }
}
