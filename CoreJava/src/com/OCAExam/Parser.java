package com.OCAExam;

public class Parser {
	
	public static void main(String[] args) {
		try {
			int i =0;
			i = Integer.parseInt(args[0]);
		} catch ( NumberFormatException e) {
			System.out.println("problem");
		}
	}

}
