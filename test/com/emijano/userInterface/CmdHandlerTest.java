package com.emijano.userInterface;

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.emijano.userInterface.command.Command;

public class CmdHandlerTest {
	
	CmdException cmdE; 
	CmdHandler cmdH;
	
	public CmdHandlerTest() {
		cmdE = new CmdException(); 
		cmdH = new CmdHandler();
		cmdH.loadCommands();
	}
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Test
	public void positiveCmdDefinitions() throws CmdException {
		
		Command cmd1, cmd2;

		cmd1 = new Command("SHDEI");
		cmd1.addParam("X", "1");
		cmd1.addParam("Y", "2");
		
		cmd2 = new Command("BSGME");
		
		cmdH.executeCommand(cmd1);
		cmdH.executeCommand(cmd2);
	}
	
	@Test
	public void commandUnknown() throws CmdException {
		
		thrown.expect(CmdException.class);
		thrown.expectMessage("COMMAND UNKNOWN");

		cmdH.executeCommand(new Command("ABCDE"));
	}
	
	@Test
	public void parameterError_extraParam() throws CmdException {
		
		Command cmd = new Command("SHDEI");
		cmd.addParam("X", "1");
		cmd.addParam("Y", "2");
		cmd.addParam("Z", "3");
		
		thrown.expect(CmdException.class);
		thrown.expectMessage("PARAMETER ERROR");
		cmdH.executeCommand(cmd);
	}
	
	@Test
	public void parameterError_lackOfParam() throws CmdException {
		
		Command cmd = new Command("SHDEI");
		cmd.addParam("X", "1");
		
		thrown.expect(CmdException.class);
		thrown.expectMessage("PARAMETER ERROR");
		cmdH.executeCommand(cmd);
	}
	
	@Test
	public void parameterError_unknownParam() throws CmdException {
		
		Command cmd = new Command("SHDEI");
		cmd.addParam("X", "1");
		cmd.addParam("Z", "1");
		
		thrown.expect(CmdException.class);
		thrown.expectMessage("UNKNOWN PARAMETER");
		cmdH.executeCommand(cmd);
	}
}
