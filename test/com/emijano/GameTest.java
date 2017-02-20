package com.emijano;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;

import org.junit.Assert;
import org.junit.Test;

public class GameTest {

	 @Test
	 public void TestGameCfg() {
		 
		 String data = "SHDEI:X=1,Y=2;";
		 System.setIn(new ByteArrayInputStream(data.getBytes()));
		 
		 Game g = new Game();
		 g.prepare();
		 g.configure();
		 
		 
		 
	 }
	
	 
}
