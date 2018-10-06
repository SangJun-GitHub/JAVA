package com.sangjun.java_practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by bobsang89@gmail.com on 2018-10-05
 * Project: java-practice
 * Github : http://github.com/SangJun-GitHub
 */
public class Assignment1Q1 {
    static Map<String, String> lyrics = new HashMap<>();

    static{
        lyrics.put("FIRST", "On the first day of Christmas, my true love gave to me\n" +
                "A partridge in a pear tree\n");

        lyrics.put("SECOND", "On the second day of Christmas, my true love gave to me\n" +
                "Two turtle doves and a partridge in a pear tree\n");

        lyrics.put("THIRD", "On the third day of Christmas, my true love gave to me\n" +
                "three French hens Two turtle doves and a partridge in a pear tree\n");

        lyrics.put("FOURTH", "On the fourth day of Christmas, my true love gave to me\n" +
                "Four calling birds, three French hens, two turtle doves\n" +
                "And a partridge in a pear tree\n");

        lyrics.put("FIFTH", "On the fifth day of Christmas, my true love gave to me\n" +
                "Five golden rings, four calling birds, three French hens\n" +
                "Two turtle doves and a partridge in a pear tree\n");

        lyrics.put("SIXTH", "On the sixth day of Christmas, my true love gave to me\n" +
                "Six geese a-layin', five golden rings, four calling birds\n" +
                "Three French hens, two turtle doves and a partridge in a pear tree\n");

        lyrics.put("SEVENTH", "On the seventh day of Christmas, my true love gave to me\n" +
                "Seven swans a-swimmin', six geese a-layin', five golden rings\n" +
                "Four calling birds, three French hens, two turtle doves\n" +
                "And a partridge in a pear tree\n");

        lyrics.put("EIGHTH", "On the eighth day of Christmas, my true love gave to me\n" +
                "Eight maids a-milkin', seven swans a-swimmin'\n" +
                "Six geese a-layin', five golden rings, four calling birds, three French hens\n" +
                "Two turtle doves and a partridge in a pear tree\n");

        lyrics.put("NINTH", "On the ninth day of Christmas, my true love gave to me\n" +
                "Nine lords a-leapin', eight maids a-milkin', seven swans a-swimmin'\n" +
                "Six geese a-layin', five golden rings, four calling birds, three French hens\n" +
                "Two turtle doves and a partridge in a pear tree\n");

        lyrics.put("TENTH", "On the tenth day of Christmas, my true love gave to me\n" +
                "Ten ladies dancin', nine lords a-leapin', eight maids a-milkin'\n" +
                "Seven swans a-swimmin', six geese a-layin', five golden rings\n" +
                "Four calling birds, three French hens\n" +
                "Two turtle doves and a partridge in a pear tree\n");

        lyrics.put("ELEVENTH", "On the eleventh day of Christmas, my true love gave to me\n" +
                "Eleven pipers pipin', ten ladies dancin', nine lords a-leapin'\n" +
                "Eight maids a-milkin', seven swans a-swimmin'\n" +
                "Six geese a-layin', five golden rings, four calling birds, three French hens\n" +
                "Two turtle doves and a partridge in a pear tree\n");

        lyrics.put("TWELFTH", "On the twelfth day of Christmas, my true love gave to me\n" +
                "Twelve drummers drummin', eleven pipers pipin', ten ladies dancin'\n" +
                "Nine lords a-leapin', eight maids milkin', seven swans a-swimmin'\n" +
                "Six geese a-layin' five golden rings, four calling birds, three French hens\n" +
                "Two turtle doves and a partridge in a pear tree\n");
    }

    public static void sing(String p){
        System.out.printf(lyrics.get(p));
    }

    public static void help(){
        System.out.println("*** Command Helper ***\n" +
                "1. For see a parse of The Twelve Days of Christmas.\n" +
                "   Only accept (first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth, eleventh, twelfth)\n" +
                "2. For exit a parse of The Twelve Days of Christmas, Enter 'exit'");
    }

    public static void main(String[] args) {
        help();
        String parse = new Scanner(System.in).nextLine().toUpperCase();
        while(!parse.equals("EXIT")){
            switch (parse) {
                case "FIRST":
                    sing(parse);
                    break;
                case "SECOND":
                    sing(parse);
                    break;
                case "THIRD":
                    sing(parse);
                    break;
                case "FOURTH":
                    sing(parse);
                    break;
                case "FIFTH":
                    sing(parse);
                    break;
                case "SIXTH":
                    sing(parse);
                    break;
                case "SEVENTH":
                    sing(parse);
                    break;
                case "EIGHTH":
                    sing(parse);
                    break;
                case "NINTH":
                    sing(parse);
                    break;
                case "TENTH":
                    sing(parse);
                    break;
                case "ELEVENTH":
                    sing(parse);
                    break;
                case "TWELFTH":
                    sing(parse);
                    break;
                default:
                    System.out.println("Your enter is wrong");
                    help();
                    break;
            }
            parse = new Scanner(System.in).nextLine().toUpperCase();
        }
    }
}



