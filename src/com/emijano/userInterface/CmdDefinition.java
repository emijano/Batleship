package com.emijano.userInterface;

import java.util.HashSet;

public class CmdDefinition {

	private String name;
	private int type;
	private HashSet<String> params;

	CmdDefinition(String cmdName, int type) {

		this.name = cmdName;
		this.params = new HashSet<>();
		this.type = type;

		System.out.println("New command " + cmdName + " defined");
	}

	CmdDefinition(String cmdName, String[] paramTable, int type) {

		this(cmdName, type);
		String displPar = new String();

		for (String param : paramTable) {

			addParam(param);
			displPar += " " + param;

		}

		System.out.println(cmdName + " params are:" + displPar);

	}

	private void addParam(String paramName) {
		this.params.add(paramName);
	}
	
	public String getName() {
		return this.name;
	}

	public HashSet<String> getParams() {
		return this.params;
	}
	
	public int getType() {
		return this.type;
	}

}
