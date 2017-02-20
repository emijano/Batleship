package com.emijano;

import com.emijano.battlefield.Battlefield;
import com.emijano.userInterface.CmdException;
import com.emijano.userInterface.CmdHandler;
import com.emijano.userInterface.CommandParser;
import com.emijano.userInterface.InputReader;
import com.emijano.userInterface.command.Command;

public class Game {

	private CmdHandler cmdHandler;
	private InputReader reader;
	private CommandParser cmdParser;
	public Player player;
	private Battlefield battlefield;
	
	Game() {
		reader = new InputReader();
		cmdHandler = new CmdHandler();
		cmdParser = new CommandParser();
	}

	void prepare() {
		
		Configuration config = new Configuration();

		player = new Player(config);
		battlefield = new Battlefield(config);
		
		cmdHandler.loadCommands();
		
	}
	
	void configure() {
		
		//player.loadBattlefield()
		GameConfigurator gameCfg = new GameConfigurator(cmdHandler, reader, cmdParser);
		player.cofigureFleet(gameCfg);
		
	}

	void start() {
		/* start of the game */
	}

}
