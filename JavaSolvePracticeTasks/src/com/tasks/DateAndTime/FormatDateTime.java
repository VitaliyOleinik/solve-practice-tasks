package com.tasks.DateAndTime;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class FormatDateTime {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        DateTimeFormatter dateTimeFormatter
                = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String stringLD = dateTimeFormatter.format(localDate);

        String stringShortLD = LocalDate.now()
                .format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        String stringLT = LocalTime.now()
                .format(DateTimeFormatter.ofPattern("HH:mm:ss"));

        String stringLDT = LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

        String stringZDT = ZonedDateTime.now()
                .format(DateTimeFormatter
                        .ofPattern("E МММ yyyy HH:mm:ss.SSSZ"));

        String odt2 = OffsetDateTime.now()
                .format(DateTimeFormatter
                        .ofPattern("E МММ yyyy HH:mm:ss.SSSZ"));


        String ot2 = OffsetTime.now()
                .format(DateTimeFormatter.ofPattern("HH:mm:ss,Z"));
    }
}
