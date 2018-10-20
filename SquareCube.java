package com.sangjun.java_practice;


public class SquareCube {
	public static int multiply(int a){
		return a * a;
	}
	
	public static int threeply(int a){
		return a*a*a;
	}
	
	public static void main(String[] args){
		System.out.println("Number  Square    Cube");
		for(int a = 1; a <11; a++)
		System.out.printf( "%6d%8d%8d\n", a, multiply(a), threeply(a));
	}
}
