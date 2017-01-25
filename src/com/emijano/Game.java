package com.emijano;

import com.emijano.userInterface.CmdException;
import com.emijano.userInterface.CmdHandler;
import com.emijano.userInterface.CommandParser;
import com.emijano.userInterface.InputReader;
import com.emijano.userInterface.command.Command;

public class Game {

	private CmdHandler cmdHandler;
	private InputReader reader;
	private CommandParser cmdParser;
	
	Game() {
		reader = new InputReader();
		cmdHandler = new CmdHandler();
		cmdParser = new CommandParser();
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
			
			String inputText = reader.readInputText();
			
			try {
				Command cmd = cmdParser.extractCommandFromInput(inputText);
				cmdHandler.executeCommand(cmd);
			} catch (CmdException e) {}
		}
	}

	void start() {
		/* start of the game */
	}

}
