package com.encapsulations;

public class Manager  {
	
	public static void main(String[] args) {

		
		ChaseBank obj = new ChaseBank();
		obj.setAccNum(45678);
		
		int account = obj.getAccNum();
		System.out.println(account);
		
		
		
	}

}
