package com.emijano;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import com.emijano.userInterface.CmdFormatException;
import com.emijano.userInterface.InputParser;

public class GameTest {

	 @Test
	 public void TestGameCfg() {
	
	 GameConfigurator cfg = new GameConfigurator();
	 cfg.processCmd("SHDEI");
	
	 Assert.assertEquals(false, cfg.isCfgFinished());
	
	 }

	@Test
	public void TestParser() throws CmdFormatException {

//		InputParser parser = new InputParser();
//		parser.defineCommands();
//		
//		parser.parse("SHDEI:X=1,Y=2;");
//
//		Assert.assertEquals("name=SHDEI", parser.parse("SHDEI;").toString());
//		Assert.assertEquals(null, parser.parse("SHDEI"));
//		Assert.assertEquals("name=SHDEI", parser.parse("SHDEI:X=1,Y=2;").toString());

	}

}
