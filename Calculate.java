package com.sangjun.java_practice;

import java.util.Scanner;

public class Calculate {

	public static double sum(double a, double b){

		return a+b;
	}
	public static double multiply(double a, double b){
		return a*b;
	}
	public static double divide(double a, double b){

		return a/b;
	}
	public static double difference(double a, double b){
		if(a > b)
		return a-b;
		return b-a;
	}
	
	public static void main(String[] args){

		System.out.println("Enter a integer number");
		@SuppressWarnings("resource")
		double a = new Scanner(System.in).nextInt();
		System.out.println("Enter a integer number");
		@SuppressWarnings("resource")
		double b = new Scanner(System.in).nextInt();
		System.out.printf("Sum: %.0f%n", sum(a, b));
		System.out.printf("multiply: %.0f%n", multiply(a, b));		
		System.out.printf("divide: %.2f%n", divide(a, b));
		System.out.printf("difference: %.0f%n", difference(a, b));
	}
}
