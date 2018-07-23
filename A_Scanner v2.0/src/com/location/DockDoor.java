package com.location;



public class DockDoor extends DoubleDatedLocation{
					//We add a second date to doors
	
	public DockDoor() {					//super constructor
		super();
	}
	
	public DockDoor(String date, String date2, String name, String shipLoc) { 				//constructor for building a DockDoor missing the list of items the missing items are in there own txt file
		this.setDate1(date);												//This is for easy access to information. [name].txt file where name is the location.
		this.setDate2(date2);											
		this.setName(name);	
		this.setLocation(name);		
		this.setShipLoc(shipLoc);
	}
	
	public boolean dateCheck(ProductLocator PLN) {
		return ((PLN.getDate1() >= this.getDate1()) && (PLN.getDate1() <= this.getDate2()) || ((this.getDate2() == 0) && (PLN.getDate1() >= this.getDate1())));
		//checks that the date of the object is within range or if date 2 is 0 PLN
	}
	
	public boolean addProductLocaton(ProductLocator PLN) {
		if(PLN.getShipLoc() == this.shipLoc && !(PLN.getLoaded()) && this.dateCheck(PLN)) {
			
		}
		return contains.add(PLN);
	}
	
	public boolean removeProductLocation(ProductLocator PLN) {				//If PLN is in the list remove from list											//Other Logic will designate 
		return	contains.remove(PLN);		
	}
	
	
	
}
