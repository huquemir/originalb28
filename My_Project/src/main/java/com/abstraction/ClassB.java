package com.abstraction;

public class ClassB implements InterfaceC, InterfaceD {

	public void laptops() {
		
		System.out.println("I have a windows machine");
	}

	public void chairs() {
		System.out.println("I am sitting on a chair");
		
	}

	public void watches() {
		System.out.println("I can tell time with my watch");
		
	}
	
	public static void main(String[] args) {
		
		ClassB obj = new ClassB();
		obj.laptops();
		obj.chairs();
		obj.watches();
		
		//You cannot create an object or an instance from an interface.
		//ClassB obj1 = new InterfaceC();
		
		//If you have an interface and creating object from instance of a 
		//a class, it is possible.
		InterfaceC obj2 = new ClassB();
		obj2.laptops();
		obj2.chairs();
		
		InterfaceD obj3 = new ClassB();
		obj3.watches();
		
		
		
	}

}
