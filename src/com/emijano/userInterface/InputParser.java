package com.emijano.userInterface;

import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputParser {

	final static Pattern cmdPattern = Pattern.compile("(?<cmd>[A-Za-z]{5})(:?)(?<params>(([A-Za-z]+)=(\\w+)(,?))*);");

//TODO: reivestigate where cmd definiton should be done
	
//	private HashSet<CmdDefinition> commandSet;
//
//	public void defineCommands() {
//
//		commandSet = new HashSet<>();
//
//		commandSet.add(new CmdDefinition("SHDEI", new String[] { "X", "Y" }));
//		commandSet.add(new CmdDefinition("BSGME"));
//	}
	
	public boolean cmdParsed;
	public String cmdName;
	public String cmdParams;
	
	public void parseInput(String input) {
		
		Matcher m = cmdPattern.matcher(input);
		
		clearParseResult();
		
		try {
			m.matches();
			setCmdName(m.group("cmd"));
			setCmdParams(m.group("params"));
			this.cmdParsed = true;
			System.out.println("GO!");
		} 
		catch (Exception e) {System.out.println("exception");}
		
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
	
	private void setCmdName(String name) {
		this.cmdName = name;
	}
	
	private void setCmdParams(String params) {
		this.cmdParams = params;
	}
	
	private void clearParseResult() {
		this.cmdParsed = false;
		this.cmdName = null;
		this.cmdParams = null;
	}
}