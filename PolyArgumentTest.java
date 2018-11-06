package com.sangjun.java_practice;

/**
 * Created by bobsang89@gmail.com on 2018-11-06
 * Project: java-practice
 * Github : http://github.com/SangJun-GitHub
 */
public class PolyArgumentTest {
    public static void main(String[] args){
        Buyer customer = new Buyer();

        customer.buy(new Laptop());
        customer.buy(new Computer());
        customer.buy(new Audio());
        customer.summary();
    }
}

class Product{
    int price;
    int bonusPoint;

    Product(){}
    Product(int price){
        this.price = price;
        this.bonusPoint = (int)(price/10.0);
    }
}

class Laptop extends Product{
    Laptop(){super(100);}
    public String toString(){return "Laptop";}
}

class Computer extends Product{
    Computer(){super(200);}
    public String toString(){return "Computer";}
}

class Audio extends Product{
    Audio(){super(50);}
    public String toString(){return "Audio";}
}
class Buyer{
    int money = 1000;
    int bonusPoint = 0;
    Product[] item = new Product[10];
    int index = 0;

    void buy(Product product){
        if(money<product.price)
            System.out.println("Not enough money to buy for" + product);
        money -= product.price;
        bonusPoint += product.bonusPoint;
        item[index++] = product;
        System.out.println("Thank you for buying "+ product);
    }

    void summary(){
        int totalPrice = 0;
        int totalPoint = 0;
        String itemList = "";

        for(int i = 0; i<item.length; i++){
            if(item[i]==null)
                break;
            totalPrice += item[i].price;
            totalPoint += item[i].bonusPoint;
            itemList += (i==0)? "" + item[i] : "," + item[i];
        }
        System.out.println("Total price is " + totalPrice);
        System.out.println("Total point is " + totalPoint);
        System.out.println("Product list is " + itemList);
    }
}

