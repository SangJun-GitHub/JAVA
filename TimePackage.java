package com.sangjun.java_practice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.JapaneseDate;

public class TimePackage {
    public static void main(String[] args) {
        //java.time
        //java.time.chrono
        //java.time.format
        //java.time.temporal
        //java.time.zone
        //위의 클렉스는 String처럼 immutable 즉, 기존객체를 변경하는 대신 새로운 객체를 반환
        //기존의 Calendar클래스는 변경가능하므로 멀티 쓰레드 환경에서는 안전하지 못하다.
        //LocalDate = 날짜, LocalTime = 시간, LocalDateTime = 날짜 + 시간, ZonedDateTime = LocalDateTime + 시간대
        //Period는 날짜간의 차이, Duration은 시간간의 차이
        //Temporal, TemporalAccessor, TemporalAdjuster 는 날짜와 시간을 위한 인터페이스
        //TemporalAmount는 Period, Duration을 위한 인터페이스
        //TemporalUnit는 시간단위를 정해놓은 인터페이스 열거형은 ChronoUnit
        //TemporalField는 년, 월, 일, 시간의 필드를 정의해놓은 인터페이스 열거형은 ChronoField

        LocalDateTime date = LocalDateTime.now();
        //get(), getXXX() //Calender와 다르게 월이 1~12 요일은 월요일이1 일요일이7
        // display day of month
        System.out.println(date.getDayOfMonth());

        //with(), plus(), minus() //필드를 변경하는 메서드는 항상 새로운 객체를 생성해서 반환 하므로 대입 연산자를 사용해야함
        //change the local year to 2000 year

        date = date.withYear(2000);
        System.out.println(date);
        //add 1 to year
        date = date.plusYears(1);
        System.out.println(date);

        //isAfter(), isBefore(), isEqual()
        date = date.now();
        LocalDateTime date2 = LocalDateTime.now();
        System.out.println(date.isEqual(date2));
        date2 = date2.plusYears(3);
        System.out.println(date2.isAfter(date));
        LocalDate date3 = LocalDate.of(1989,8,30);
        JapaneseDate date4 = JapaneseDate.of(1989,8,30);

        // equals는 모든 필드가 일치해야하는 반면 isEqual는 오직 날짜만 비교한다
        System.out.println(date3.isEqual(date4));
        System.out.println(date3.equals(date4));


    }
}
