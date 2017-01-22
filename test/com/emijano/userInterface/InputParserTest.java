package com.emijano.userInterface;

import static org.junit.Assert.*;

import org.junit.Test;

import com.emijano.userInterface.command.CommandParser;

import org.junit.Assert;

public class InputParserTest {

	@Test
	public void parseCommandFormat()  {
		
		CommandParser parser = new CommandParser();
		
		try {
			parser.parseCommand("ABCDE");
		} catch (CmdException e) {
			Assert.assertEquals("FORMAT ERROR", e.getError());
		}
		
		try {
			parser.parseCommand("SHDEI:X=1,Y=2,Z=3;");
		}
		catch (CmdException e) {}
		
		
	}
	

}
