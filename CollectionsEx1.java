package com.sangjun.java_practice;

import java.util.*;
import static java.util.Collections.*;

/**
 * Created by bobsang89@gmail.com on 2018-12-06
 * Project: java-practice
 * Github : http://github.com/SangJun-GitHub
 */
public class CollectionsEx1 {
    public static void main(String[] args){
        List list = new ArrayList();
        System.out.println(list);

        addAll(list, 1,2,3,4,5);
        System.out.println(list);

        rotate(list, 2);
        System.out.println(list);

        swap(list, 0,2);
        System.out.println(list);

        shuffle(list);
        System.out.println(list);

        sort(list);
        System.out.println(list);

        sort(list, reverseOrder());
        System.out.println(list);

        int index = binarySearch(list, 3);
        System.out.println("Index of 3 = "+ index);

        System.out.println("Max = " + max(list));
        System.out.println("Min = " + min(list));
        System.out.println("Min = " + max(list, reverseOrder()));

        fill(list, 9);
        System.out.println("List = " + list);

        List newList = nCopies(list.size(),2);
        System.out.println("newList = " + newList);

        System.out.println(disjoint(list, newList));

        copy(list, newList);
        System.out.println("newList = " + newList);
        System.out.println("List = " + list);
        System.out.println(disjoint(list, newList));

        replaceAll(list, 2, 1);
        System.out.println("List = " + list);

        Enumeration e = enumeration(list);
        ArrayList list2 = list(e);
        System.out.println("List2 = " + list2);
    }
}
