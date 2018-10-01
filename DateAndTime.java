package com.sangjun.java_practice;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by bobsang89@gmail.com on 2018-10-01
 * Project: java-practice
 * Github : http://github.com/SangJun-GitHub
 */
public class DateAndTime {
    public static void main(String[] args) {
//    Calendar -> Date convert
        Calendar c1 = Calendar.getInstance();
        Date date1 = new Date(c1.getTimeInMillis());


//    Date -> Calendar convert
        Date date2 = new Date();
        Calendar c2 = Calendar.getInstance();
        c2.setTime(date2);


//이런식으로 가져올수있음
        System.out.println(c1.get(Calendar.DAY_OF_MONTH));
        System.out.println(c2.get(Calendar.YEAR));

//중요한것은 MONTh = 0 ~ 11

//기간간의 차이를 구할때는 getTimeMillis()로 변환해서 계산함
        c1.set(1989,7,30);

        long diff = (c2.getTimeInMillis() - c1.getTimeInMillis())/1000;
        System.out.println("date1 " + toString(c1));
        System.out.println("date2 " + toString(c2));
        System.out.println(diff);
        System.out.println(diff/(24*60*60));

        // add와 roll로 날자를 더하고 뺄수있는데 add는 다른 필드에 영향을 미치는 반면 롤은 영향을 미치지 않는다
        // 하지만  달의 마지막 날일때 roll로 달을 변경할시 일 필드가 변경 될수도 있다.
        c1.add(Calendar.DAY_OF_MONTH, 2);
        System.out.println("date1 " + toString(c1));
        c1.add(Calendar.DAY_OF_MONTH, -2);
        System.out.println("date1 "+ toString(c1));
        c1.roll(Calendar.DAY_OF_MONTH, 2);
        System.out.println("date1 " + toString(c1));
    }

    public static String toString(Calendar date){
        return date.get(Calendar.YEAR) +" "+ date.get(Calendar.MONTH) +" "+ date.get(Calendar.DAY_OF_MONTH);
    }
}
