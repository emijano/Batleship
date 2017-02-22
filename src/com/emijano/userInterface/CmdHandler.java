package com.emijano.userInterface;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.emijano.ship.ShipFactory;
import com.emijano.userInterface.command.Command;

public class CmdHandler {
	
	private HashSet<CmdDefinition> commandSet;
	private ShipFactory shipFactory;
	private Object returnObj;

	public CmdHandler() {
		commandSet = new HashSet<>();
		shipFactory = new ShipFactory();
	}
	
	public Object getCmdObject() {
		return returnObj;
	}

	public void loadCommands() {
		this.defineCommands();
	}
	
	public void executeCommand(Command inputCmd) throws CmdException {
		
		returnObj = null;
		CmdDefinition cmdDef = returnCmdDefinitionIfDefined(inputCmd);
		inputCmd.setType(cmdDef.getType());
		checkCmdParameters(inputCmd, cmdDef);
		fwdCmdExecution(inputCmd);
	}

	private void defineCommands() {
		this.commandSet.add(new CmdDefinition("SHDEI", new String[] { "X", "Y" }, Command.CMDTYPE_OBJECT));
		this.commandSet.add(new CmdDefinition("BSGME", Command.CMDTYPE_ACTION));
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
		
//		HashSet<String> inputParams = inputCmd.getParamNames(); //TODO: choose version how to handle inputParams - getParamNames seems to be longer because it require to create new Set, while access to HashMap of params is directly
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
	
	private void fwdCmdExecution(Command cmd) {
		String cmdName = cmd.getName();
		switch(cmdName) {
		case "SHDEI":
			createShip(cmd);
			break;
		default:
			System.out.println("Error: Command " + cmdName + " is undefined!");
		}
	}
	
	private void createShip(Command cmd) {
		int x = getXCordFromCommand(cmd);
		int y = getYCordFromCommand(cmd);
		returnObj = shipFactory.createShip(x, y);
	}
	
	private int getXCordFromCommand(Command cmd) {
		return cmd.getParamValue("X").charAt(0) - 0x40;
	}
	
	private int getYCordFromCommand(Command cmd) {
		return Integer.valueOf(cmd.getParamValue("Y"));
	}

}
