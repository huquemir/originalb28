package com.poly;

public class OverrloadMethods {

	//Same method name but different parameters (different signature)
	
	void profession() {
		System.out.println("These are the IT Profession");
	}
	
	void profession(int salary, String qa) {
		System.out.println("The salary is : "+salary +" The role is : "+qa);
	}
	
	
	void profession(String dev, int salary) {
		System.out.println("The salary is : "+salary +" The role is : "+dev);
	}
	
	public static void main(String[] args) {
		OverrloadMethods obj = new OverrloadMethods();
		obj.profession();
		obj.profession(110000, "SDET");
		obj.profession("SQL Developer", 115000);
		
	}
	
}
