package com.sangjun.java_practice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by bobsang89@gmail.com on 2018-09-20
 * Project: java-practice
 * Github : http://github.com/SangJun-GitHub
 */
public class DataFormatterEx2 {
    public static void main(String[] args){
        LocalDate newYear = LocalDate.parse("2018-01-01", DateTimeFormatter.ISO_LOCAL_DATE);

        LocalDate date = LocalDate.parse("2001-01-01");
        LocalTime time = LocalTime.parse("23:59:59");
        LocalDateTime birthday = LocalDateTime.parse("1989-08-30T15:15:15");

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime endOfYear = LocalDateTime.parse("2018-12-31 23:59:59", dateTimeFormatter);

        System.out.println("NewYear: "+ newYear);
        System.out.println("Date: " + date);
        System.out.println("Time: " + time);
        System.out.println("Birthday: " + birthday);
        System.out.println("EndOfYear: " + endOfYear);
    }
}
