package com.abstractions;

public class DrivingFunctions extends Driving {

	//Class to Class you will extend
	//Class to Interface you will implement 
	//Interface to interface - try on your own - yes it's possible. you have extend
	
	public static void main(String[] args) {
		DrivingFunctions obj = new DrivingFunctions();
		obj.engine();
		obj.steering();
	}

	@Override
	void engine() {
	System.out.println("The engine runs 600 horsepowers");	
		
	}

}
