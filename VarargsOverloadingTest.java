package com.sangjun.java_practice;

/**
 * Created by bobsang89@gmail.com on 2018-11-03
 * Project: java-practice
 * Github : http://github.com/SangJun-GitHub
 */
public class VarargsOverloadingTest {
    static String concatenate(String delimiter, String... args){
        String result = "";
        for(String str: args)
            result += str+delimiter;

        return result;
    }

    static public void main(String[] args){
        String[] strArr = {"111","222","333"};

        System.out.println(concatenate("", strArr));
        System.out.println(concatenate("-", strArr));
        System.out.println(concatenate(",", new String[]{"100","200","300"}));
        System.out.println("["+concatenate(",",new String[0])+"]");
        System.out.println("["+concatenate(",")+"]");
    }
}

