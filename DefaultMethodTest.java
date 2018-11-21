package com.sangjun.java_practice;

/**
 * Created by bobsang89@gmail.com on 2018-11-15
 * Project: java-practice
 * Github : http://github.com/SangJun-GitHub
 */
public class DefaultMethodTest {
    public static void main(String[] args){
        Child c = new Child();
        c.method1();
        c.method2();
        Myinterface.staticmethod();
        Myinterface2.staticmethod();
    }

}

class Child extends Parent1 implements Myinterface, Myinterface2{
    @Override
    public void method1(){
        System.out.println("C method");
    }
}
class Parent1{
    public void method3(){
        System.out.println("P method");
    }
}

interface Myinterface{
    default void method1(){
        System.out.println("interface method1");
    }
    default void method2(){
        System.out.println("interface method2");
    }
    static void staticmethod(){
        System.out.println("static method1");
    }
}
interface Myinterface2{
    default void method1(){
        System.out.println("interface method1");
    }
    static void staticmethod(){
        System.out.println("static method2");
    }
}
