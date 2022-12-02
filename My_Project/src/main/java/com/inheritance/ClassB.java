package com.inheritance;

public class ClassB extends ClassA{
	

	
	void principal() {
		System.out.println("This is a principal");
	}
	
	
	public static void main(String[] args) {
		
	ClassB obj = new ClassB();
	obj.student();
	obj.teacher();
	obj.principal();
	
	
	
	}

	
	
	
	
	
	
	

}
