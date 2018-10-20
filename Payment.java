package com.sangjun.java_practice;

import java.util.Scanner;

public class Payment {
	static double totalSales = 0;
	
	public static double sale(double item, int num){
		return item * num;
	}
	
	public static double salary(double sales){
		return 200 + (sales * 1.09) - sales;
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args){

	final double item1 = 239.99;
	final double item2 = 129.75;
	final double item3 = 99.95;
	final double item4 = 350.89;
	
	System.out.println("How many item1 sold");
	int num = new Scanner(System.in).nextInt();
	Payment.totalSales += sale(item1, num);
	System.out.println("How many item2 sold");
	num = new Scanner(System.in).nextInt();
	totalSales += sale(item2, num);
	System.out.println("How many item3 sold");
	num = new Scanner(System.in).nextInt();
	totalSales += sale(item3, num);
	System.out.println("How many item4 sold");
	num = new Scanner(System.in).nextInt();
	totalSales += sale(item4, num);
	
	System.out.printf("%.2f$",salary(totalSales));
	
	
	
	}
	
}
