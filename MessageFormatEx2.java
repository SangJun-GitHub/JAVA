package com.sangjun.java_practice;

import java.text.MessageFormat;

/**
 * Created by bobsang89@gmail.com on 2018-09-19
 * Project: java-practice
 * Github : http://github.com/SangJun-GitHub
 */
public class MessageFormatEx2 {
    public static void main(String[] args){
        String tableName = "CUST_INFO";
        String msg = "INSERT INTO " + tableName + " VALUES (''{0}'',''{1}'',''{2}'',''{3}'')";

        Object[][] arguments = {
                {"Sangjun","000-000-0000", "30", "08-30"},{"Park","111-111-1111","31","01-01"}
        };

        for (int i =0; i<arguments.length; i++){
            String result = MessageFormat.format(msg, arguments[i]);
            System.out.println(result);
        }
    }
}
