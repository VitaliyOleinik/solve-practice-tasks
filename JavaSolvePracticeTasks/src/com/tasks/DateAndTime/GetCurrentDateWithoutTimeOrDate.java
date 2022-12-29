package com.tasks.DateAndTime;

import java.time.LocalDate;
import java.time.LocalTime;

public class GetCurrentDateWithoutTimeOrDate {
    public static void main(String[] args) {
        LocalDate onlyDate = LocalDate.now();
        LocalTime onlyTime = LocalTime.now();
    }
}
