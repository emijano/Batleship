package com.emijano.ship;

import com.emijano.ship.Ship;

public class ShipFactory {
	
	public Ship createShip(int cordX, int cordY, int size) {
		checkShipLocation(cordX, cordY, size);
		return getShipInstance(cordX, cordY, size);
	}
	
	public Ship createShip(int cordX, int cordY) {
		return createShip(cordX, cordY, Ship.SHIP_SIZE_BATTLESHIP);
	}
	
	private Ship getShipInstance(int cordX, int cordY, int size) {
		switch (size) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case Ship.SHIP_SIZE_BATTLESHIP:
			return new Battleship(cordX, cordY);
		default:
			System.out.println("ERROR: Ship size unacceptable");	
		}
		
		return null;
	}
	
	private void checkShipLocation(int cordX, int cordY, int size) {
//		TODO: check if ship is placed on Battlefield and do not cover other ships
	}
}
