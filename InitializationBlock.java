package com.sangjun.java_practice;

/**
 * Created by bobsang89@gmail.com on 2018-11-03
 * Project: java-practice
 * Github : http://github.com/SangJun-GitHub
 */
public class InitializationBlock {
    //Class initialization block
    //Working only once when the class is assigned to the memory
    static {
        System.out.println("Static { }");
    }

    //Instance initialization block
    //Working every time when an instance is created
    //working earlier than constructor
    {
        System.out.println("{ }");
    }

    public InitializationBlock(){
        System.out.println("Constructor");
    }

    public static void main(String[] args){
        System.out.println("InitializationBlock test1 = new InitializationBlock()");
        InitializationBlock test1 = new InitializationBlock();

        System.out.println("InitializationBlock test2 = new InitializationBlock()");
        InitializationBlock test2 = new InitializationBlock();
    }

}

