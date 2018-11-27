package com.sangjun.java_practice;

import java.util.Enumeration;
import java.util.Properties;

/**
 * Created by bobsang89@gmail.com on 2018-11-26
 * Project: java-practice
 * Github : http://github.com/SangJun-GitHub
 */
public class PropertiesEx1 {
    public static void main(String[] args){
        Properties properties = new Properties();

        properties.setProperty("Timeout", "30");
        properties.setProperty("Language", "en");
        properties.setProperty("Size", "10");
        properties.setProperty("Capacity", "10");

        Enumeration enumeration = properties.propertyNames();

        while(enumeration.hasMoreElements()){
            String element = (String)enumeration.nextElement();
            System.out.println(element + "=" + properties.getProperty(element));
        }

        System.out.println();
        properties.setProperty("Size", "20");
        System.out.println("Size=" + properties.getProperty("Size"));
        System.out.println("Capacity=" + properties.getProperty("Capacity", "20"));
        System.out.println("LoadFactor="+properties.getProperty("LoadFactor", "0.75"));
        System.out.println(properties);
        properties.list(System.out);
    }
}
