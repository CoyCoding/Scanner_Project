package com.location;


public class Locator extends Location {
	
	public Locator() {
		super();
	}
	
	public Locator(String name) {				
		this.setName(name);		
		this.setLocation(name);
	}

	
}
