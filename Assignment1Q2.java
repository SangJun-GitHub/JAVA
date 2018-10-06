package com.sangjun.assingment;


import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by bobsang89@gmail.com on 2018-10-05
 * Project: java-practice
 * Github : http://github.com/SangJun-GitHub
 */
public class Assignment1Q2 {
    public static  class Meal{
        private double cost;

        public double calculateTax(){
            return this.cost * 0.13;
        }

        public double calculateTip(){
            return this.cost * 0.15;
        }
        public double calculateTipTotal(){
            double total = this.cost;
            total += this.calculateTax();
            total += this.calculateTip();
            return total;
        }

        public void receipt(){
            System.out.println("Cost of the meal : " + this.cost);
            System.out.println("Tax of the meal  : " + this.calculateTax());
            System.out.println("Tip of the meal  : " + this.calculateTip());
            System.out.println("Total of the meal: " + this.calculateTipTotal());
        }

        public void setCost(double cost) {
            this.cost = cost;
        }

    }

    public static void main (String[] args){
        Meal meal = new Meal();
        System.out.println("Enter the cost of meal");
        Scanner s = new Scanner(System.in);
        while(true) {
            try {
                double price = s.nextDouble();
                meal.setCost(price);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Enter wrong cost");
                s = new Scanner(System.in);
            }
        }
        meal.receipt();

    }
}
