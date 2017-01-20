package com.emijano.userInterface;

import java.util.HashMap;

public class Command {
	
	private String name;
	private HashMap<String, String> params;
	
	Command(String cmdName) {
		this.name = cmdName;
	}
	
	public String getName() {
		return this.name;
	}

	@Override
	public String toString() {
		return "name=" + this.getName();
//		return super.toString();
	}
}
