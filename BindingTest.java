package com.sangjun.java_practice;

/**
 * Created by bobsang89@gmail.com on 2018-11-06
 * Project: java-practice
 * Github : http://github.com/SangJun-GitHub
 */
public class BindingTest {
    public static void main(String[] args){
        Parent p = new Children();
        Children c = new Children();

        System.out.println("p.x = " + p.x);
        p.method();
        System.out.println("c.x = " + c.x);
        c.method();
    }
}
class Parent{
    int x = 100;

    void method(){
        System.out.println("Parent Method");
    }
}

class Children extends Parent{
    int x = 200;

    void method(){
        System.out.println("Children Method");
        System.out.println("x= "+ x);
        System.out.println("super = " + super.x);
        System.out.println("this = " + this.x);
    }
}
