package com.solucionfactible.dev;
/**
 * isValid allow 4 or 6 digit PIN codes and PIN codes cannot contain anything but exactly 4 digits or exactly 6 digits.
 * If the function is passed a valid PIN string, return true, else return false.
 * 
 * @author developer
 */
public class ValidatePIN {
	public static void main(String[] args) {
		ValidatePIN validate = new ValidatePIN();
		boolean b = validate.isValid("8888");
		System.out.println(b);
	}
	public static boolean isValid(String pin) {
		int len = pin.length();
		if (len == 4 || len ==6){
			return true;
		}
		return false;
	}
}