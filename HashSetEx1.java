package com.sangjun.java_practice;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by bobsang89@gmail.com on 2018-09-26
 * Project: java-practice
 * Github : http://github.com/SangJun-GitHub
 */
public class HashSetEx1 {
    public static void main(String[] args){
        Object[] objArr = {"1", new Integer(1), "2", "2", "3", "3", "4", "4", "4"};
        Set set = new HashSet();

        for(int i = 0; i < objArr.length; i++)
            set.add(objArr[i]);

        System.out.println(set);
    }
}
