package com.emijano;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;


import org.junit.Test;

import com.emijano.ship.Battleship;
import com.emijano.ship.Ship;
import com.emijano.userInterface.CmdHandler;
import com.emijano.userInterface.CommandParser;
import com.emijano.userInterface.InputReader;

public class GameConfiguratorTest {
	
	 @Test
	 public void performConfig() {
		 
		 String data = "SHDEI:X=A,Y=2;";
		 System.setIn(new ByteArrayInputStream(data.getBytes()));
		 
		 CmdHandler cmdH = new CmdHandler();
		 cmdH.loadCommands();
		 
		 GameConfigurator configurator = new GameConfigurator(cmdH, new InputReader(), new CommandParser());
		 
		 Object o = configurator.performConfig();
		 assertEquals(o.toString(), new Battleship('A', '2').toString());
	 }

}
