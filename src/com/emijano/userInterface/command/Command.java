package com.emijano.userInterface.command;

import java.util.HashMap;

public class Command {

	private String name;
	private HashMap<String, String> params;
	
	public Command(String name) {
		setName(name);
		params = new HashMap<>();
	}
	
	public void addParam(String paramName, String paramVal) {
		params.put(paramName, paramVal);
	}
	
	public String getName() {
		return name;
	}
	
	public HashMap<String, String> getParams() {
		return params;
	}

	void setName(String name) {
		this.name = name;
	}
	
}
