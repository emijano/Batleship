package com.emijano;

import com.emijano.userInterface.CmdException;
import com.emijano.userInterface.CmdHandler;
import com.emijano.userInterface.CommandParser;
import com.emijano.userInterface.InputReader;
import com.emijano.userInterface.command.Command;

public class GameConfigurator {
	
	private CmdHandler cmdHandler;
	private InputReader inReader;
	private CommandParser cmdParser;
	
	//user interface
	//ship factory
	//battlefield factory
	
	GameConfigurator(CmdHandler handler, InputReader reader, CommandParser parser) {
		cmdHandler = handler;
		cmdParser = parser;
		inReader = reader;
	}
	
	public void restart() {}
	
	public Object performConfig() {
		
		String inputText = inReader.readInputText();

		try {
			Command cmd = cmdParser.extractCommandFromInput(inputText);
			cmdHandler.executeCommand(cmd);
			if (cmd.getType() == Command.CMDTYPE_OBJECT)
				return cmdHandler.getCmdObject();
			
		} catch (CmdException e) {}
		
		return null;
	}
}
