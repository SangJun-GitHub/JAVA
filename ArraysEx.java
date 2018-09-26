package com.sangjun.java_practice;

import java.util.Arrays;

/**
 * Created by bobsang89@gmail.com on 2018-09-25
 * Project: java-practice
 * Github : http://github.com/SangJun-GitHub
 */
public class ArraysEx {
    public static void main(String[] args){
     int[] array = {0, 1, 2, 3, 4};
     int[][] array2D = {{11, 12, 13}, {14, 15, 16}};

        System.out.println("array: "+ Arrays.toString(array));
        System.out.println("array2D: " + Arrays.deepToString(array2D));


        System.out.println("Copy all from array to array2");
        int[] array2 = Arrays.copyOf(array, array.length);
        System.out.println("array2: "+Arrays.toString(array2));

        System.out.println("Copy 3 elements from array to array3");
        int[] array3 = Arrays.copyOf(array, 3);
        System.out.println("array3: "+Arrays.toString(array3));

        System.out.println("Copy 7 elements from array to array4");
        int[] array4 = Arrays.copyOf(array,7);
        System.out.println("array4: "+Arrays.toString(array4));

        System.out.println("Copy elements 2~4 from array to array5");
        int[] array5 = Arrays.copyOfRange(array, 2 ,4);
        System.out.println("array5: "+Arrays.toString(array5));

        System.out.println("Copy elements 0~7 from array to array6");
        int[] array6 = Arrays.copyOfRange(array, 0,7);
        System.out.println("array6: "+Arrays.toString(array6));

        int[] array7 = new int[5];
        System.out.println("Fill all elements of array7 with 9");
        Arrays.fill(array7, 9);
        System.out.println("array7: "+Arrays.toString(array7));

        System.out.println("set all elements of array7 with random number");
        Arrays.setAll(array7, i -> (int)(Math.random()*6+1));
        System.out.println("array7: "+Arrays.toString(array7));

        for(int i : array7){
            char[] graph = new char[i];
            Arrays.fill(graph, '*');
            System.out.println(new String(graph)+i);
        }

        String[][] string2D = new String[][]{{"aaa","bbb"},{"AAA","BBB"}};
        String[][] string2D2 = new String[][]{{"aaa","bbb"},{"AAA","BBB"}};

        System.out.println(Arrays.equals(string2D, string2D2));
        System.out.println(Arrays.deepEquals(string2D, string2D2));

        char[] charArray = {'A','D','C','B','E'};

        System.out.println("charArray: "+Arrays.toString(charArray));
        System.out.println("index of B: "+Arrays.binarySearch(charArray,'B'));
        System.out.println("= After sort = ");
        Arrays.sort(charArray);
        System.out.println("charArray: "+Arrays.toString(charArray));
        System.out.println("index of B: "+Arrays.binarySearch(charArray, 'B'));


    }
}
