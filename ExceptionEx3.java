package com.sangjun.java_practice;

/**
 * Created by bobsang89@gmail.com on 2018-11-20
 * Project: java-practice
 * Github : http://github.com/SangJun-GitHub
 */
public class ExceptionEx3 {
    public static void main(String[] args){
        System.out.println(1);
        System.out.println(2);
        try{
            System.out.println(3);
            System.out.println(0/0);
            System.out.println(4);
        }catch(Exception e){
            System.out.println(5);
        }
        System.out.println(6);
    }
}
