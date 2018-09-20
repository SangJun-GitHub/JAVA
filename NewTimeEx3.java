package com.sangjun.java_practice;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

import static java.time.DayOfWeek.*;
import static java.time.temporal.TemporalAdjusters.*;

/**
 * Created by bobsang89@gmail.com on 2018-09-20
 * Project: java-practice
 * Github : http://github.com/SangJun-GitHub
 */
class  DayAfterTomorrow implements TemporalAdjuster{
    @Override
    public Temporal adjustInto(Temporal temporal){
        return temporal.plus(2, ChronoUnit.DAYS);
    }
}
public class NewTimeEx3 {
    public static void main(String[] args){
        LocalDate today = LocalDate.now();
        LocalDate date = today.with(new DayAfterTomorrow());

        print(today);
        System.out.println("DayAfterTomorrow");
        print(date);
        System.out.println("firstDayOfNextMonth");
        print(today.with(firstDayOfNextMonth()));
        System.out.println("DayOfMonth");
        print(today.with(firstDayOfMonth()));
        print(today.with(lastDayOfMonth()));
        System.out.println("Thursday InMonth");
        print(today.with(firstInMonth(THURSDAY)));
        print(today.with(lastInMonth(THURSDAY)));
        System.out.println("Previous Thursday");
        print(today.with(previous(THURSDAY)));
        print(today.with(previousOrSame(THURSDAY)));
        System.out.println("Next Thursday");
        print(today.with(next(THURSDAY)));
        print(today.with(nextOrSame(THURSDAY)));
        System.out.println("Thursday in 4th week in month");
        print(today.with(dayOfWeekInMonth(4, THURSDAY)));
    }

    static void print(Object obj){
        System.out.println(obj);
    }
}
