package com.sangjun.java_practice;

import java.time.*;

/**
 * Created by bobsang89@gmail.com on 2018-09-20
 * Project: java-practice
 * Github : http://github.com/SangJun-GitHub
 */
public class NewTimeEx2 {
    public static void main(String[] args){
        LocalDate date = LocalDate.of(1989,8,30);
        LocalTime time = LocalTime.of(12,35,54);

        LocalDateTime dateTime = LocalDateTime.of(date,time);

        ZoneId zoneId = ZoneId.of("America/Toronto");
        ZonedDateTime zonedDateTime = dateTime.atZone(zoneId);
        String stringZoneId = zonedDateTime.getZone().getId();

        ZonedDateTime canadaTime = ZonedDateTime.now();
        ZoneId newyorkId = ZoneId.of("America/New_York");
        ZonedDateTime newyorkTime = ZonedDateTime.now().withZoneSameInstant(newyorkId);

        OffsetDateTime offsetDateTime = zonedDateTime.toOffsetDateTime();

        System.out.println("Date & Time set 1989/8/30: " + dateTime);
        System.out.println("ZoneId set Toronto: " + zoneId);
        System.out.println("Toronto zone date & time: " + zonedDateTime);
        System.out.println("ZoneId convert to String: " + stringZoneId);
        System.out.println("Toronto current zone date & time: " + canadaTime);
        System.out.println("ZoneId set New_York: "+ newyorkId);
        System.out.println("New_York zone date & time: " + newyorkTime);
        System.out.println("Offset date time: "+offsetDateTime);
    }
}
