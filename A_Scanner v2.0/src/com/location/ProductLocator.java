package com.location;

public class ProductLocator extends SigleDatedLocation{
	private boolean loaded;
	
	public ProductLocator(){
		super();
	}
	
 	public ProductLocator(String name, String date, String shipLoc, String location, String loaded){
		this.setName(name);
		this.setShipLoc(shipLoc);
		this.setLocation(location);
		this.setDate1(date);
		this.setLoaded(loaded);
	}
	
 	public boolean getLoaded() {
 		return loaded;
 	}
 	
 	public void setLoaded(String loaded) {
 		if(loaded.equalsIgnoreCase("true")) {
 		this.loaded = true;	
 		}else {
 			this.loaded = false;
 		}
 			
 	}
 	
	public boolean addProductLocaton(ProductLocator PLN) {
	return false;	
	}
	
	public boolean removeProductLocation(ProductLocator PLN) {				//If PLN is in the list remove from list	
	
		return false;
	}
}
