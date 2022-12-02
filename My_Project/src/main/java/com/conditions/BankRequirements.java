package com.conditions;

public class BankRequirements {
	//Java Conditions
	public void fees() {
		int balance = 50;
		
		if (balance >= 100) {
			System.out.println("The customers do not need to pay any maintenance fee");
			
		} else {
			System.out.println("The customer is low on balance. Send a bill");
		}	
		
	}
	
	public void createAccount() {
		
		int age = 14;
		
		if (age >= 18) {
			System.out.println("Customer is allowed to create a bank account");
			
		} else if (age > 15){
			System.out.println("Need to have parent's consent to create bank account");
			
		} else {
			System.out.println("Cannot create a bank account");
		
		}
		
		
	}
	
	 public void bonus() {
		 
		 int amount = 6000;
		 if (amount >= 5000) {
			 System.out.println("Give customer interest of 2 percent");
		 } else {
			 System.out.println("Customer will not get any bonus");
			
		 }
		 
	 }
	 
	 
	 
	
	
	public static void main(String[] args) {
		BankRequirements obj = new BankRequirements();
		//obj.fees();
		//obj.createAccount();
		obj.bonus();
	}
	
	

}
