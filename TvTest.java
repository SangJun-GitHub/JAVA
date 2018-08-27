package com.sangjun.Object_oriented_Programming1;

public class TvTest{
    String color;
    boolean power;
    int channel;

    void power() {power = !power;}
    void channelUp() {++channel;}
    void channelDown() {--channel;}

    public static void main(String[] args){
        TvTest t1 = new TvTest();
        TvTest t2 = new TvTest();
        System.out.println("t1.chanel: " + t1.channel);
        System.out.println("t2.chanel: " + t2.channel);

        t2 = t1;

        t1.channel = 7;
        System.out.println("t1.chanel: " + t1.channel);
        System.out.println("t2.chanel: " + t2.channel);

        t1.channelDown();
        System.out.println("t1.chanel: " + t1.channel);
        System.out.println("t2.chanel: " + t2.channel);

        t1.channelUp();
        System.out.println("t1.chanel: " + t1.channel);
        System.out.println("t2.chanel: " + t2.channel);
        //////////////////////////////////////////////////

        TvTest[] tvArr = new TvTest[3];
        for(int i = 0; i < tvArr.length; i++){
            tvArr[i] = new TvTest();
            tvArr[i].channel = i + 10;
        }
        for(int i = 0; i< tvArr.length; i++){
            tvArr[i].channelUp();
            System.out.println("tvArr[" + i + "] : " +tvArr[i].channel);
        }
        //////////////////////////////////////////////////

    }
}
