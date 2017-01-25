package com.emijano.userInterface;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.emijano.userInterface.command.Command;

public class CmdHandler {

	private HashSet<CmdDefinition> commandSet;

	public CmdHandler() {
		commandSet = new HashSet<>();
	}

	public void loadCommands() {
		this.defineCommands();
	}
	
	public void executeCommand(Command inputCmd) throws CmdException {
		
		CmdDefinition cmdDef = returnCmdDefinitionIfDefined(inputCmd);
		checkCmdParameters(inputCmd, cmdDef);
	}

	private void defineCommands() {
		this.commandSet.add(new CmdDefinition("SHDEI", new String[] { "X", "Y" }));
		this.commandSet.add(new CmdDefinition("BSGME"));
	}
	
	private CmdDefinition returnCmdDefinitionIfDefined(Command cmd) throws CmdException {
		String cmdName = cmd.getName();
		Iterator<CmdDefinition> i = commandSet.iterator();
		while (i.hasNext()) {
			CmdDefinition cDef = i.next();
			if (cDef.getName().equals(cmdName)) {
				return cDef;
			}
		}
		throw new CmdException("COMMAND UNKNOWN");
		
	}
	
	private void checkCmdParameters(Command inputCmd, CmdDefinition cmdDef) throws CmdException {
		
		Set<String> inputParams = inputCmd.getParams().keySet();
		HashSet<String> definedParams = cmdDef.getParams();
		Iterator<String> i = inputParams.iterator();

		if (inputParams.size() != definedParams.size())
			throw new CmdException("PARAMETER ERROR");
		
		while(i.hasNext()) {
			String inputPar = i.next();
			if (!definedParams.contains(inputPar))
				throw new CmdException("UNKNOWN PARAMETER");
		}
	}

}
