package com.collections;

import java.util.*;


public class MapExample {
	
	public static void main(String[] args) {
		//If no data type specified, it is generic
		//Map boroughs = new HashMap();
		//HashMap does not have insertion order
		Map<String,String> boroughs = new HashMap<String,String>();
		boroughs.put("Yellow", "Bronx");
		boroughs.put("Blue", "Manhattan");
		boroughs.put("Green", "Brooklyn");
		boroughs.put("Violet", "Queens");
		boroughs.put("Brown", "Staten Island");
		boroughs.put("Black", "Hicksville");
		boroughs.put("Brown", "Greatneck");
		boroughs.put("Orange", null); //Map can have many null values
		boroughs.put("Grey", null);
		boroughs.put(null, "Garden City"); // but Map only has one null Key
		boroughs.put(null, "New Hyde Park");
		
		System.out.println(boroughs);
		
		//How to print Map in each line? Use the advance for loop
		for(Map.Entry<String,String> m : boroughs.entrySet()) {
			System.out.println("Key : "+m.getKey()+ " - Value : "+m.getValue());
			
		}
		
		//LinkedHashMap will have insertion order
		Map<Integer,String> employees = new LinkedHashMap<Integer,String>();
		employees.put(10, "Movee");
		employees.put(20, "Nahid");
		employees.put(30, "Aqib");
		employees.put(40, "Mostafa");
		employees.put(25, "Franklin");
		
		System.out.println(employees);
		
		
		Map <Integer,String> departments = new TreeMap<Integer,String>();
		departments.put(10, "IT");
		departments.put(20, "Finance");
		departments.put(30, "Accounting");
		departments.put(40, "HR");
		departments.put(40, "HR");
		departments.put(25, "Administration");
		departments.put(50, null);
		departments.put(50, null);
		departments.put(60, null);
		//departments.put(null, "Sales");
		
		System.out.println(departments);
		
		Hashtable <String,String> creds = new Hashtable<String,String>();
		creds.put("user@eample.com", "123abc");
		creds.put("user@eample.com", "123abc");
		creds.put("user1@eample.com", "123abc");
		
		//creds.put(null, "22222");
		//creds.put("user@eample.com", null);
		System.out.println(creds);
	}
	

}
