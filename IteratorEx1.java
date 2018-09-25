package com.sangjun.java_practice;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by bobsang89@gmail.com on 2018-09-25
 * Project: java-practice
 * Github : http://github.com/SangJun-GitHub
 */
public class IteratorEx1 {
    static final int MAX_CAPACITY = 10;

    public static void main(String[] args){
        ArrayList original = new ArrayList(MAX_CAPACITY);
        ArrayList copy1 = new ArrayList(MAX_CAPACITY);
        ArrayList copy2 = new ArrayList(MAX_CAPACITY);

        for(int i = 0; i < MAX_CAPACITY; i++ )
            original.add(i+"");
        Iterator iterator = original.iterator();

        System.out.println("= Copy Original to Copy1 =");

        while (iterator.hasNext())
            copy1.add(iterator.next());

        System.out.println("Original: " + original);
        System.out.println("Copy1: "+ copy1);
        System.out.println();

        iterator = original.iterator();
        // we can'y re use iterator, so we have to get again

        System.out.println("= Move Original to Copy2 =");
        while (iterator.hasNext()) {
            copy2.add(iterator.next());
            iterator.remove();
        }
        System.out.println("Original: " + original);
        System.out.println("Copy2: " + copy2);
        System.out.println("Copy1: " + copy1);

    }
}
