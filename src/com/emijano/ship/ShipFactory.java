package com.emijano.ship;

import com.emijano.ship.Ship;

public class ShipFactory {
	
	public Ship createShip(char letter, char number, int size) {
		switch (size) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case Ship.SHIP_SIZE_BATTLESHIP:
			return new Battleship(letter, number);
		default:
			System.out.println("ERROR: Ship size unacceptable");	
		}
		
		return null;
	}
	
	public Ship createShip(char letter, char number) {
		return createShip(letter, number, Ship.SHIP_SIZE_BATTLESHIP);
	}

	
}
