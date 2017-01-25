package com.emijano.userInterface.command;

public class Param {
	
	private String name;
	private String value;
	
	Param(String pName, String pValue) {
		name = pName;
		value = pValue;
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
