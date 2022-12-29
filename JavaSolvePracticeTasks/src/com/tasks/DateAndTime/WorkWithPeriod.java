package com.tasks.DateAndTime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class WorkWithPeriod {
    public static void main(String[] args) {
        LocalDate startLocalDate = LocalDate.of(2018, 3, 12);
        LocalDate endLocalDate = LocalDate.of(2019, 7, 20);
        Period periodBetween = Period.between(startLocalDate, endLocalDate);
        System.out.println(periodToYMD(periodBetween));

        //Duration
        LocalTime startLocalTime = LocalTime.of(4, 14, 20, 670);
        LocalTime endLocalTime = LocalTime.of(6, 10, 10, 720);
        // PT1H55M50.00000005S или 6950 секунд
        Duration durationBetweenLT = Duration.between(startLocalTime, endLocalTime);
        System.out.println(durationToDHMSN(durationBetweenLT));
    }

    public static String periodToYMD(Period period) {
        StringBuilder sb = new StringBuilder();
        sb.append(period.getYears())
                .append("у:")
                .append(period.getMonths())
                .append("m:")
                .append(period.getDays())
                .append("d");
        return sb.toString();
    }

    public static String durationToDHMSN(Duration duration) {
        StringBuilder sb = new StringBuilder();
        sb.append(duration.toDays())
                .append("d: ")
                .append(duration.toHoursPart())
                .append("h:")
                .append(duration.toMinutesPart())
                .append("m:")
                .append(duration.toSecondsPart())
                .append("s:")
                .append(duration.toNanosPart())
                .append("n");
        return sb.toString();
    }

}
