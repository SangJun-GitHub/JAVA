package com.sangjun.java_practice;

/**
 * Created by bobsang89@gmail.com on 2018-11-03
 * Project: java-practice
 * Github : http://github.com/SangJun-GitHub
 */
public class CaptionTvTest {
<<<<<<< HEAD
=======
    public static void main(String[] args){
        CaptionTv captionTv = new CaptionTv();

        System.out.println("Before power() : "+ captionTv.power);
        captionTv.power();
        System.out.println("After power() : " + captionTv.power);

        System.out.println("Default channel : "+ captionTv.channel);
        captionTv.channelUp();
        System.out.println("After channelUp() : " + captionTv.channel);
        captionTv.channelDown();
        System.out.println("After channelDown() : " + captionTv.channel);

        System.out.println("Before caption() : " +captionTv.caption);
        captionTv.displayCaption("Hello");
        captionTv.caption();
        System.out.println("After caption() : "+ captionTv.caption);
        captionTv.displayCaption("Hi, Sang Jun");
    }
}
class Tv{
    boolean power = false;
    int channel = 10;

    void power(){power = !power;}
    void channelUp(){channel++;}
    void channelDown(){channel--;}

}

class CaptionTv extends Tv{
    boolean caption = false;

    void caption(){caption = !caption;}
    void displayCaption(String text){
        if(caption)
            System.out.println(text);
    }
>>>>>>> origin/master
}
