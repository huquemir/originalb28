package com.loops;

public class ForLoop {
	
	public static void repeatSentence() {
		//i++ means i=i+1
	
			int i = 1;
			i++;
			//The new value of i will be i+1 which is 2
			
			System.out.println("The value of i is "+i);
			
			
			//This will initialize the value then add the value. 
			int j = 1;
			++j;
			j = 3;
			System.out.println("The value of j is "+j);
				
	
	}
	
	
	public static void repeatNumbers() {
		
		for (int i = 0; i < 10000; i++) {
			System.out.println(i);
			
		}
				
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		//ForLoop.repeatSentence();
		ForLoop.repeatNumbers();
		
		
	}
	

}
