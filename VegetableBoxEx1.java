package com.sangjun.java_practice;

import java.util.ArrayList;

/**
 * Created by bobsang89@gmail.com on 2018-12-06
 * Project: java-practice
 * Github : http://github.com/SangJun-GitHub
 */

class Vegetable implements Eatable{
    public String toString() { return "Fruit"; }
}
class Potato extends Vegetable { public String toString() { return "Potato"; }}
class Onion extends Vegetable { public String toString() { return "Onion"; }}
class Electronic { public String toString() {return "Electronic"; }}

interface Eatable{}

public class VegetableBoxEx1 {
    public static void main(String[] args){
        VegetableBox<Vegetable> vegetableBox = new VegetableBox<Vegetable>();
        VegetableBox<Potato> potatoBox = new VegetableBox<Potato>();
        VegetableBox<Onion> onionBox = new VegetableBox<Onion>();
//        VegetableBox<Onion> onionBox2 = new VegetableBox<Potato>();
//        VegetableBox<Electronic> electronicBox = new VegetableBox<Electronic>();

        vegetableBox.add(new Vegetable());
        vegetableBox.add(new Potato());
        vegetableBox.add(new Onion());
        potatoBox.add(new Potato());
//        potatoBox.add(new Onion());
        onionBox.add(new Onion());

        System.out.println(vegetableBox);
        System.out.println(potatoBox);
        System.out.println(onionBox);
    }
}

class VegetableBox<T extends Vegetable & Eatable> extends Box2<T>{}

class Box2<T>{
    ArrayList<T> list = new ArrayList<T>();
    void add(T item) { list.add(item); }
    T get(int i) { return list.get(i); }
    int size() { return list.size(); }
    public String toString() { return list.toString(); }
}
