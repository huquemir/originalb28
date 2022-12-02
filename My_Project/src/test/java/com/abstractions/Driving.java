package com.abstractions;

public abstract class Driving {

	abstract void engine(); // abstract method
	
	void steering() {     // non-abstract method
		System.out.println("Steering left or right");
	}
	
	//abstract class will allow creating the main method. But you can not create
	//an object. 
	
	//But if you have a static method, then you can use the main method
	//In the abstract, you can only call and execute the static method, 
	
	static void radio() {
		System.out.println("We can listen to the music while driving");
	}
	
	public static void main(String[] args) {
		
		Driving.radio();

	}

}
