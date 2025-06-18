package javacore.formatation.test;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        String format = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(format);

        LocalDate parse = LocalDate.parse("2025-06-18", DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(parse);

        LocalDateTime now = LocalDateTime.now();
        String format1 = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(format1);
        LocalDateTime parse1 = LocalDateTime.parse("2025-06-18T19:38:28.3646257");
        System.out.println(parse1);

        DateTimeFormatter formatterJP = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        String formatJP = LocalDate.now().format(formatterJP);
        System.out.println(formatJP);
        LocalDate parseJP = LocalDate.parse("2025/06/18", formatterJP);
        System.out.println(parseJP);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.UK);
        String format2 = LocalDate.now().format(dateTimeFormatter);
        System.out.println(format2);
        LocalDate parse2 = LocalDate.parse("18.June.2025", dateTimeFormatter);
        System.out.println(parse2);
    }
}
