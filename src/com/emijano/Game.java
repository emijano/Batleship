package com.emijano;

import java.util.Scanner;

import com.emijano.userInterface.InputParser;

public class Game {

	private GameConfigurator configurator;
	private Scanner sc;
	private InputParser parser;

	void prepare() {

		/* prepare the game */
		parser = new InputParser();
//		parser.defineCommands();
		
	}
	
	void configure() {
		
		configurator = new GameConfigurator();
		sc = new Scanner(System.in);
				
		while(!configurator.isCfgFinished()) {
			
			System.out.println("Execute command:");
			configurator.processCmd(getUserInput());
		}
	}

	void start() {
		/* start of the game */
	}

	String getUserInput() {
		return sc.nextLine();
	}

}
