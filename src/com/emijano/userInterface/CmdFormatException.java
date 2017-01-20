package com.emijano.userInterface;

public class CmdFormatException extends Exception {
	
	public CmdFormatException() {}
	public CmdFormatException (String error) {
		System.out.println(error);
	}

}
