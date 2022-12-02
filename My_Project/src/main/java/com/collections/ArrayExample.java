package com.collections;

import java.util.Arrays;

public class ArrayExample {
	
	
	public static void main(String[] args) {
		
	//data type	//variable declaration    //variable initialization
		int      dollars           =             10;
		System.out.println("I got money from atm : $"+ dollars);
		
		//This is one way to write an array. We use the square bracket in front of the
		// variable and we put the data in the curly brace
		int [] grades = {70, 75, 80, 82, 79, 79};
		//System.out.println("The student grades are : "+grades);
		
		//To print arrays, there are a couple of ways: 
		//1. Create a loop
		//2. to use another method using the Arrays class
		
		//Print using the Arrays class
		System.out.println("The student grades are : "+ Arrays.toString(grades));
		
		//Print using the Loop. We can use the for loop. The zero is the starting index
		for (int i = 0; i<grades.length; i++) {
			System.out.println("The Student grades are "+grades[i]);
		}
		//If we just want the value of the index, we specify the index we want to print
		System.out.println("The value of index 4 is " +grades[4]);
		
		
		//There is another way to write an array. We create an object an store it in
		//the array
		
		int [] salary = new int [6]; // 3 here is the total amount you want to store
									// Arrays follow the index theory. The index is always
									// one less than the total because
									// Index starts from zero. 
		salary[0] = 90000; // 0 here is called an index.
		salary[1] = 95000; // 1 here is called an index.
		salary[2] = 100000; // 2 here is called an index.
		salary[3] = 105000;
		salary[4] = 110000;
		salary[5] = 111000;
		
		System.out.println("The salary of employee is : "+ Arrays.toString(salary));
		//For Loop
		for (int i = 0; i<salary.length; i++) {
			System.out.println("The employee salaries are "+salary[i]);
		}
		
		//Advance For Loop
		for ( int amount : salary ) {
			System.out.println("The employee salaries are " + amount);
		}
		
		//If we just want the value of the index, we specify the index we want to print
		 System.out.println("The salary at index 3 is " +salary[3]);
		 
		 //If we have one square bracket or third bracket, then it's a single dimension 
		 //array. If we add another square bracket, it will become a multi-dimension.
		 //Multi-dimension is a table format. It means we can store the data in the array
		 //in a table or rows and columns. 
		 
		 //How to write the Multi-dimension?
		 
		 int [] [] lotto = {{70, 75, 80, 82, 79},
				            {20, 45, 65, 51, 4 }}; //this represents one row
		 System.out.println("The lotto number at row index 1 and column index 2  is " +lotto[1][2]);
		 System.out.println("The lotto number at row index 0 and column index 3  is " +lotto[0][3]);
	
		 //Since the length of the array is fixed, Java can handle this using Lists
	
	}
	
	
		 
	
		 
		
	}
	
	


