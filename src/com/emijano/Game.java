package com.emijano;

import com.emijano.userInterface.CmdException;
import com.emijano.userInterface.CmdHandler;

public class Game {

	private CmdHandler cmdHandler;
	
	
	Game() {
		cmdHandler = new CmdHandler();
	}

	void prepare() {

		/* prepare the game */
		cmdHandler.loadCommands();
//		TODO: load command definitions
//		TODO: load configuration parameters
		
	}
	
	void configure() {
		
		boolean configFinished = false;


		while(!configFinished) {
			
			try {
				cmdHandler.readCommand();
				cmdHandler.executeCommand();
			} catch (CmdException e) {}
		}
	}

	void start() {
		/* start of the game */
	}

}
