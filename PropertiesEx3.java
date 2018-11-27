package com.sangjun.java_practice;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by bobsang89@gmail.com on 2018-11-26
 * Project: java-practice
 * Github : http://github.com/SangJun-GitHub
 */
public class PropertiesEx3 {
    public static void main(String[] args){
        Properties properties = new Properties();

        properties.setProperty("Timeout","30");
        properties.setProperty("Language", "English");
        properties.setProperty("Size", "10");
        properties.setProperty("Capacity", "10");

        try{
            properties.store(new FileOutputStream("output.txt"), "Properties Example");
            properties.store(new FileOutputStream("output.xml"), "Properties Example");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
