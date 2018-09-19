package com.sangjun.java_practice;

import java.text.ChoiceFormat;

/**
 * Created by bobsang89@gmail.com on 2018-09-19
 * Project: java-practice
 * Github : http://github.com/SangJun-GitHub
 */

public class ChoiceFormatEx1 {

    public static void main(String[] args){
        double[] limits = {60, 70 ,80, 90};
        String[] grades = {"D", "C", "B", "A"};

        int[] scores1 = {100, 95, 88, 70, 52, 60, 70};

        ChoiceFormat form = new ChoiceFormat(limits, grades);

        for(int i =0; i < scores1.length; i++){
            System.out.println(scores1[i] + ":" + form.format(scores1[i]));
        }

        System.out.println("Format with # and <");

        String pattern = "60#D|70#C|80<B|90#A";
        int[] scores2 = {91, 90, 80, 88, 70, 52, 60};

        form = new ChoiceFormat(pattern);

        for(int i = 0; i < scores2.length; i++){
            System.out.println(scores2[i]+":"+form.format(scores2[i]));
        }

    }

}
