package com.emijano;

import java.util.HashSet;

import com.emijano.userInterface.CmdDefinition;
import com.emijano.userInterface.CmdFormatException;
import com.emijano.userInterface.Command;
import com.emijano.userInterface.InputParser;

public class GameConfigurator {
	
	private boolean cfgFinished = false;

	//user interface
	private InputParser parser;
	//ship factory
	//battlefield factory
	
	GameConfigurator () {
		/* game with default settings */
		
		parser = new InputParser();
	}

	GameConfigurator (String userSettings) {
		/* game with user settings */
		this();
	}
	
	public void processCmd(String input) {
		
		Command cmd;
		
//		try {
//			cmd = parser.parse(input);
//			
//			if (cmd != null && cmd.getName() == "BSMGE")
//				cfgFinished = true;
//			
//		} catch (CmdFormatException e) {}
		
	}
	
	public boolean isCfgFinished() {
		return this.cfgFinished;
	}
	
}
