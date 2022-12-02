package com.abstraction;

public abstract class Remote {
	
	abstract void powerButton();
	
	
	abstract void numberButtons();
	
	
	void volumeButton() {
		System.out.println("The volume button changes sound level");
	}
	
	void playButton() {
		
		System.out.println("We can watch movies by pressing the play button");
		
	}
	

}
