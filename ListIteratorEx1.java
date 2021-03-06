package com.sangjun.java_practice;

import java.util.ArrayList;

import java.util.ListIterator;

/**
 * Created by bobsang89@gmail.com on 2018-09-25
 * Project: java-practice
 * Github : http://github.com/SangJun-GitHub
 */
public class ListIteratorEx1 {

    public static void main(String[] args){
        ArrayList list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
//        Iterator is one way. so, we can use iterator when iterator reach last element
//        but, ListIterator is two way. so ListIterator has more freedom than iterator
//        but, before move to element we have to call hasNext() or hasPrevious() for checking possibility to move
//        void add(Object object) - add object to collection
//        boolean hasNext() - check next elements, if exist return true
//        boolean hasPrevious() - check previous elements, if exist return true
//        Object next() - return next object
//        Object previous() - return previous object
//        int nextIndex() return next element's index
//        int previousIndex() return previous element's index
//        void remove() - remove element, but after call next() or previous()
//        set(Object object) - set object with read element, but after next() or previous()

        ListIterator iterator = list.listIterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println();
        while(iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
        System.out.println();

    }
}
