package com.sangjun.java_practice;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by bobsang89@gmail.com on 2018-09-20
 * Project: java-practice
 * Github : http://github.com/SangJun-GitHub
 */
public class DataFormatterEx1 {
    public static void main(String[] args){
        ZonedDateTime zonedDateTime = ZonedDateTime.now();

        String[] patterns = {
                "yyyy-MM-dd HH:mm:ss",
                "''yy/ MMM / dd / E",
                "yyyy-MM-dd HH:mm:ss.SSS Z VV",
                "yyyy-MM-dd hh:mm:ss a",
                "'Today is 'D'th day in this year'",
                "'Today is 'd'th day in this month'",
                "'Today is 'w'th week in this year'",
                "'Today is 'W'th week in this month'",
                "'Today is 'E'day of 'W'th week in this month'"
        };

        for(String pattern : patterns){
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
            System.out.println(zonedDateTime.format(formatter));
        }
    }
}
