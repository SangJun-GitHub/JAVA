package com.sangjun.java_practice;


/**
 * Created by bobsang89@gmail.com on 2018-11-03
 * Project: java-practice
 * Github : http://github.com/SangJun-GitHub
 */
public class DrawShape {
    public static void main(String[] args){
        Point[] p = {new Point(100,100), new Point(200,200), new Point(300,300)};

        Triangle triangle = new Triangle(p);
        Circle circle = new Circle(new Point(150,150), 50);

        circle.draw();
        triangle.draw();
    }
}

class Point{
    int x;
    int y;

    Point(){x=0; y=0;}

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    String getXY(){
        return "("+x+","+y+")";
    }
}

class Shape{
    String color = "Black";
    void draw(){
        System.out.printf("[color=%s]\n", color);
    }
}

class Circle extends Shape{
    Point center;
    int r;

    Circle(){
        this(new Point(0,0), 100);
    }
    Circle(Point center, int r){
        this.center = center;
        this.r = r;
    }

    //Overriding
    void draw(){
        System.out.printf("[Center = (%d, %d), r = %d, color = %s]\n", center.x, center.y, r, color);
    }
}

class Triangle extends Shape{
    Point[] p = new Point[3];

    Triangle(Point[] p){
        this.p = p;
    }

    //Overriding
    void draw(){
        System.out.printf("[p1=%s, p2=%s, p3=%s, color=%s]\n", p[0].getXY(), p[1].getXY(), p[2].getXY(), color);
    }
}
