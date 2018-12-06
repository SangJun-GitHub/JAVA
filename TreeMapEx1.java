package com.sangjun.java_practice;

import java.util.*;

/**
 * Created by bobsang89@gmail.com on 2018-12-06
 * Project: java-practice
 * Github : http://github.com/SangJun-GitHub
 */
public class TreeMapEx1 {
    public static void main(String[] args){
        String[] data = {"A","K","A","K","D","K","A","K","K","K","Z","D"};

        TreeMap map = new TreeMap();

        for(int i = 0; i < data.length; i++){
            if(map.containsKey(data[i])) {
                Integer value = (Integer) map.get(data[i]);
                map.put(data[i], new Integer(value.intValue()+1));
            }else{
                map.put(data[i], new Integer(1));
            }
        }

        Iterator iterator = map.entrySet().iterator();

        System.out.println("== Default Order ==");

        while(iterator.hasNext()){
            Map.Entry entry = (Map.Entry)iterator.next();
            int value = ((Integer) entry.getValue()).intValue();
            System.out.println(entry.getKey() + " : " + printBar('#', value) + " " + value);
        }
        System.out.println();

        Set set = map.entrySet();

        List list = new ArrayList(set);

        Collections.sort(list, new ValueComparator());

        iterator = list.iterator();

        System.out.println("== Order by value");
        while(iterator.hasNext()){
            Map.Entry entry = (Map.Entry) iterator.next();
            int value = ((Integer)entry.getValue()).intValue();
            System.out.println(entry.getKey() + " : " + printBar('#', value) + " " + value);
        }
    }
    static class ValueComparator implements  Comparator{
        public int compare(Object object1, Object object2){
            if(object1 instanceof  Map.Entry && object2 instanceof Map.Entry){
                Map.Entry entry1 = (Map.Entry) object1;
                Map.Entry entry2 = (Map.Entry) object2;

                int value1 = ((Integer)entry1.getValue()).intValue();
                int value2 = ((Integer)entry2.getValue()).intValue();

                return value2 - value1;
            }
            return  -1;
        }
    }

    public static String printBar(char ch, int value){
        char[] bar = new char[value];

        for(int i = 0; i <bar.length; i++)
            bar[i] = ch;

        return new String(bar);
    }
}
