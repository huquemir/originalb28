package com.collectiontest;

import java.util.Arrays;

public class ArrayExample {
	
	public static void grocery() {
		   //index   0        1        2          3         4
  String [] cart = {"milk", "eggs", "cheese", "carrots", "chips"};
	      //cartItems is Reference variable
  	String cartItems = Arrays.toString(cart);
    //Printing all the items 
  	System.out.println("I have these items in the cart : "+cartItems);
     
     //Print one item
     System.out.println("The value at second index is : "+cart[2]);
     
     //Print all the items using a for loop
     for (int i = 0; i<cart.length; i++) {
    	 System.out.println("The for loop contains these values : "+cart[i]);
     }
     
  
	}
	
	
	public static void main(String[] args) {
		ArrayExample.grocery();
	
	}

}
