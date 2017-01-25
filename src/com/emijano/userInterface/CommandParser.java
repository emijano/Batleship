package com.emijano.userInterface;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.emijano.userInterface.command.Command;

public class CommandParser {
	
	final static Pattern cmdPattern = Pattern.compile("(?<name>[A-Za-z]{5})(:?)(?<params>(([A-Za-z]+)=(\\w+)(,?))*);");
	final static Pattern paramPattern = Pattern.compile("(?<name>[A-Za-z]+)=(?<value>\\w+)(,?)(?<rest>.*)");

	private Matcher matcher;

	public Command extractCommandFromInput(String inputText) throws CmdException {

		String cmdName, cmdParams;

		matchCmdPattern(inputText);
		checkCmdFormat();
		cmdName = extractCmdName();
		cmdParams = extractCmdParams();
		return createCommand(cmdName, cmdParams);
	}

	private Command createCommand(String inputName, String inputParams) throws CmdException {
		
		Matcher m;
		String name, val;
		Command cmd = new Command(inputName);
		
		while (inputParams.length() > 0) {
			
			m = paramPattern.matcher(inputParams);
			
			if (m.matches()) {
				name = m.group("name");
				val = m.group("value");
				inputParams = m.group("rest");
				if (cmd.getParams().containsKey(name))
//					TODO: probably change params to class object; move exception to CmdHandler and add proper test
					throw new CmdException("PARAMETER ALREADY EXIST");
				cmd.addParam(name, val);
			}
		}
		
		return cmd;
	}
	
	private void matchCmdPattern(String input) {
		matcher = cmdPattern.matcher(input);
	}

	private void checkCmdFormat() throws CmdException {
		if (!matcher.matches())
			throw new CmdException("FORMAT ERROR");
	}

	private String extractCmdName() {
		return matcher.group("name");
	}

	private String extractCmdParams() {
		return matcher.group("params");
	}
}
