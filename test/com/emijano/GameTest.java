package com.emijano;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import com.emijano.userInterface.CmdException;
import com.emijano.userInterface.command.CommandParser;

public class GameTest {

	 @Test
	 public void TestGameCfg() {
	
		 GameConfigurator cfg = new GameConfigurator();
		 cfg.processCmd("SHDEI");
	
		 Assert.assertEquals(false, cfg.isCfgFinished());
	 }
	 
	 
}
