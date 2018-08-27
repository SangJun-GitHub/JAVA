package com.sangjun.Object_oriented_Programming1;

public class CardTest {
    String kind;
    int number;
    static int width = 100;
    static int height = 250;

    public static void main(String[] args){
        System.out.println("CardTest.width: "+ CardTest.width);
        System.out.println("CardTest.height: "+ CardTest.height);

        CardTest card1 = new CardTest();
        card1.kind = "Heart";
        card1.number = 7;

        CardTest card2 = new CardTest();
        card2.kind = "Spade";
        card2.number = 4;

        System.out.println("card1: "+ card1.kind + " " + card1.number + " whidth: " + card1.width + " height: " + card1.height);
        System.out.println("card2: "+ card2.kind + " " + card2.number + " whidth: " + card2.width + " height: " + card2.height);

        System.out.println("whidth and height are changed to 50");
        card1.width = 50;
        card1.height = 50;

//        way better to use className because less confusing
//        CardTest.width = 50;
//        CardTest.height = 50;

        System.out.println("card1: "+ card1.kind + " " + card1.number + " whidth: " + card1.width + " height: " + card1.height);
        System.out.println("card2: "+ card2.kind + " " + card2.number + " whidth: " + card2.width + " height: " + card2.height);

    }


}
