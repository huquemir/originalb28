package com.collectiontest;

import java.util.ArrayList;
import java.util.List;

public class ListExamples {
	
	//You have to create the list in a method
	
	public void clothes() {
		//For a list we have to create the object. So we have to use the new
		//keyword

		List <String> items = new ArrayList<String>();
		items.add("shoes");
		items.add("shirt");
		items.add("pants");
		items.add("tie");
		
		System.out.println(items);
		
	     for (int i = 0; i<items.size(); i++) {
	    	 System.out.println("The for loop contains these values : "+items.get(i));
	     }
	     
	     //How to search in the list with a condition
	     if (items.contains("watch")) {
	    	 System.out.println("My list contains item");
	     } else {
	    	 System.out.println("My list doesn't have this item");
	     }
		
		
	}
	
	
	public static void main(String[] args) {
		
		ListExamples obj = new ListExamples();
		obj.clothes();
	
	}

}
