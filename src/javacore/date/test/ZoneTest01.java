package javacore.date.test;

import java.time.*;
import java.time.chrono.ThaiBuddhistDate;
import java.util.Map;

public class ZoneTest01 {
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault());
        System.out.println();

        ZoneId pariZone = ZoneId.of("Europe/Paris");
        System.out.println(pariZone);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        ZonedDateTime zonedPariZone = now.atZone(pariZone);
        System.out.println(zonedPariZone);

        Instant nowInstant = Instant.now();
        System.out.println(nowInstant);

        ZonedDateTime zonedDateTime = nowInstant.atZone(pariZone);
        System.out.println(zonedDateTime);

        System.out.println(ZoneOffset.MIN);
        System.out.println(ZoneOffset.MAX);

        ZoneOffset zoneOffset = ZoneOffset.of("+06:00");

        OffsetDateTime offsetDateTime = now.atOffset(zoneOffset);
        System.out.println(offsetDateTime);
        OffsetDateTime offsetDateTime1 = OffsetDateTime.of(now, zoneOffset);
        System.out.println(offsetDateTime1);

        OffsetDateTime offsetDateTime2 = nowInstant.atOffset(zoneOffset);
        System.out.println(offsetDateTime2);

        ThaiBuddhistDate fromBuddhist = ThaiBuddhistDate.from(LocalDate.now());
        System.out.println(fromBuddhist);
        LocalDate localDate = LocalDate.of(1000, 1, 1);
        ThaiBuddhistDate fromBuddhist2 = ThaiBuddhistDate.from(localDate);
        System.out.println(fromBuddhist2);
    }
}
