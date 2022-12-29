package com.tasks.DateAndTime;

import java.time.*;
import java.time.format.DateTimeFormatter;

import static java.time.ZonedDateTime.parse;

public class ConvertFromStringToDateTime {
    public static void main(String[] args) {
        // 06 - это месяц, 01 - это день
        LocalDate localDate = LocalDate.parse("2020-06-01");
        //
        LocalTime localTime = LocalTime.parse("12:23:44");
        //
        LocalDateTime localDateTime = LocalDateTime.parse("2020-06-01T11:20:15");
        //
        ZonedDateTime ZonedDateTime
                = parse("2020-06-01Т10:15:30+09:00[Asia/Tokyo]");
        //
        OffsetDateTime offsetDateTime
                = OffsetDateTime.parse("2007-12-03Т10:15:30+01:00");
        //
        OffsetTime offsetTime = OffsetTime.parse("10:15:30+01:00");
        //
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate localDateFormatted = LocalDate.parse("01.06.2020", dateFormatter);
        //
        DateTimeFormatter timeFormatter
                = DateTimeFormatter.ofPattern("НН|mm|ss");
        LocalTime localTimeFormatted
                = LocalTime.parse("12|23|44", timeFormatter);
        //
        DateTimeFormatter dateTimeFormatter
                = DateTimeFormatter.ofPattern("dd.MM.yyyy, HH:mm:ss");
        LocalDateTime localDateTimeFormatted
                = LocalDateTime.parse("01.06.2020, 11:20:15", dateTimeFormatter);
        //
        DateTimeFormatter zonedDateTimeFormatter
                = DateTimeFormatter.ofPattern ("dd.ММ.yyyy, HH:mm:ssXXXXX ’ [’W]'");
        ZonedDateTime zonedDateTimeFormatted
                = ZonedDateTime.parse("01.06.2020, 11:20:15+09:00 [Asia/Tokyo]",
                zonedDateTimeFormatter);
        //
        DateTimeFormatter offsetDateTimeFormatter
                = DateTimeFormatter.ofPattern("yyyy.MM.dd, HH:mm:ss, XXXXX");
        OffsetDateTime offsetDateTimeFormatted
                = OffsetDateTime.parse("2007.12.03, 10:15:30, +01:00",
                offsetDateTimeFormatter) ;
        //
        DateTimeFormatter offsetDateTimeFomatter
                = DateTimeFormatter.ofPattern("yyyy.MM.dd, HH:mm:ss, XXXXX");
        OffsetDateTime offsetDateTimeFomatted
                = OffsetDateTime.parse("2007.12.03, 10:15:30, +01:00",
                offsetDateTimeFomatter) ;
        // 2020-06-01 в результате даст ISO_LOCAL_DATE, 2020-06-01
        String localDateAsString = localDate.toString();
        // Явный часовой пояс
        DateTimeFormatter zonedDateTimeFormatter1
                = DateTimeFormatter.ofPattern("dd.ММ.уууу, HH:mm: ssXXXXX ’['W']’")
                .withZone(ZoneId.of("Europe/Paris"));
        ZonedDateTime zonedDateTimeFormatted1
                = ZonedDateTime.parse("01.06.2020, 11:20:15+09:00 [Asia/Tokyo]",
                zonedDateTimeFormatter1);
        // На этот раз строка представляет дату-время в часовом поясе Европа/Париж:
        // 01.06.2020, 04:20:15+02:00 [Europe/Paris]
        String zonedDateTimeAsFormattedString
                = zonedDateTimeFormatted.format(zonedDateTimeFormatter);
    }
}
