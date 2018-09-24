package com.sangjun.java_practice;

import java.util.Stack;

/**
 * Created by bobsang89@gmail.com on 2018-09-24
 * Project: java-practice
 * Github : http://github.com/SangJun-GitHub
 */
public class StackEx {

    public static Stack back = new Stack();
    public static Stack forward = new Stack();

    public static void main(String[] args){
        pushURL("Google");
        pushURL("Facebook");
        pushURL("Twitter");
        pushURL("Microsoft");

        printStatus();

        pushBack();
        System.out.println("After click go back button");
        printStatus();

        pushBack();
        System.out.println("After click go back button");
        printStatus();

        pushForward();
        System.out.println("After click go forward button");
        printStatus();

        pushURL("Apple");
        System.out.println("After adding a new URL");
        printStatus();
    }

    public static void printStatus(){
        System.out.println("Back            : " + back);
        System.out.println("Forward         : " + forward);
        System.out.println("Current page    : " + back.peek());
        System.out.println();
    }

    public static void pushURL(String url){
        back.push(url);
        if(!forward.empty())
            forward.clear();
    }

    public static void pushForward(){
        if(!forward.empty())
            back.push(forward.pop());
    }

    public static void pushBack(){
        if(!back.empty())
            forward.push(back.pop());
    }
}
