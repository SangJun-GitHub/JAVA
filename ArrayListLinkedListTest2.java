package com.sangjun.java_practice;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by bobsang89@gmail.com on 2018-09-24
 * Project: java-practice
 * Github : http://github.com/SangJun-GitHub
 */
public class ArrayListLinkedListTest2 {
    public static void main(String[] args){
        ArrayList al = new ArrayList(1000000);
        LinkedList ll = new LinkedList();

        add(al);
        add(ll);

        System.out.println("= Access Test =");
        System.out.println("ArrayList : " + access(al));
        System.out.println("LinkedList: " + access(ll));

//        Result
//        Collection  Read/Access     Add/Remove
//        ArrayList   faster          slower          inefficient using memory
//        LinkedList  slower          faster          more date slower access

//        If the number of data changes frequently, use LinkedLis
//        IF the number of data does not change frequently, use ArrayList
    }

    public static void add(List list){
        for(int i =0; i < 100000; i++)
            list.add(i+"");
    }

    public static long access(List list){
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++)
            list.get(i);
        long end = System.currentTimeMillis();
        return end - start;
    }
}
