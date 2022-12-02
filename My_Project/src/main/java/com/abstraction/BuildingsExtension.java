package com.abstraction;

public class BuildingsExtension extends Buildings {

	
	void rooms() {
		System.out.println("There are many rooms");
		
	}
	
	void lights() {
		
	}
	
	public static void main(String[] args) {
		
		BuildingsExtension obj = new BuildingsExtension();
		obj.rooms();
		obj.doors();
		obj.lights();
		
		
		Buildings obj1 = new BuildingsExtension();
		obj1.rooms();
		obj1.doors();
		
		
		
	}

	
}
