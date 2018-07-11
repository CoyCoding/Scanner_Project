package com.dockDoors;

public class DockDoor {
	//Eventually DockDoor and Locator will extend class Location. Is-a
	private int date1;
	private int date2;
	private String department;
	private boolean closed;
	
	public DockDoor() {
		super();
	}

	public DockDoor(String department, String date1, String date2) {
		this.department = department;
		try {
		this.date1 = Integer.parseInt(date1);
		}catch(NumberFormatException e) {
			System.out.println("String made it to the date");	}
		try {
			this.date2 = Integer.parseInt(date2);
			}catch(NumberFormatException e) {
				System.out.println("String made it to the date");	
			}
		closed = false;

	}
	
	public DockDoor(String department) {
		this.department = department;
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
						this.date1 = Integer.parseInt(date1);
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
		return !dateLoaded;
		//
		// While date is not within 12/30/XXXX repeat.
		//
		// print date set MM/DD/YYYY
		// done by external method.
	}
	
	public boolean setDate2(String date2) {
		// boolean return for saying the date is good to outside exit loop.
		// takes String input changes to int for date storage.
		// could change to int but thinking of implementing string identifiers for months.
		// Unlike setDate1 Date2 allows empty input to put for no bound on tbd datecheck().
		
		boolean loaded = false;
		if (!(date2.isEmpty())|| (Integer.parseInt(date2) == 0)) { 
		try {
			if (date2.length() == 8) {
				if (!(Integer.parseInt(date2.substring(0, 2)) > 12)) {
					if (!(Integer.parseInt(date2.substring(2, 4)) > 30)) {
						this.date2 = Integer.parseInt(date2);
						loaded = true;
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
		if (loaded) {
			System.out.println("date set to: " + date2.substring(0, 2) + "/" + date2.substring(2, 4) + "/"
					+ date2.substring(4, 8));
		}
	} else {
		this.date2 = -1;
	}
		return loaded;
	
}	

	public void setDepartment(String department) {
		this.department = department;
	}

	public int comparableDate1() {
		//Normal date is MM/DD/YYYY not eaisly comparable.
		//This method flips the date around to YYYY/MM/DD for easy comparisons.
		
		int d;
		if(this.date1 > 0) {
		String tempDate = Integer.toString(this.date1);
		String stringDate ="";
		stringDate = tempDate.substring(4,8) + tempDate.substring(0,2) + tempDate.substring(2,4);
		return Integer.parseInt(stringDate);
		}else {
			d = 0;
		}
		return d;
	}

	public String getDate1() {
		//returns a readable date format for screen display
		//returns "No date Selected" if date = 0;
		
		String d;
		if (this.date1 > 0) {
		d = Integer.toString(this.date1);
		d = d.substring(0, 2) + "/" + d.substring(2, 4) + "/"
		+ d.substring(4, 8);
		} else {
			d = "No date Selected";
		}
		return d;
	}
	
	public String getDate2() {
		//returns a readable date format for screen display
		//returns "No date Selected" if date = 0;
		
		String d;
		if (this.date2 > 0) {
		d = Integer.toString(this.date2);
		d = d.substring(0, 2) + "/" + d.substring(2, 4) + "/"
		+ d.substring(4, 8);
		} else {
			d = "No date Selected";
		}
		return d;
	}
	
	public int comparableDate2() {
		//Normal date is MM/DD/YYYY not eaisly comparable.
		//This method flips the date around to YYYY/MM/DD for easy comparisons.

		int d;
		if(this.date2 > 0) {
		String tempDate = Integer.toString(this.date2);
		String stringDate ="";
		stringDate = tempDate.substring(4,8) + tempDate.substring(0,2) + tempDate.substring(2,4);
		d = Integer.parseInt(stringDate);
		}else {
			d = 0;
		}
		return d;
	}

	public boolean getClosed() {
		return closed;
	}
	
	public String getDepartment() {
		return department;
	}

	public void setClosed(boolean closed) {
		this.closed = closed;
		//this method will eventually be called by closeOut();
		//closeOut() will change all lpns in dockdoor list to unmovable (boolean) and make getters and setters not work. UNLOAD IS THE ONLY WAY TO STOP THIS.
	}
}

