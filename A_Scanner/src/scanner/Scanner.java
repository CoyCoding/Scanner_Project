package scanner;

import java.io.IOException;

//
//
//
// THIS MAIN METHOD CONSOLE PROTYPE
//
//
//
//

//import java.io.IOException;

import com.screens.Screens;

public class Scanner extends Screens {
	//Scanner Display is a Screen so it will extend it
	//uses the keys variable to index through screens.
	//each Screen is a method doing a task and returning key variable
	//should be objects.
	//could map more efficiently, will look into
	
	public static void main(String[] args) {
		while (true) {	
			logon();
			// Unfinished log on screen
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

			}
		}
	}
}
