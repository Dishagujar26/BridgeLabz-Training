package com.bl.functionalinterface.staticmethodsinterface.passwordvalidator;

public interface PasswordStrengthValidator {

	public static boolean SecurityUtils(String password) {
	    
		// minimum 8 
		if(password.length() < 8) {
		     return  false;
		}
		// At least 1 upper-case/lower-case letter
		boolean isUp = false;
		for(char ch : password.toCharArray()) {
			if(Character.isUpperCase(ch)) {
				isUp = true;
				break;
			}
		}
		
		boolean isLow = false;
		for(char ch : password.toCharArray()) {
			if(Character.isLowerCase(ch)) {
				isLow = true;
				break;
			}
		}
		
		// To check contains → use .*pattern.* To check no spaces → .*\\s.*
		if(!isUp|| !isLow) return false;
		
		if(!password.matches(".*[@#$%!].*")) {
			return false;
		}
		if(password.matches(".*\\s.*")){
			return false;
		}
		
		return true;
	}
}
