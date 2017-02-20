package com.emijano;

import com.emijano.userInterface.InputReader;

public class Battleships {
	
	private static Game game;

	public static void main(String[] args) {
		startUserMenu();
	}
	
	private static void startUserMenu() {
		
		int action;
		
		while (true) {
			printMenu();
			action = getAction();
			performAction(action);
		}
	}
	
	private static void printMenu() {

		String menuText = "";
		menuText += "Choose action:\n";
		menuText += "1. New game\n";
		menuText += "q. Exit\n";
		
		System.out.println(menuText);
	}
	
	private static int getAction() {
		//TODO: better solution than creating class every time
		InputReader reader = new InputReader();
		return reader.readInputChar();
	}
	
	private static void performAction(int action) {

		switch (action) {
			case '1':
				startNewGame();
				break;
			case 'q':
				System.out.println("Goodbye!");
				System.exit(0);
				break;
			default:
				System.out.println("Chosen action undefined. Choose again!");
		}
	}
	
	private static void startNewGame() {
		
		game = new Game();
		game.prepare();
		game.configure();
		game.start();
		
	}

}