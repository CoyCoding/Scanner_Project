package com.screens;

import java.util.List;
import java.util.Scanner;

import com.location.DockDoor;

//import java.io.IOException;
import java.io.IOException;

public class Screens extends ScreenMethods {
	// all screens should be in a set as all keys and screens are unique.
	
	protected static String key;
	//this will eventually just be the key->door <Set>
	protected static Scanner input = new Scanner(System.in);
	private static boolean correctSelection;
	//This isn't needed but it's own problem to solve 
	//Event handling will remove this as event.onKeyPress would be the "correctSelection" 
	//but the logic is what im working on right now
	
	
	
	
	
	//
	// Key is used for a constant input for Scanner input;
	// Boolean is used to escape recursion and many other places;
	//
	public static void logon() {
		//
		// Log on checks user name and password for access
		// Eventually will use the same load structure as lpn/dock door
		//

		String user, pass;
		// user name and password string.

		do {
			System.out.print("enter your user name: ");
			// print message for username

			user = input.nextLine();
			// take in next input for username

			System.out.print("Password:  ");
			// print message for password

			pass = input.nextLine();
			// take in next input for pass

		} while (!user.equals("matt") || !pass.equals("1"));
		// only correct input is matt and 1
		// eventually will use a database to pull and check.

		System.out.println(" \n welcome \n ");
		user = null;
		pass = null;
		// sets pass and user to null for possible leak purposes

	}

	public static String screen0() {
		System.out.println("1.) Receviver");
		// key will be 1
		System.out.println("2.) Ship");
		// key will be 2
		System.out.println("3.) Pick");
		// key will be 3

		boolean correctSelection = false;
		String tempKey = null;

		// I use nextLine instead of int temporally until I write the try{catch{for
		// inputexceptionerror

		while (!correctSelection) {
			tempKey = input.nextLine();
			switch (tempKey) {
			case "1":
				tempKey = "0";
				correctSelection = true;
				break;
			case "2":
				tempKey = "2";
				correctSelection = true;
				break;
			case "3":
				tempKey = "0";
				correctSelection = true;
				break;
			}
		}
		return tempKey;

	}

	public static String screen2() {

		// ****************
		// yes this should be its own class for screens
		// *****************
		System.out.println("1.) In");
		// 2A
		System.out.println("2.) Out");
		// 2B
		System.out.println("3.) Ware");
		// 2C
		System.out.println("4.) Manufacturing");
		// 2D
		System.out.println("5.) Task");
		// 2E
		System.out.println("6.) Inquiry");
		// 2F
		System.out.println("7.) Others");
		// 2G
		System.out.println("8.) Change Responsibility");
		// 2H
		System.out.println("9.) Ware");
		// 2I
		System.out.println("0.) Logout");
		// 2J

		correctSelection = false;
		key = null;

		while (!correctSelection) {
			key = input.nextLine();
			switch (key) {
			case "1":
				System.out.println("I havent programed this inbound screen");
				key = "2";
				// eventually would be different to be the key for the new menu door.
				correctSelection = true;
				break;
			case "2":
				System.out.println("I havent programed this outbound screen");
				key = "2";
				correctSelection = true;
				break;
			case "3":
				System.out.println("/n WAREHOUSE SCREEN /n");
				key = "2C";
				correctSelection = true;
				break;
			case "4":
				System.out.println("I havent programed this manufacturing screen");
				key = "2";
				correctSelection = true;
				break;
			case "5":
				System.out.println("I havent programed this task screen");
				key = "2";
				correctSelection = true;
				break;
			case "6":
				System.out.println("I havent programed this inquiry screen");
				key = "2";
				correctSelection = true;
				break;
			case "7":
				System.out.println("I havent programed this others screen");
				key = "2";
				correctSelection = true;
				break;
			case "8":
				System.out.println("I havent programed the change responsibility screen");
				key = "2";
				correctSelection = true;
				break;
			case "9":
				System.out.println("I havent programed this screen");
				key = "2";
				correctSelection = true;
				break;
			case "0":
				System.out.println("Logging Off: .... \n \n \n");
				key = "Z";
				correctSelection = true;
				break;
			}
		}
		return key;

	}

	public static String screen2C() {
		// better names later

		System.out.println("1.) I cant remember what goes here");
		// 2C1
		System.out.println("2.) I cant remember what goes here");
		// 2C2
		System.out.println("3.) I cant remember what goes here");
		// 2C3
		System.out.println("4.) I cant remember what goes here");
		// 2C4
		System.out.println("5.) I cant remember what goes here");
		// 2C5
		System.out.println("6.) Direct Ship");
		// 2C6
		System.out.println("0.) Logout");
		// Z

		correctSelection = false;
		key = null;

		while (!correctSelection) {
			key = input.nextLine();
			switch (key) {
			case "1":
				System.out.println("I havent programed this screen");
				key = "2B";
				// eventually would be different to be the key for the new menu door.
				correctSelection = true;
				break;
			case "2":
				System.out.println("I havent programed this screen");
				key = "2B";
				correctSelection = true;
				break;
			case "3":
				System.out.println("I havent programed this screen");
				key = "2B";
				correctSelection = true;
				break;
			case "4":
				System.out.println("I havent programed this screen");
				key = "2B";
				correctSelection = true;
				break;
			case "5":
				System.out.println("I havent programed this screen");
				key = "2B";
				correctSelection = true;
				break;
			case "6":
				System.out.println("/n DIRECT SHIP /n");
				key = "2C6";
				correctSelection = true;
				break;
			case "0":
				System.out.println("Logging Off: .... \n \n \n");
				key = "Z";
				correctSelection = true;
				break;
			default:
				System.out.println("Incorrect input");
			}
		}
		return key;
	}

