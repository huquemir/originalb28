package com.poly;

public class CompleteOverride extends OverridesMethods {

	void salary() {
		super.salary(); // Super keyword is used to call the method of the parent class
		System.out.println("Second year salary of QA is 115000");
	}
	
	public static void main(String[] args) {
		
		CompleteOverride obj = new CompleteOverride();
		obj.salary();
		
		
	}
	
	
}
