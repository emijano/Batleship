package com.emijano.userInterface.command;

import java.util.HashMap;
import java.util.regex.Pattern;

public class Command {

	private String name;
	private Param[] params;
	
	public Command(String name) {
		this.setName(name);
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}
	
}
