package com.sangjun.java_practice;

/**
 * Created by bobsang89@gmail.com on 2018-11-06
 * Project: java-practice
 * Github : http://github.com/SangJun-GitHub
 */
public class FighterTest {
    public static void main(String[] args){
        Fighter fighter = new Fighter();
        if(fighter instanceof GameUnit)
            System.out.println("fighter is children of GameUnit class");
        if(fighter instanceof Fighterable)
            System.out.println("fighter implements Fighterable interface ");
        if(fighter instanceof Movable)
            System.out.println("fighter implements Movable interface ");
        if(fighter instanceof Attackable)
            System.out.println("fighter implements Attackable interface ");
        if(fighter instanceof Object)
            System.out.println("fighter is children of Object class ");
    }
}
class Fighter extends GameUnit implements Fighterable{
    public void move(int x, int y){}
    public void attack(GameUnit unit){}
}

class GameUnit{
    int currentHP;
    int x;
    int y;
}

interface Movable {
    void move(int x, int y);//public abstract void move(int x, int y);
}
interface Attackable {
    void attack(GameUnit unit);
}
interface Fighterable extends Movable, Attackable {}

