package com.tasks.DateAndTime;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class WorkWithInstant {
    Instant timestamp = Instant.now();
    OffsetDateTime now = OffsetDateTime.now(ZoneOffset.UTC);
    Clock clock = Clock.systemUTC();

    // 2019-02-24Т14:31:33.197021300Z
    Instant timestampFromString = Instant.parse("2019-02-24T14:31:33.197021300Z");

    Instant twoHourLater = Instant.now().plus(2, ChronoUnit.HOURS);

    Instant tenMinutesEarlier = Instant.now()
            .minus(10, ChronoUnit.MINUTES);
    // difference between 2 Instants
    Instant timestamp1 = Instant.now();
    Instant timestamp2 = timestamp1.plusSeconds(10);
    boolean isAfter = timestamp1.isAfter(timestamp2);
    boolean isBefore = timestamp1.isBefore(timestamp2);
    // the difference = 10 s (long)
    long difference = timestamp1.until(timestamp2, ChronoUnit.SECONDS);

    //LocalDateTime
    // 2019-02-24Т15:27:13.990103700
    LocalDateTime ldt = LocalDateTime.ofInstant(Instant.now(), ZoneOffset.UTC);
    // 2019-02-24T17:27:14.013105Z
    Instant instantLDT = LocalDateTime.now().toInstant(ZoneOffset.UTC);

    // ZonedDateTime
    // 2019-02-24T16:34:36.138393100+01:00[Europe/Paris]
    ZonedDateTime zdt = Instant.now().atZone(ZoneId.of("Europe/Paris"));
    // 2019-02-24T16:34:36.150393800Z
    Instant instantZDT = LocalDateTime.now()
            .atZone(ZoneId.of("Europe/Paris")).toInstant();

    // OffsetDateTime
    // 2019-02-24Т17:34:36.151393900+02:00
    OffsetDateTime odt = Instant.now().atOffset(ZoneOffset.of("+02:00"));
    // 2019-02-24Т15:34:36.153394Z
    Instant instantODT = LocalDateTime.now()
            .atOffset(ZoneOffset.of("+02:00")).toInstant();
}
