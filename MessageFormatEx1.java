package com.sangjun.java_practice;

import java.text.MessageFormat;

/**
 * Created by bobsang89@gmail.com on 2018-09-19
 * Project: java-practice
 * Github : http://github.com/SangJun-GitHub
 */
public class MessageFormatEx1 {
    public static void main(String[] args){
        String msg = "Name: {0} \nTel: {1} \nAge: {2} \nBirthday: {3}";

        Object[] arguments = {
                "Sangjun","000-000-0000", "30","08-30"
        };

        String result = MessageFormat.format(msg,arguments);
        System.out.println(result);
    }
}
