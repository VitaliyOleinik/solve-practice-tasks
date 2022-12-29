package com.tasks.DateAndTime;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class HumanAge {
    public static void main(String[] args) {
        LocalDate startLocalDate = LocalDate.of(1977, 11, 2);
        LocalDate endLocalDate = LocalDate.now();
        long years = ChronoUnit.YEARS.between(startLocalDate, endLocalDate);
        Period periodBetween = Period.between(startLocalDate, endLocalDate);
    }
}
