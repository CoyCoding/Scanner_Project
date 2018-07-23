package com.location;

public abstract class DoubleDatedLocation extends SigleDatedLocation {
	private int date2;

	public boolean setDate2(String date2) {
		// boolean return for saying the date is good to outside exit loop.
		// takes String input changes to int for date storage.
		// could change to int but thinking of implementing string identifiers for
		// months.

		boolean dateLoaded = false;
		if (!(date2 == "0" || date2.isEmpty())) {
			try {
				if (date2.length() == 8) {
					if (!(Integer.parseInt(date2.substring(0, 2)) > 12)) {
						if (!(Integer.parseInt(date2.substring(2, 4)) > 30)) {
							this.date2 = Integer.parseInt(date2);
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
				// Try catch with exception for characters instead of int.

			}

			// if (dateLoaded) {
			// System.out.println("date set to: " + date2.substring(0, 2) + "/" +
			// date2.substring(2, 4) + "/"
			// + date2.substring(4, 8));
			//
			// }

		} else {
			this.date2 = 0;
		}
		return dateLoaded;
	}
	
	public int getDate2() {
		return this.date2;
	}

	public String getDate2ForUser() {													
		String d;											//returns a readable date format for screen display
		if (this.date2 > 0) {								//returns "No date Selected" if date = 0;
			
		d = (Integer.toString(this.date2).substring(4, 6) + "/" + Integer.toString(this.date2).substring(6, 8) + "/" + Integer.toString(this.date2).substring(0, 4)) ;
		
															//This takes the date parses toString into MM/DD/YYYY for users
		} else {
			d = "No date Selected";
		}
		return d;
	}
	
}
