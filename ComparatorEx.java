package com.sangjun.java_practice;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by bobsang89@gmail.com on 2018-09-26
 * Project: java-practice
 * Github : http://github.com/SangJun-GitHub
 */
public class ComparatorEx {
    public static void main(String[] args){
        String[] strArr = {"cat", "Dog", "lion", "tiger"};

        Arrays.sort(strArr);
        System.out.println("strArr: " + Arrays.toString(strArr));

        Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);
        System.out.println("strArr: " + Arrays.toString(strArr));

        Arrays.sort(strArr, new Descending());
        System.out.println("strArr: "+ Arrays.toString(strArr));
    }


}
class Descending implements Comparator {
    public int compare(Object obj1, Object obj2){
     if(obj1 instanceof Comparable && obj2 instanceof Comparable){
         Comparable c1 = (Comparable) obj1;
         Comparable c2 = (Comparable) obj2;
         return c1.compareTo(c2) * -1;
     }
     return -1;
    }
}
