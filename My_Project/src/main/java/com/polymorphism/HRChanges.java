package com.polymorphism;

public class HRChanges extends HumanResource {
	
	//Method Overriding - Same method name, same parameter, different class.
	//Method Overriding is also called Dynamic binding
	//Method Overriding is also called Runtime polymorphism 
	
		public static void main(String[] args) {
			HRChanges obj = new HRChanges();
			obj.salary();
			
			//HumanResource obj1 = new HumanResource();
			//obj1.salary();
		}

		public void salary() {
			int salary = 120000;
			System.out.println("My current salary is : "+salary);
	 
		}
		
		
		
	
}
