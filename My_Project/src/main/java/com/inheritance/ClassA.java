package com.inheritance;

public class ClassA {
	
	public static void main(String[] args) {
		ClassA obj = new ClassA();
		obj.student();
		obj.teacher();
		
		
	}
	
	void student() {
		//body of the method inside the curly brace
		System.out.println("This is a student");
		
	}
	
	void teacher() {
		
		System.out.println("This is a Teacher");
	}

}
