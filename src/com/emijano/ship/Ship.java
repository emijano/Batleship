package com.emijano.ship;

abstract public class Ship {
	
	public static final int SHIP_SIZE_BATTLESHIP = 4;
	public static final int SHIP_SIZE_CRUISER    = 3;
	public static final int SHIP_SIZE_DESTROYER  = 2;
	public static final int SHIP_SIZE_SUBMARINE  = 1;
	
	private char cordX;
	private char cordY;

	private Location loc;
	
	Ship(char letter, char number) {
		
		cordX = letter;
		cordY = number;
		loc = new Location(letter, number);
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getClass().getName() + cordX + cordY;
	}
	

}
