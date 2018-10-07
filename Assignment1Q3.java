package com.sangjun.java_practice;

import java.util.Scanner;

/**
 * Created by bobsang89@gmail.com on 2018-10-05
 * Project: java-practice
 * Github : http://github.com/SangJun-GitHub
 */
public class Assignment1Q3 {
    public static void wordCounter(String sentence){
        System.out.println("Your Enter is [" + sentence +"]");
        int result = 0;
        for(int i =0; i < sentence.length();i++){
            char c = sentence.charAt(i);
            if(Character.isAlphabetic(c))
                result++;
        }
        System.out.println("Number of words is " + result);
    }

    public static void main(String[] args){
        System.out.println("*** Enter a sentence ***");
        String sentence;
        Scanner s = new Scanner(System.in);
        sentence = s.nextLine();

        wordCounter(sentence);
    }
}
