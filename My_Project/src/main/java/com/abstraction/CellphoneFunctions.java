package com.abstraction;



public class CellphoneFunctions implements Cellphone {

	
	public void screen() {
		
		System.out.println("This is cellphone screen");
	}

	public void speakers() {
		
		System.out.println("Speakers are loud");
	}

	public void calls() {
		
		System.out.println("I can make calls from cellphone");
		
	}
	
	
	public static void main(String[] args) {
		
		CellphoneFunctions obj = new CellphoneFunctions();
		obj.screen();
		obj.calls();
		obj.speakers();
	}
	
	

}
