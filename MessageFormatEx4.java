package com.sangjun.java_practice;

import java.io.File;
import java.text.MessageFormat;
import java.util.Scanner;

/**
 * Created by bobsang89@gmail.com on 2018-09-19
 * Project: java-practice
 * Github : http://github.com/SangJun-GitHub
 */
public class MessageFormatEx4 {
    public static void main(String[] args) throws Exception{
        String tableName = "CUT_INFO";
        String fileName = "./data4.txt";
        String msg = "INSERT INTO "+ tableName + " VALUES ({0}, {1}, {2}, {3});";
        Scanner s = new Scanner(new File(fileName));

        String pattern = "{0}, {1}, {2}, {3}";
        MessageFormat messageFormat = new MessageFormat(pattern);

        while (s.hasNextLine()){
            String line = s.nextLine();
            Object[] objs = messageFormat.parse(line);
            System.out.println(MessageFormat.format(msg, objs));
        }
        s.close();    }
}
