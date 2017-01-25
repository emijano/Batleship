package com.emijano.userInterface;

public class CmdException extends Exception {
	
	private String error;
	
	public CmdException() {}
	public CmdException (String error) {
		setError(error);
	}
	
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	
	@Override
	public String getMessage() {
		return getError();
	}
}
