package com.emijano.ship;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class ShipFactoryTest {
	
	public ShipFactory factory;
	
	@Test 
	public void createShipsTest() {
		factory = new ShipFactory();
		
		assertEquals(factory.createShip(1, 2, 4).toString(), new Battleship(1, 2).toString());
		assertEquals(factory.createShip(1, 2, 3), null);
		
	}
}
