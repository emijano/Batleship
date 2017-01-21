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
	 
	 
}
