package com.sangjun.java_practice;

import java.util.Scanner;

/**
 * Created by bobsang89@gmail.com on 2018-10-06
 * Project: java-practice
 * Github : http://github.com/SangJun-GitHub
 */
public class Assignment1Q4 {
        public static void vowelCounter(String sentence){
            System.out.println("Your Enter is [" + sentence +"]");
            int result = 0;
            for(int i =0; i < sentence.length();i++){
                char c = sentence.charAt(i);
                if(c == 'a'|| c == 'e' || c == 'i' || c == 'o' || c == 'u')
                    result++;
            }
            System.out.println("Number of vowels is " + result);
        }

        public static void main(String[] args) {
            System.out.println("*** Enter a sentence ***");
            String sentence;
            Scanner s = new Scanner(System.in);
            sentence = s.nextLine();

            vowelCounter(sentence);
        }
}
