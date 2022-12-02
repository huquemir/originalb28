package com.inheritance;

public class Child extends Parent {
	
	
	void bicycle() {
		
		System.out.println("The child rides a bicycle");
		
	}
	
	public static void main(String[] args) {
		
		Parent obj = new Parent();
		obj.house();
		
		Child obj1 = new Child();
		obj1.bicycle();
		obj1.house();
		obj1.jewlery();
		
		
		
		
	}
	
	

}
