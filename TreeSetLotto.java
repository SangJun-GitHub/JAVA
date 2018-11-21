package com.sangjun.java_practice;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by bobsang89@gmail.com on 2018-11-21
 * Project: java-practice
 * Github : http://github.com/SangJun-GitHub
 */
public class TreeSetLotto {
    public static void main(String[] args){
        Set set = new TreeSet();

        for(int i =0; set.size() < 6; i++){
            int num = (int)(Math.random()*45)+1;
            set.add(num);
        }
        System.out.println(set);
    }
}
