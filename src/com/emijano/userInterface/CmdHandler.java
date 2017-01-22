package com.emijano.userInterface;

import java.util.HashSet;
import java.util.regex.Pattern;

import com.emijano.userInterface.command.CommandParser;

public class CmdHandler {

	final static Pattern cmdPattern = Pattern.compile("(?<name>[A-Za-z]{5})(:?)(?<params>(([A-Za-z]+)=(\\w+)(,?))*);");
	final static Pattern paramPattern = Pattern.compile("(?<name>[A-Za-z]+)=(?<value>\\w+)(,?)(?<rest>.*)");

	private InputReader reader;
	private CommandParser parser;

	private HashSet<CmdDefinition> commandSet;
	
	public CmdHandler() {
		parser = new CommandParser();
		reader = new InputReader();
		commandSet = new HashSet<>();
	}
	
	public void loadCommands() {
		this.defineCommands();
	}
	
	public void readCommand() throws CmdException {
		String inputText = reader.readInputText();
		parser.parseInput(inputText);
	}
	
	public void executeCommand() throws CmdException {
		
	}
	
	private void defineCommands() {
		this.commandSet.add(new CmdDefinition("SHDEI", new String[] { "X", "Y" }));
		this.commandSet.add(new CmdDefinition("BSGME"));
	}

}
