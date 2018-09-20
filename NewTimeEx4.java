package com.sangjun.java_practice;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * Created by bobsang89@gmail.com on 2018-09-20
 * Project: java-practice
 * Github : http://github.com/SangJun-GitHub
 */
public class NewTimeEx4 {
    public static void main(String[] args){
        LocalDate date1 = LocalDate.of(2018,1,1);
        LocalDate date2 = LocalDate.of(2019,12,31);

        Period period = Period.between(date1, date2);

        System.out.println("Date1: " + date1);
        System.out.println("Date2: " + date2);
        System.out.println("Period: " + period);

        System.out.println("Year Gap: " + period.get(ChronoUnit.YEARS));
        System.out.println("Month Gap: " + period.get(ChronoUnit.MONTHS));
        System.out.println("Day Gap: " + period.get(ChronoUnit.DAYS));

        LocalTime time1 = LocalTime.of(0,0,0);
        LocalTime time2 = LocalTime.of(12,34,56);

        Duration duration = Duration.between(time1, time2);
        System.out.println("Time1: " + time1);
        System.out.println("Time2: " + time2);
        System.out.println("Duration: " + duration);

        LocalTime tmpTime = LocalTime.of(0,0).plusSeconds(duration.getSeconds());

        System.out.println("Hour Gap: " + tmpTime.getHour());
        System.out.println("Minute Gap: " + tmpTime.getMinute());
        System.out.println("Second Gap: " + tmpTime.getSecond());
        System.out.println("Nanosecond Gap: " + tmpTime.getNano());
    }
}
