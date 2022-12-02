package com.collections;

import java.util.*;

public class ListExample {
	
	//Why do we need a list?
	//To handle the array fixed length problem
	
	//List is a Java interface. It has a parent interface called Collection which 
	//has a super interface called Iterable (top level interface)
	
	//Java Collection framework has many interface. List is one of the Interface
	
	//How do you create a List in Java? 
	
	public static void main(String[] args) {
		//Formula for List. We have to use the datatype using the class. We cannot use
		//primitive data type. We use the Non-primitive data type. Non-primitive data type
		//is also called the Wrapper Class
		List <Integer> number = new ArrayList<Integer>();
		number.add(10); //index 0
		number.add(15); //index 1
		number.add(10); //index 2
		number.add(30); //index 3
		
		System.out.println("The numbers in the list are : "+number);
		
		for(int i = 0; i<number.size(); i++) {
			System.out.println("The numbers in the list are : "+number.get(i));
		}
		
		//How to print at the exact index
		System.out.println("The value at index 2 is : "+number.get(2));
		
		//How to print using the advance loop
		
		for (Integer x : number) {
			System.out.println("The numbers in the list are : "+ x);
		}
		
		
		ArrayList <Integer> numbers = new ArrayList<Integer>();
		numbers.add(20);
		numbers.add(30);
		numbers.add(30);
		numbers.add(30);
		numbers.add(null);
		numbers.add(null);
		System.out.println("The value of the array list is "+numbers);
	
		//Extra ways of writing ArrayLists
		//ArrayList <Integer> obj = new ArrayList<>(); //Java version 1.7 and up
		//obj.add(20);
		//obj.add(30);
	
		ArrayList <Integer> obj = new ArrayList<Integer>(Arrays.asList(20,30,40));
		System.out.println("The other list contains "+obj);
		
		ArrayList <String> names = new ArrayList<String>();
		names.add("Nahid");
		names.add("Movee");
		names.add("Shah");
		names.add("Shahed");
		names.add("Mustafa");
		names.add("Mustafa");
		names.add(null);
		names.add(null);
		
		System.out.println("Today's live class attendance : "+names);
	
		LinkedList <String> name = new LinkedList<String>();
		name.add("Aqib");
		name.remove("Aqib");
		System.out.println(name);
		
		Vector <String> books = new Vector<String>();
		books.add("Harry Potter");
		System.out.println("Favorite book is : "+books);
		
		
	}
	
	
		
		
	

}
