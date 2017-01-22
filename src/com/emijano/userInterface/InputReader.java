package com.emijano.userInterface;

import java.util.Scanner;

public class InputReader {
	//TODO: define it as singleton
	private Scanner sc;
	
	public InputReader() {
		sc = new Scanner(System.in);
	}
	
	public char readInputChar() {
		return sc.next(".").charAt(0);
	}
	
	public String readInputText() {
		return sc.nextLine();
	}

}
