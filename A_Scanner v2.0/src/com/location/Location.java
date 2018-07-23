package com.location;

import java.util.ArrayList;


public abstract class Location {
	
	//Location extended by DockDoors Locators ProductLocator
	
	private String name;
	private ArrayList<Object> contains;
	private String location;
	

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Object> getContains() {
		return contains;
	}
	public void setContains(ArrayList<Object> contains) {
		this.contains = contains;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public boolean addProductLocaton(ProductLocator PLN) {
		return contains.add(PLN);
	}
	
	public boolean removeProductLocation(ProductLocator PLN) {				//If PLN is in the list remove from list											//Other Logic will designate 
		return	contains.remove(PLN);		
	}
	
}
