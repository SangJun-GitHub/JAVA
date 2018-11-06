package com.sangjun.java_practice;

/**
 * Created by bobsang89@gmail.com on 2018-11-06
 * Project: java-practice
 * Github : http://github.com/SangJun-GitHub
 */
public class AbstractTest2 {
    public static void main(String[] args){
        Unit[] group = new Unit[4];
        group[0] = new Marine();
        group[1] = new Tank();
        group[2] = new Marine();
        group[3] = new DropShip();

        for (int i=0; i<group.length; i++) {
            group[i].move(100, 200);
            group[i].position();
        }
    }
}

//class Marine{
//    int x, y;
//    void move(int x, int y) {/* Move to specified position*/}
//    void stop() {/*Stop at the current position*/}
//    void stimPack(){/*Use stim pack*/}
//}
//class Tank{
//    int x, y;
//    void move(int x, int y) {/* Move to specified position*/}
//    void stop() {/*Stop at the current position*/}
//    void changeMode(){/*Change mode*/}
//}
//class Deanship{
//    int x, y;
//    void move(int x, int y) {/* Move to specified position*/}
//    void stop() {/*Stop at the current position*/}
//    void load() {/*load chosen unit*/}
//    void unload() {/*unload chosen unit*/}
//}

abstract class Unit{
    int x, y;
    abstract void move(int x, int y);
    void stop() {/*Stop at the current position*/}
    void position(){
        System.out.println(getClass().getName() +": x= " + x + " y= " +y);
    }
}

class Marine extends Unit{
    void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
    void stimPack() {/*Use stim pack*/}
}
class Tank extends Unit{
    void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
    void changeMode() {}
}
class DropShip extends Unit{
    void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
    void load() {/*load chosen unit*/}
    void unload() {/*unload chosen unit*/}
}