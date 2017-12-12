package com;

public class Calculator {
	private String error = new String("Invalid Inputs");
	
	public String sum(int a, int b) {
		try {
			return String.valueOf(a+b);
		}
		catch (NumberFormatException nfe) {
			return String.valueOf(error);
		}
		catch (Exception e) {
			return String.valueOf(error);
		}
	}
	
	public String product(int a, int b) {
		try {
			return String.valueOf(a*b);
		}
		catch (NumberFormatException nfe) {
			return String.valueOf(error);
		}
		catch (Exception e) {
			return String.valueOf(error);
		}
	}
}
