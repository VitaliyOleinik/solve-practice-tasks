package com.tasks.DateAndTime;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Comparator;

public class HumanAge {
    public static void main(String[] args) {
        LocalDate startLocalDate = LocalDate.of(1977, 11, 2);
        LocalDate endLocalDate = LocalDate.now();
        long years = ChronoUnit.YEARS.between(startLocalDate, endLocalDate);
        Period periodBetween = Period.between(startLocalDate, endLocalDate);
    }

    public static <T> T max(T[] arr, Comparator<? super T> c) {
        T max = arr[0];

        for (T elem: arr) {
            if (c.compare(elem, max) > 0) {
                max = elem;
            }
        }
        return max;
    }
}
