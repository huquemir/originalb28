package com.polymorphism;

public class Human {
	
	//Method overloading - Same method name but different parameter 
	
	public void franklin() {
		System.out.println("Franklin is a teacher");
	}
	
	public void franklin(String sibling) {
		System.out.println("Franklin's brother is : "+sibling);
	}
	
	public void franklin(int salary) {
		System.out.println("Franklin makes this much a year : "+salary);
		
	}
	
	public void franklin(String sibling1, String sibling2) {
		System.out.println("Franklin is a brother");
	}
	
	public void franklin(int salary, String sibling2) {
		System.out.println("Franklin is a brother");
	}
	

	
	public static void main(String[] args) {
		
		Human obj = new Human();
		obj.franklin();
		obj.franklin("John");
		obj.franklin();
		
	}

}
