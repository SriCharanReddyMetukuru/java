package com.wipro.java.java8;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.time.DayOfWeek;

public class DateTime {

    public static void change() {
        LocalDate date = LocalDate.now();
        System.out.println("The current date is: " + date);

        // To get the first day of next month
        LocalDate dateOfNextMonth = 
                date.with(TemporalAdjusters.firstDayOfNextMonth());
        System.out.println("First day of next month: " + dateOfNextMonth);

        // Get the next Saturday
        LocalDate nextSaturday = date.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
        System.out.println("Next Saturday: " + nextSaturday);
    }

    public static void main(String[] args) {
        change();
    }
}
