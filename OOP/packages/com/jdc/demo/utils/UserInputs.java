package com.jdc.demo.utils;

import java.util.Scanner;

public class UserInputs {

	private static Scanner scanner;

	static {
		scanner = new Scanner(System.in);
	}

	public static String readString(String message) {
		System.out.printf("%-14s : ", message);
		return scanner.nextLine();
	}

	public static int readInt(String message) {
		var string = readString(message);
		return Integer.parseInt(string);	
	}
}