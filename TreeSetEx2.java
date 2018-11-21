package com.sangjun.java_practice;

import java.util.TreeSet;

/**
 * Created by bobsang89@gmail.com on 2018-11-21
 * Project: java-practice
 * Github : http://github.com/SangJun-GitHub
 */
public class TreeSetEx2 {
    public static void main(String[] args){
        TreeSet set = new TreeSet();
        int[] score = {80, 95, 50, 35, 45, 65, 10 ,100};

        for(int i=0; i< score.length; i++){
            set.add(new Integer(score[i]));
        }
        System.out.println("less than 50 number of score : "+set.headSet(new Integer(50)));
        System.out.println("greater than 50 number of score : "+set.tailSet(new Integer(50)));
    }
}
