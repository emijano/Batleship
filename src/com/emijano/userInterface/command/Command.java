package com.emijano.userInterface.command;

import java.util.HashMap;
import java.util.HashSet;

public class Command {
	
	public static final int CMDTYPE_OBJECT = 0;
	public static final int CMDTYPE_ACTION = 1;

	private String name;
	private int type;
	private HashSet<Param> params;
	private HashMap<String, String> parameters;
	
	public Command(String name) {
		setName(name);
		params = new HashSet<>();
		parameters = new HashMap<>();
	}
	
	public void addParam(String paramName, String paramVal) {
		parameters.put(paramName, paramVal);
		params.add(new Param(paramName, paramVal));
	}
	
	public String getName() {
		return name;
	}
	
	public HashSet<String> getParamNames() {
		HashSet<String> paramNames = new HashSet<>();
		for (Param p : params)
			paramNames.add(p.getName());
		return paramNames;
	}
	
	public String getParamValue(String paramName) {
		return parameters.get(paramName);
	}
	
	public HashMap<String, String> getParams() {
		return parameters;
	}

	void setName(String name) {
		this.name = name;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}
	
}