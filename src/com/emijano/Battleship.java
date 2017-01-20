package com.emijano;

public class Battleship {
	
	private static Game game;

	public static void main(String[] args) {
		
		game = new Game();
		game.prepare();
		game.configure();
		game.start();
		
	}

}
