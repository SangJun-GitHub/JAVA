package com.sangjun.java_practice;

import java.util.*;

/**
 * Created by bobsang89@gmail.com on 2018-11-25
 * Project: java-practice
 * Github : http://github.com/SangJun-GitHub
 */
public class HashMapEx2 {
    public static void main(String[] args){
        HashMap map = new HashMap();
        map.put("sang", new Integer(90));
        map.put("sang", new Integer(100));
        map.put("jun", new Integer(100));
        map.put("park", new Integer(80));
        map.put("java", new Integer(90));

        Set set = map.entrySet();
        Iterator iterator = set.iterator();

        while(iterator.hasNext()){
            Map.Entry entry = (Map.Entry)iterator.next();
            System.out.println("Name: "+ entry.getKey() + " Score: " + entry.getValue());
        }

        set = map.keySet();
        System.out.println("Entry: " + set);

        Collection values = map.values();
        iterator = values.iterator();

        int total = 0;

        while(iterator.hasNext()){
            Integer integer = (Integer)iterator.next();
            total += integer.intValue();
        }

        System.out.println("Total score: " + total);
        System.out.println("Average score: " + (float)total/set.size());
        System.out.println("Highest score: " + Collections.max(values));
        System.out.println("Lowest score: " + Collections.min(values));

    }
}
