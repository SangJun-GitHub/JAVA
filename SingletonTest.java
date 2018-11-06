package com.sangjun.java_practice;

/**
 * Created by bobsang89@gmail.com on 2018-11-05
 * Project: java-practice
 * Github : http://github.com/SangJun-GitHub
 */
public class SingletonTest {
    public static void main(String[] args){
        Singleton s = Singleton.getInstance();
    }
}

final class Singleton{

    private static Singleton s = new Singleton();
    private Singleton(){

    }
    public static Singleton getInstance(){
        if(s==null)
            s= new Singleton();
        return s;
    }
}
