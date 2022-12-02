package com.abstractions;

public class CellphoneFunction implements Cellphone, Walkietalkie {

	public void textMessage() {
		
		System.out.println("All my messages");
		
	}
	
	public void calls() {
		
		System.out.println("I can make calls to my parents");
	}
	
	
	public static void main(String[] args) {
		
		CellphoneFunction obj = new CellphoneFunction();
		obj.textMessage();
		obj.calls();
		
		
		Cellphone obj1 = new CellphoneFunction();
		obj1.textMessage();
		obj1.calls();
		
		Walkietalkie obj2 = new CellphoneFunction();
		obj2.pushButton();
		
		//Not possible to create objects from interface because interfaces
		//only contain abstract method and does not have any body.
		//CellphoneFunction obj2 = new cellphone();
		
		//CellphoneFunction obj2 = new Walkietalkie();
		
		
	}

	public void chromeBrowser() {
		System.out.println("I can browse the web on my phone");
		
	}

	public void pushButton() {
		System.out.println("Press the button to talk to the other person");
		
	}



}
