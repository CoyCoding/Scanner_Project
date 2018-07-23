package com.screens;

public class Lpnbuild {
	
	private String lpn;
	private Boolean loaded; 
	private String department;
	private String location;
	private int date;
	
	//constructor
	public Lpnbuild() {
		super();
	}
	
	public Lpnbuild(String lpn, String loaded, String department, String location, String date)  {
		this.lpn = lpn;
		if (loaded.equalsIgnoreCase("true")) {
			//not the best way to deal with this but it works.
		this.loaded = true;}else {
		this.loaded = false;
		}
		this.department = department;
		this.location = location;
		try {
			this.date = Integer.parseInt(date);
			}catch(NumberFormatException e) {
				System.out.println(lpn + loaded + department + location + date);
				System.out.println("String made it to the date LPN");	}
	}
	
	public String getLpn() {
		return lpn;
	}
	
	public Boolean getLoaded() {
		return loaded;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public String getLocation() {
		return location;
	}
	public int getDate() {
		return date;
	}
	public String allData() {
		String i;
		i = lpn + ", " + loaded + ", " + department + ", " + location + ", " + date + ", ";
		return i;	
	}

	public String replaceData() {
		this.setLoaded(true);
		return this.allData();
		
	}
	
	public void setLpn(String Lpn) {
		this.lpn = Lpn;
	}
	
	public void setLoaded(boolean loaded) {
		this.loaded = loaded;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public void setDate(int date) {
		this.date = date;
	}
	
}
