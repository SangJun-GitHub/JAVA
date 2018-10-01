package com.sangjun.java_practice;

import java.text.ChoiceFormat;
import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by bobsang89@gmail.com on 2018-10-01
 * Project: java-practice
 * Github : http://github.com/SangJun-GitHub
 */
public class FormatterClass {
    public static void main(String[] args) {
        //DecimalFormatter 숫자를 형식화 하는 것 ex) 숙자를 부동소수점, 금액 등 다양하게 변환가능
        //반대로 String을 숫자로 변환 가능
        //format을 정의함 즉 pattern을 정의하는 것
        //0 값이 없을때 0으로 매꿈 00.00, 1.5 -> 01.50
        //Format
        String pattern1 = "00.00";
        DecimalFormat decimalFormat1 = new DecimalFormat(pattern1);
        System.out.println(decimalFormat1.format(1.5));

        //# 값을 채움 ##.## 1.5 -> 1.5
        String pattern2 = "##.##";
        DecimalFormat decimalFormat2 = new DecimalFormat(pattern2);
        System.out.println(decimalFormat2.format(1.2));
        //Parse

        String num = "5.5";
        try{
            Number result = decimalFormat1.parse(num);
            System.out.println(result.doubleValue());
        }catch (Exception e){

        }

        //SimpleDateFormatter Date, Calendar 만으로는 출력하는데 제한이있음
        // 이러한 문제를 해결하기 위해서 SimpleDataFormatter를 사용
        //y 년도, M 월, w,년의 주, W 월의 주, D 년의 일, d 달의 일, F 월의 요일, E 요일, a AM/PM
        //H시간 0~23, k 시간 1~24, K시간 0~11, h 1~12, m 0~59, s 0~59
        Date d1 = new Date();
        String pattern3 = "yyyy/MM/dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern3);
        System.out.println(simpleDateFormat.format(d1));

        // Date인스턴드만 format메서드에 사용될수있음
        Calendar c = Calendar.getInstance();
        c.set(1989,7,30);
        Date d2 = c.getTime();

        System.out.println(simpleDateFormat.format(d2));


        //Input 을 읽어와 오늘 과비교
        String pattern4 = "yyyy/MM/dd";
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat(pattern4);
        Date inputDate = null;
        System.out.println("Enter a date like " +  pattern4 + " ex) 1987/08/15");
        Scanner s = new Scanner(System.in);
        while(s.hasNextLine()){
            try{
                inputDate = simpleDateFormat1.parse(s.nextLine());
                break;
            }catch(Exception e){
                System.out.println("Enter a date like " +  pattern4 + " ex) 1987/08/15");
            }
        }
        Calendar input = Calendar.getInstance();
        input.setTime(inputDate);
        Calendar today = Calendar.getInstance();
        long diff = (today.getTimeInMillis() - input.getTimeInMillis())/1000;

        System.out.println("Between input and today " + diff/(24*60*60) + " days gap");

        //ChoiceFormat 특정 범위에 속하는 값을 String으로 변환
        //'# '경계값 포함 '<>' 경계값 미포함
        double[] limit = {60,70,80,90};
        String[] grade = {"D", "C", "B", "A"};
        ChoiceFormat choiceFormat = new ChoiceFormat(limit, grade);
        int[] score = {75,55,99,60,80,15};
        for(int i =0; i< score.length; i++){
            System.out.println(score[i] + " : " + choiceFormat.format(score[i]));
        }

        //MessageFormat 데이터가 들어갈 자리를 마련해 놓은 양식 ex) 고객에게 단체 이메일을 보낼때 이름과 주소와 같은 것만 변경해서 보냄
        //또한 parse를 통하여 손쉽게 데이터를 추출할수있다
        String tableName = "Employee";
        String insert = "INSER INTO " + tableName + " VALUES (''{0}'', ''{1}'', ''{2}'', {3})";

        Object[][] data = {{"Sang", "000-000-0000", "sang@email.com", 30},
                {"Jun", "xxx-xxx-xxxx", "jun@email.com", 42},};

        for(int i = 0; i < data.length; i++){
            String result = MessageFormat.format(insert, data[i]);
            System.out.println(result);
        }

    }

}
