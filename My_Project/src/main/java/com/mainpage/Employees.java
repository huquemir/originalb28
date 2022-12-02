package com.mainpage;

public class Employees {
	int monthly; // Instance variable
	static String dept_name; //static variable
	
	public static void main(String[] args) {
			
		Employees.department(); // This is how you call a static method. Classname.methodname
		
		Employees obj = new Employees(); //This is how you call the non static method. 
		obj.salary(); 
		System.out.println("My current location is : "+ obj.location());
		
	}
	
	void salary() {
		
		int yearly = 100000; // yearly is a local variable
		monthly = 6000; // value of the instance variable
		dept_name= "Finance"; // You can have a static variable in a non-static method. 
		System.out.println("My yearly salary is : "+ yearly);
		System.out.println("My monthly salary is : "+ monthly);
		
	}
	

	static void department() {
		
		dept_name = "IT department"; //value of the static variable 
		System.out.println("My department is : "+dept_name);
		
	}
	
	String location() {
		return "New York City";
		
	}
	


	
	

}

