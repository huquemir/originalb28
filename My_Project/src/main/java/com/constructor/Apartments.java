package com.constructor;

public class Apartments extends Building {
//Inheritance + contructor concept

	//Constructor can not be over-ridden
	Apartments() {
		System.out.println("I live in a apartment in NYC");
	}
	
	//Method Over-riding
	void counter() {
		System.out.println("Adding WOODEN counters in the kitchen");
	}
	
	public static void main(String[] args) {
		
		Apartments obj = new Apartments();
		obj.counter();
	}
	
}
