package com.sangjun.java_practice;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

/**
 * Created by bobsang89@gmail.com on 2018-09-20
 * Project: java-practice
 * Github : http://github.com/SangJun-GitHub
 */
public class NewTimeEx1 {
    public static void main(String[] args){
        LocalDate today = LocalDate.now();
        LocalTime now = LocalTime.now();

        LocalDate birthDate = LocalDate.of(1989, 8,31);
        LocalTime birthTime = LocalTime.of(23,59,59);

        System.out.println("Today is "+ today);
        System.out.println("Current time is " + now);
        System.out.println("My birthday is " + birthDate);
        System.out.println("My birthday time is " + birthTime);

        System.out.println("Change year of birthday " + birthDate.withYear(2000));
        System.out.println("Add 1day to birth day with pulsDays " + birthDate.plusDays(1));
        System.out.println("Add 1day to birth day with puls " + birthDate.plus(1, ChronoUnit.DAYS));

        System.out.println("Reset minute and second "+ birthTime.truncatedTo(ChronoUnit.HOURS));
        System.out.println("Check range of day with CLOCK_HOUR_OF_DAY " + ChronoField.CLOCK_HOUR_OF_DAY.range());
        System.out.println("Check range of day with HOUR_OF_DAY " +ChronoField.HOUR_OF_DAY.range());
    }
}
