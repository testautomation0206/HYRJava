package com.hyrTutorials.conditionalStatements;
import java.time.DayOfWeek;
import java.time.LocalDate;

public class Day1 {

    public static void main(String[] args) {
        // Get the current day of the week using LocalDate
        LocalDate currentDate = LocalDate.now();
        DayOfWeek dayOfWeek = currentDate.getDayOfWeek();

        // Check the day of the week and print the appropriate message
        if (dayOfWeek == DayOfWeek.MONDAY || dayOfWeek == DayOfWeek.TUESDAY ||
                dayOfWeek == DayOfWeek.WEDNESDAY || dayOfWeek == DayOfWeek.THURSDAY ||
                dayOfWeek == DayOfWeek.FRIDAY) {
            System.out.println("Uff, it's a weekday.");
        } else if (dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY) {
            System.out.println("Yaay, it's weekend!");
        } else {
            System.out.println("Invalid day of the week.");
        }
    }
}