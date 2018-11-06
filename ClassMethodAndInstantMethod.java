package com.sangjun.java_practice;

public class ClassMethodAndInstantMethod {

    long a, b;

    //InstantMethod
    long add() { return a + b; }
    long subtract() { return a - b; }
    long multiply(){ return a * b; }
    double divide() { return a / b; }

    //ClassMethod
    static long add(long a, long b) { return a + b; }
    static long subtract(long a, long b) { return a - b; }
    static long multiply(long a, long b) { return a * b; }
    static double divide(long a, long b) { return a / b; }

    public static void main(String[] args){

        System.out.println("ClassMethod does not need creating instant");
        System.out.println(ClassMethodAndInstantMethod.add(200L, 100L));
        System.out.println(ClassMethodAndInstantMethod.subtract(200L, 100L));
        System.out.println(ClassMethodAndInstantMethod.multiply(200L, 100L));
        System.out.println(ClassMethodAndInstantMethod.divide(200L, 100L));

        System.out.println("InstantMethod must need instant");
        ClassMethodAndInstantMethod instant = new ClassMethodAndInstantMethod();
        instant.a = 200L;
        instant.b = 100L;

        System.out.println(instant.add());
        System.out.println(instant.subtract());
        System.out.println(instant.multiply());
        System.out.println(instant.divide());
    }
}
