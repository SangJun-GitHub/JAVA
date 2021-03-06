package com.sangjun.java_practice;

import java.util.ArrayList;

/**
 * Created by bobsang89@gmail.com on 2018-12-06
 * Project: java-practice
 * Github : http://github.com/SangJun-GitHub
 */
class Fruit { public String toString() { return "Fruit"; }}
class Apple extends Fruit { public String toString() { return "Apple"; }}
class Grape extends Fruit { public String toString() { return "Grape"; }}
class Toy { public String toString() { return "Toy"; }}

class Box<T>{
    ArrayList<T> list = new ArrayList<T>();
    void add(T item) { list.add(item); }
    T get (int i) { return list.get(i); }
    int size() { return list.size(); }
    public String toString() { return list.toString(); }
}
public class FruitBoxEx1 {
    public static void main(String[] args){
        Box<Fruit> fruitBox = new Box<Fruit>();
        Box<Apple> appleBox = new Box<Apple>();
        Box<Toy> toyBox = new Box<Toy>();
//        Box<Grape> grapeBox = new Box<Apple>();

        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());

        appleBox.add(new Apple());
        appleBox.add(new Apple());
//        appleBox.add(new Toy());

        toyBox.add(new Toy());
//        toyBox.add(new Apple());

        System.out.println(fruitBox);
        System.out.println(appleBox);
        System.out.println(toyBox);
    }
}
