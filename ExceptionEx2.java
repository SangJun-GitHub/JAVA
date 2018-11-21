package com.sangjun.java_practice;

/**
 * Created by bobsang89@gmail.com on 2018-11-20
 * Project: java-practice
 * Github : http://github.com/SangJun-GitHub
 */
public class ExceptionEx2 {
//    public static void main(String[] args){
//        int number = 100;
//        int result = 0;
//        for(int i=0;i<10;i++){
//            result = number/ (int)(Math.random() *10);
//            System.out.println(result);
//
//        }
//    }
    public static void main(String[] args){
        int number = 100;
        int result = 0;
        for(int i =0; i<10; i++){
            try{
                result = number / (int)(Math.random() *10);
                System.out.println(result);
            }catch (Exception e){
                System.out.println("0");
            }
        }
    }
}
