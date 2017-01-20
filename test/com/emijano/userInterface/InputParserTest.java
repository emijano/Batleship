package com.emijano.userInterface;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Assert;

public class InputParserTest {

	@Test
	public void parseCommandFormat()  {
		
		InputParser parser = new InputParser();
		
		parser.parseInput("ABCDE");
		Assert.assertFalse(parser.cmdParsed);
		Assert.assertEquals(null, parser.cmdName);
		Assert.assertEquals(null, parser.cmdParams);
		
		parser.parseInput("SHDEI:X=1,Y=2;");
		Assert.assertTrue(parser.cmdParsed);
		Assert.assertEquals("SHDEI", parser.cmdName);
		Assert.assertEquals("X=1,Y=2", parser.cmdParams);
		
		parser.parseInput("SHDEI;");
		Assert.assertTrue(parser.cmdParsed);
		Assert.assertEquals("SHDEI", parser.cmdName);
		Assert.assertEquals("", parser.cmdParams);
	
	}

}
