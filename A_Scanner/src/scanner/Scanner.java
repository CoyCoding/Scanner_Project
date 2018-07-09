package scanner;

//
//
//
// THIS MAIN METHOD CONSOLE PROTYPE
// AFTER COMPLETION CHANGE INTO A MOBLE APP FOR PRACTICE
// AFTER COMPLETION CREATE MY SQL SERVER FOR PRACTICE
//
//
//
import java.io.IOException;

import com.screens.Screens;

public class Scanner extends Screens {
//Change other classes to interfaces. follow has-a structure instead of extending.
	
	public static void main(String[] args) {
		while (true) {
			
			logon();
			// Unfinished log on screen
			//eventually add thread to auto log out on timer
			screen0();
			//
			// Screen0 displays the first screen.
			// screen0 sets the key value for directing screens.
			// key is pretty much a numeric representation of what screen to display.
			//
			while (key != "Z") {
				try {
					loadScreenKey(key);
				} catch (IOException e) {
					System.out.println("Fatal Error ... logging off");
					//
					// the methods from screens should protect
					// this ioexception from ever happening.
					//
				}
				// testing methods
				//
				// loadDoorScreen2C6A();
				// loadLpns();
				// loadDoorDateScreen();
				//
				// testing methods
			}

		}
	}
}
