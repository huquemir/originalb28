package com.collections;

import java.util.*;

public class SetExample {
	
	public static void main(String[] args) {
		
		Set <String> knives = new HashSet<String>();
		knives.add("steak");
		knives.add("fishing");
		knives.add("butter");
		knives.add("butter");
		knives.add("steak");
		knives.add("butter");
		knives.add(null);
		knives.add(null);
		knives.add(null);
		knives.add(null);
		knives.add(null);
		knives.add("steak");
		
		System.out.println(knives);
		
		//Insertion order is maintained in LinkedHashSet
		//One null value
		//No duplicate value
		Set <String> toy = new LinkedHashSet<String>();
		toy.add("trains");
		toy.add("doll");
		toy.add("car");
		toy.add("car");
		toy.add("car");
		toy.add(null);
		toy.add(null);
		
		System.out.println(toy);
		
		//Insertion order is Ascending Order or in string Alphabetical
		//Natural order is same as Ascending Order
		//No Null value
		//No duplicate value

		Set <String> employees = new TreeSet<String>();
		employees.add("Movee");
		employees.add("Nahid");
		employees.add("Aqib");
		employees.add("Mostafa");
		employees.add("Mostafa");
		employees.add("Nahid");
		employees.add("Movee");
		//employees.add(null); THIS IS NOT ALLOWED WITH TREESET
		
		System.out.println(employees);
		
	}

}
