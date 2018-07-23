package com.screens;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//
//
// THESE METHODS ARE USED BUT NOT PACKAGED CORRECTLY YET
//
//

public class ScreenMethods{
	

	public static List<String> checkDockDoors(){
	List<String> dockDoorList = new ArrayList<>();
		//Temp dock door array until I make dook doors objects such as lpns
	dockDoorList.add("DLT ERD");
	dockDoorList.add("DLT WRD");
	dockDoorList.add("DLT SRD");
	dockDoorList.add("DLT NRD");
	System.out.println(dockDoorList.size());
	return dockDoorList;
	
	}
		
	public static List<Lpnbuild> loadLpns() throws FileNotFoundException {
		List<Lpnbuild> lpnlist = new ArrayList<>();
		InputStream lpnFile = com.screens.ScreenMethods.class.getResourceAsStream("lpn.txt");
		Scanner lpnScanner = new Scanner(lpnFile);
		
		lpnScanner.useDelimiter(", ");
		//delimiter for , and " " 
			
		while(lpnScanner.hasNext()) {
			int i = 0;
				
			lpnlist.add(i, new Lpnbuild(lpnScanner.next(),  lpnScanner.next(), lpnScanner.next(), lpnScanner.next(), lpnScanner.next()));
			// use constructor with input from file (fake data base) to build lpn list could be for loop?
			i++;
		}
		System.out.print("file found \n");		
		lpnScanner.close();
		//close input stream
			
		return lpnlist;
			
	}
		
	public static void loadScreenKey(String key) throws IOException  {
		switch (key) {
		case "2C6A":
			Screens.loadDoorScreen2C6A();
			break;
		case "2C6" :
			Screens.screen2C6();
			break;
		case "2C":
			Screens.screen2C();
			break;
		case "2":
			Screens.screen2();
			break;
		}
			
	}
		
	public static void updateLpns(List<Lpnbuild> Lpnbuild) throws IOException {
		// NEEDS WORK IN THE FUTURE newData String will eventually be too big.
		
		String newData = "";
		int i = Lpnbuild.size()-1;
		while (!(i == -1))   {
			if (i != 0) {
				
			////System.out.println(Lpnbuild.get(i).allData());
			////prints all data for each element
				
			newData += Lpnbuild.get(i).allData();
			//puts Sting data in to String for "database"
			
			--i;
			} else {
				newData += Lpnbuild.get(i).allData().substring(0, Lpnbuild.get(i).allData().length()-2);
				--i;
				//Puts all lpn data in one string.
				
				
				////System.out.println(Lpnbuild.get(i).allData().substring(0, Lpnbuild.get(i).allData().length()-2));
				////test code to make sure load was working
			}
		}
		
		System.out.println(newData);
        FileWriter writer = new FileWriter("bin\\com\\screens\\lpn.txt");
        writer.write(newData);
        //prints newData and updates the "database" with newData.

        writer.close();	
        
	}
	
}
