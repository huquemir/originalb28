package com.abstraction;

public abstract class Buildings {
	//If you have one abstract, the class MUST be abstract
	abstract void rooms();
	
	void doors(){
		System.out.println("Door are used for enterance");
	}
	
	static void storage() {
		System.out.println("I can store my clothes in the storage room");
	}
	
	public static void main(String[] args) {
		//You cannot create instance of an abstract class
		//Buildings obj = new Buildings();
		
		//Only Static methods can be called in the abstract class
		Buildings.storage();
		
	}
	
}
