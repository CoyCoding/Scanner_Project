package com.location;

public abstract class SigleDatedLocation extends Location{								
	protected int date1;									//New abstract location dated locations																						//Locator didn't need dates but doors and LPNs do
	protected String shipLoc;								//Dated locations also have a shipping location which must match to move the ProductLocation
	
	public String getShipLoc() {
		return shipLoc;
	}
	
	public void setShipLoc(String shipLoc) {
		this.shipLoc = shipLoc;
	}
	
	public int getDate1() {
		return date1;
	}
	
	public boolean setDate1(String date1) {
		// boolean return for saying the date is good to outside exit loop.
		// takes String input changes to int for date storage.
		// could change to int but thinking of implementing string identifiers for months.
		
		boolean dateLoaded = false;
		try {
			if (date1.length() == 8) {
				if (!(Integer.parseInt(date1.substring(0, 2)) > 12)) {
					if (!(Integer.parseInt(date1.substring(2, 4)) > 30)) {
						this.date1 = Integer.parseInt(date1.substring(4, 8) + date1.substring(0, 2) + date1.substring(2, 4));
						dateLoaded = true;
					} else {
						System.out.println("incorrect MONTH format");
					}
				} else {
					System.out.println("incorrect DAY format");
				}
			} else {
				System.out.println("incorrect format");
			}
		} catch (NumberFormatException nfe) {
			System.out.println("IMPROPER CHARACTCER");
			//Try catch with exception for characters instead of int.
			
		}
		if (dateLoaded) {
			System.out.println("date set to: " + date1.substring(0, 2) + "/" + date1.substring(2, 4) + "/"
					+ date1.substring(4, 8));
			
		}
		return dateLoaded;
		//
		// While date is not within 12/30/XXXX repeat.
		//
		// print date set MM/DD/YYYY
		// done by external method.
	}
	
	public String getDate1ForUser() {													
		String d;											//returns a readable date format for screen display
		if (this.date1 > 0) {								//returns "No date Selected" if date = 0;
		d = (Integer.toString(this.date1).substring(4, 6) + "/" + Integer.toString(this.date1).substring(6, 8) + "/" + Integer.toString(this.date1).substring(0, 4)) ;
		} else {
			d = "No date Selected";
		}
		return d;
	}

}
