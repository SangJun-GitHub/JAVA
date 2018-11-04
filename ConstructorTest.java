package com.sangjun.java_practice;

/**
 * Created by bobsang89@gmail.com on 2018-11-03
 * Project: java-practice
 * Github : http://github.com/SangJun-GitHub
 */
public class ConstructorTest {
    public static void main(String[] args){
        Car car1 = new Car();
        Car car2 = new Car("Blue");

        System.out.println("car1" + car1);
        System.out.println("car2" + car2);

        System.out.println("change car1 color to red");
        car1.color = "Red";
        System.out.println("copy car1 to car3");
        Car car3 = new Car(car1);
        System.out.println("car1" + car1);
        System.out.println("car3" + car3);
        System.out.println("change car3 gear type to manual");
        car3.gearType = "Manual";
        System.out.println("car1" + car1);
        System.out.println("car3" + car3);
    }
}


class Car {
    String color;
    String gearType;
    int door;

    Car(){
        this("Black", "Auto", 4);
    }

    @Override
    public String toString() {
        return "\nColor : "+ this.color + "\nGear type : " + this.gearType + "\nDoors :" + this.door;
    }

    Car(String color){
        this(color, "Auto", 4);
    }
    Car(String color, String gearType, int door){
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }

    Car(Car c){
        this(c.color, c.gearType, c.door);
//        this.color= c.color;
//        this.gearType = c.gearType;
//        this.door = c.door;
    }
}
