package com.tasks.DateAndTime;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class TakeLocalDateTimeFromAllTimeZones {
    public static void main(String[] args) {
        localTimeToAHTimeZones().forEach(System.out::println);
    }

    public static List<String> localTimeToAHTimeZones() {
        List<String> result = new ArrayList<>();
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        DateTimeFormatter formatter
                = DateTimeFormatter.ofPattern("yyyy-MMM-dd'T'HH:mm:ss a Z");
        ZonedDateTime zlt = ZonedDateTime.now();
        zoneIds.forEach((zoneId) -> {
            result.add(zlt.format(formatter) + " in " + zoneId + " is "
                    + zlt.withZoneSameInstant(ZoneId.of(zoneId))
                    .format(formatter));
        });
        return result;
    }

}
