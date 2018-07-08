package com.dockDoors;

public class DockDoors {

	private String date1;
	private String date2;
	private String department;

	public DockDoors() {
		super();
	}

	public DockDoors(String department, String date1, String date2) {
		this.department = department;
		this.date1 = date1;
		this.date2 = date2;

	}

	public DockDoors(String department) {
		this.department = department;
	}

	public boolean setDate1(String date1) {
		// boolean for saying the date is good to exit loop.
		// input loaded up
		boolean loaded = false;
		try {
			if (date1.length() == 8) {
				if (!(Integer.parseInt(date1.substring(0, 2)) > 12)) {
					if (!(Integer.parseInt(date1.substring(2, 4)) > 30)) {
						this.date1 = date1;
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
			System.out.println("date set to: " + date1.substring(0, 2) + "/" + date1.substring(2, 4) + "/"
					+ date1.substring(4, 8));
			
		}
		return !loaded;
	}
	

	//
	// While date is not within 12/30/XXXX repeat.
	//
	// print date set MM/DD/YYYY

	public boolean setDate2(String date2) {
		// boolean for saying the date is good to exit loop.
		// input loaded up
		boolean loaded = false;
		if (!(date2.isEmpty())) { 
		try {
			if (date2.length() == 8) {
				if (!(Integer.parseInt(date2.substring(0, 2)) > 12)) {
					if (!(Integer.parseInt(date2.substring(2, 4)) > 30)) {
						this.date2 = date2;
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
					+ date1.substring(4, 8));
		}
	} else {
		this.date2 = null;
	}
		return loaded;
	
}	
	
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDate1() {
		return date1;
	}

	public String getDate2() {
		return date2;
	}

	// SimpleDateFormat date1a = new SimpleDateFormat();

}
