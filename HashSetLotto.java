package com.sangjun.java_practice;

import java.util.*;

/**
 * Created by bobsang89@gmail.com on 2018-09-26
 * Project: java-practice
 * Github : http://github.com/SangJun-GitHub
 */
public class HashSetLotto {
    public static void main(String[] args){
        Set set = new HashSet();

        for(int i = 0; set.size() < 6; i++){
            int num = (int)(Math.random()*45) +1;
            set.add(new Integer(num));
        }

        List list = new LinkedList(set);
        Collections.sort(list);
        System.out.println(list);

    }
}
