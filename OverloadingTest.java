package com.sangjun.java_practice;

/**
 * Created by bobsang89@gmail.com on 2018-11-03
 * Project: java-practice
 * Github : http://github.com/SangJun-GitHub
 */
public class OverloadingTest {

    public static void main(String[] args){
        MathTest test = new MathTest();
        System.out.println("test.sum(7, 7) : " + test.sum(7,7));
        System.out.println("test.sum(7, 7L) : " + test.sum(7,7L));
        System.out.println("test.sum(7L, 7) : " + test.sum(7L, 7));
        System.out.println("test.sum(7L, 7L) : "+ test.sum(7L,7L));
        int[] a = {7, 77, 777};
        System.out.println("Array a");
        for(int i =0; i< a.length; i++)
            System.out.println(a[i]);
        System.out.println("test.sum(a) : " + test.sum(a));
    }
}

class MathTest{
    int sum (int a, int b){
        System.out.print("int sum(int a, int b) : ");
        return a +b;
    }

    long sum(int a, long b){
        System.out.print("long sum(int a, long b) : ");
        return a+b;
    }

    long sum(long a, int b){
        System.out.print("long sum(long a, int b) : ");
        return a+b;
    }

    long sum(long a, long b){
        System.out.print("long sum(long a, long b) : ");
        return a+b;
    }

    int sum(int[] a){
        System.out.print("int sum(int[] a) : ");
        int result =0;
        for(int i = 0; i < a.length; i++)
            result += a[i];
        return result;
    }
}
