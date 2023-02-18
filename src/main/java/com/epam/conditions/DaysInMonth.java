package com.epam.conditions;

import java.time.LocalDate;

public class DaysInMonth {

    public static void printDays(int year, int month) {
        if (year < 0 || month < 0 || month > 12) {
            System.out.println("invalid date");
        } else {
            LocalDate date = LocalDate.of(year, month, 1);
            System.out.println(date.getMonth().length(date.isLeapYear()));
        }
    }
}
