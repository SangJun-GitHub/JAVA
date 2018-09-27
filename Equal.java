package com.sangjun.java_practice;

/**
 * Created by bobsang89@gmail.com on 2018-09-26
 * Project: java-practice
 * Github : http://github.com/SangJun-GitHub
 */
public class Equal {
    public static void main(String[] args){
        System.out.println("new Integer(1).equals(new Integer(1))");
        System.out.println(new Integer(1).equals(new Integer(1))); // 동등성
        System.out.println("1 == new Integer(1)");
        System.out.println(1 == new Integer(1)); //언박싱 뉴인티저에서 1을 꺼내서 비교
        System.out.println("new Integer(1) == new Integer(1)");
        System.out.println(new Integer(1) == new Integer(1));// 동일성 즉 주소값일지
    }
}
