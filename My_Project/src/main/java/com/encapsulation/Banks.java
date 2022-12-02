package com.encapsulation;

final class Banks {
 //access modifier	//Data type  //variable       //value
								//declaration	  Initialization	  
	private            int        balance;        //instance variable
	
	private           String   accountNumber;
	
	private           String    name;
	
	private			 String     address;

	
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() { //get methods, we have to use the return type method
		return balance;
	}

	public void setBalance(int balance) {//set method we have to use the void - or returns nothing
		this.balance = balance; //this keyword refers to the class - in this case 
								// it is referring to the variables of the same class
	}
	
	

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	
	


	
	
	
	                           
	                           
	                           
	
	

}
