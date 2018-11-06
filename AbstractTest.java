package com.sangjun.java_practice;

/**
 * Created by bobsang89@gmail.com on 2018-11-06
 * Project: java-practice
 * Github : http://github.com/SangJun-GitHub
 */
public class AbstractTest {
    public static void main(String[] args){
    CDPlayer cdPlayer = new CDPlayer();
    cdPlayer.play();
    cdPlayer.play(100);
    cdPlayer.pause();
    }
}

abstract  class Player{
    boolean pause;
    int currentPos;

    Player(){
        pause = false;
        currentPos = 0;
    }
    /* Create a function to start playback at the specified position */
    abstract void play(int pos);//abstract method
    /* Create a function to stop playback immediately*/
    abstract void stop();//abstract method

    void play(){
        play(currentPos);// can use abstract method
    }

    void pause(){
        if(pause){
            pause = false;
            play(currentPos);
        }else{
           pause = true;
           stop();
        }
    }
}

class CDPlayer extends Player{
    @Override
    void play(int pos) {
        /*Implement for abstract method of parent class*/
        currentPos = pos;
        System.out.println("Playing " + currentPos + " pos");
    }

    @Override
    void stop() {
        System.out.println("stop");
    }

    int currentTrack;

    void nextTrack(){
        currentTrack++;
    }

    void preTrack(){
        currentTrack--;
    }
}
