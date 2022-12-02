package com.abstractions;

public interface Cellphone {
	
	void textMessage();
	
	void calls();
	
	void chromeBrowser();
	
	//From Java version 1.8, we can create non-abstract method, or method
	//with a body, we just have to use the default or the static keyword.
	
//	default void games() {
//		
//	}

	
}
