package com.sangjun.java_practice;

import java.text.MessageFormat;
import java.text.ParseException;

/**
 * Created by bobsang89@gmail.com on 2018-09-19
 * Project: java-practice
 * Github : http://github.com/SangJun-GitHub
 */
public class MessageFormatEx3 {
    public static void main(String[] args) throws Exception {
        String[] data = {
                "INSERT INTO CUST_INFO VALUES ('Sangjun','000-000-0000','30','08-30');",
                "INSERT INTO CUST_INFO VALUES ('Park','111-111-1111','31','01-01');"
        };

        String pattern = "INSERT INTO CUST_INFO VALUES ({0},{1},{2},{3});";
        MessageFormat messageFormat = new MessageFormat(pattern);

        for(int i =0; i < data.length; i++){
            Object[] objs = messageFormat.parse(data[i]);
            for(int j =0; j< objs.length; j++){
                System.out.print(objs[j] + ",");
            }
            System.out.println();
        }
    }
}
