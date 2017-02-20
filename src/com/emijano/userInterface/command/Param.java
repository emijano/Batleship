package com.emijano.userInterface.command;

public class Param {
	
	private String name;
	private String value;
	
	Param(String paramName, String paramValue) {
		name = paramName;
		value = paramValue;
	}
	
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	String getValue() {
		return value;
	}
	void setValue(String value) {
		this.value = value;
	}

}
