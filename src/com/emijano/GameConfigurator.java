package com.emijano;

import java.util.HashSet;

import com.emijano.userInterface.CmdDefinition;
import com.emijano.userInterface.CmdException;
import com.emijano.userInterface.command.Command;

public class GameConfigurator {
	
	private boolean cfgFinished = false;

	//user interface
	//ship factory
	//battlefield factory
	
	GameConfigurator () {
		/* game with default settings */
		
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