	public static void screen2C6() {
		// better names later

		System.out.println("1.) Load Door");
		// 2C6A
		System.out.println("2.) Unload Door");
		// 2C6B
		System.out.println("3.) I cant remember what goes here");
		// 2C6C
		System.out.println("0.) Logout");
		// Z

		correctSelection = false;
		key = null;

		while (!correctSelection) {
			key = input.nextLine();
			switch (key) {
			case "1":
				System.out.println("/n LOAD DOOR SCREEN /n");
				key = "2C6A";
				// eventually would be different to be the key for the new menu door.
				correctSelection = true;
				break;
			case "2":
				System.out.println("I havent programed this screen");
				key = "2C6";
				correctSelection = true;
				break;
			case "3":
				System.out.println("I havent programed this screen");
				key = "2C6";
				correctSelection = true;
				break;
			case "0":
				System.out.println("Logging Off: .... \n \n \n");
				key = "Z";
				correctSelection = true;
				break;
			}
		}
	}

	public static void loadDoorScreen2C6A() throws IOException {
		// Screen for loading lpns to doors KEY = 2C6A
		//FROM 2C6
		correctSelection = false;
		String dockDoor;
		System.out.print("dock door entry \n");
		dockDoor = input.nextLine();

		if (dockDoor.equals("back")) {
			key = "2C6";
			correctSelection = true;
		}
		while (correctSelection == false) {

			//System.out.println(dockDoor);
			
			if (dockDoor.equals("show all")) {
				System.out.print("1.)DLT ERD \n2.)DLT WRD \n3.)" + "DLT SRD \n4.)DLT NRD \n0.)Go Back \n");

				while (correctSelection == false) {

					int i = input.nextInt();
					input.nextLine();

					System.out.println(i);
					switch (i) {
					case 1:
						dockDoor = "DLT ERD";
						correctSelection = true;
						break;
					case 2:
						dockDoor = "DLT WRD";
						correctSelection = true;
						break;
					case 3:
						dockDoor = "DLT SRD";
						correctSelection = true;
						break;
					case 4:
						dockDoor = "DLT NRD";
						correctSelection = true;
						break;
					case 0:
						loadDoorScreen2C6A();
						break;
					}

					System.out.println(correctSelection);

				}

			}

			if (!checkDockDoors().contains(dockDoor)) {
				System.out.print("incorrect dock door \n");
				correctSelection = false;
				loadDoorScreen2C6A();
			}

			List<Lpnbuild> lpnlist;
			lpnlist = loadLpns();
			while (true) {
				System.out.print("lpn entry \n");

				String lpn = input.nextLine();
				/// input.next();
				correctSelection = false;
				// reuse doorChosen for loop exit.

				if (!lpn.equals("back")) {
					while (!correctSelection) {

						for (int i = 0; i < lpnlist.size(); i++) {
							// loads lpns from list
							// could be for loop (::)
							if (lpn.equals(lpnlist.get(i).getLpn())) {
								if ((lpnlist.get(i).getLoaded() == false)) {
									lpnlist.get(i).setLoaded(true);
									updateLpns(lpnlist);

									System.out.println(lpn + " loaded to Dock Door " + dockDoor);
									correctSelection = true;
									i = lpnlist.size();

								} else {
									System.out.println("LPN not found");
									correctSelection = true;
									i = lpnlist.size();
								}
							}

							if (correctSelection == false && i == lpnlist.size() - 1) {
								System.out.println("LPN not found");
								correctSelection = true;
								break;

							}

						}
					}
				} else {
					loadDoorScreen2C6A();
					break;
				}
			}

		}

	}

	public static void loadDoorDateScreen2C6D() {
		// Key = 2C6D
		// IN CONSTRUCTION
		// IN CONSTRUCTION
		//
		correctSelection = false;
		// always set correct Selection to false on screen change.
		// normally this could just be done with a actionkey when I GUI
		// could just all around find a work around for this

		DockDoor test = new DockDoor();
		// empty object for testing methods on this screen;
		do {
			System.out.println("Select MM/DD/YYYY");
			key = input.nextLine();
			// take input for key -> setDate1 Method
		} while (test.setDate1(key));
		// set date returns true if date isn't correct
		// false-> loops to for new date.
		// true->input next date

		key = input.nextLine();
		test.setDate2(key);
		// take input for key-> setDate2 Method
		// key 2 can be empty.

	}
}

/*
 * end of program space
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
