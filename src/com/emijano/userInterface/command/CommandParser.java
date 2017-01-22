package com.emijano.userInterface.command;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.emijano.userInterface.CmdException;
import com.emijano.userInterface.command.Command.*;

public class CommandParser {

	final static Pattern cmdPattern = Pattern.compile("(?<name>[A-Za-z]{5})(:?)(?<params>(([A-Za-z]+)=(\\w+)(,?))*);");
	final static Pattern paramPattern = Pattern.compile("(?<name>[A-Za-z]+)=(?<value>\\w+)(,?)(?<rest>.*)");
	
	private Matcher matcher;
	
	public void parseInput(String input) throws CmdException {
		
		matchCmdPattern(input);
		checkCmdFormat();
		
	}
	
	private void matchCmdPattern(String input) {
		this.matcher = cmdPattern.matcher(input);
	}

	private void checkCmdFormat() throws CmdException {
		if (!this.matcher.matches())
			throw new CmdException("FORMAT ERROR");
	}
	
	private Command parseCommand() {
		
		String cmdName = this.matcher.group("name");
		String cmdParams = this.matcher.group("params");
		
		Command cmd = new Command(cmdName);
		return cmd;
	}

	private void extractParams(String paramPart) {

		String name, val;
		
		while (paramPart.length() > 0) {
			
				Matcher m = paramPattern.matcher(paramPart);
				
				if (m.matches()) {
					name = m.group("name");
					val = m.group("value");
					paramPart= m.group("rest");
				}
		}
		
	}
	
	
//	public Command parse(String input) throws CmdFormatException {
//
//		Matcher m = cmdPattern.matcher(input);
//		CmdDefinition cDef;
//		Command cmd;
//		
//		System.out.println(m.group("params"));
//
//		checkCmdFormat(m);
//		cDef = checkCmdName(m.group("cmd"));
////		cmd = checkCmdParams(m.group("params"), cDef);
//
//		return new Command(m.group("cmd").toUpperCase());
//
//	}
//
//	private void checkCmdFormat(Matcher m) throws CmdFormatException {
//
//		if (!m.matches())
//			throw new CmdFormatException("FORMAT ERROR");
//
//	}

//	private CmdDefinition checkCmdName(String cmdName) throws CmdFormatException {
//
//		for (CmdDefinition cmdDef : commandSet) {
//			if (cmdDef.getName().equalsIgnoreCase(cmdName))
//				return cmdDef;
//		}
//
//		throw new CmdFormatException("COMMAND UNKNOWN");
//	}
//
//	private Command checkCmdParams(String inputParams, CmdDefinition def) {
//		
//		String pat = "";
//		
//		if (inputParams.length() > 0) 
//		
//
//		System.out.println(inputParams);
//
//		return new Command("");
//	}
	
}