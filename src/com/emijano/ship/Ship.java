package com.emijano.ship;

abstract public class Ship {
	
	public static final int SHIP_SIZE_BATTLESHIP = 4;
	public static final int SHIP_SIZE_CRUISER    = 3;
	public static final int SHIP_SIZE_DESTROYER  = 2;
	public static final int SHIP_SIZE_SUBMARINE  = 1;
	
	private int cordX;
	private int cordY;

	private Location loc;
	
	Ship(int cordX, int cordY) {
		
		this.cordX = cordX;
		this.cordY = cordY;
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getClass().getName() + cordX + cordY;
	}
	

}
