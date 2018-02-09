package com.example.nick.password_validator;

public class Validator{
	public static int NUM_TESTS = 2;
	
	public int validate(String password){
		int passes = 0;
		
		// Check password is not equal to "password"
		if(!password.toLowerCase().equals("password")){
			passes++;
		}
		
		// Check password is at least 8 characters long
		if(password.length() >= 8){
			passes++;
		}
		
		// Check if there are upper and lower case letters
		if(!password.toLowerCase().equals(password) && !password.toUpperCase().equals(password)){
			passes++;
		}
		
		// Check if the password contains a digit
		for(char c : password.toCharArray()){
			if(c >= '0' && c <= '9'){
				passes++;
				break;
			}
		}
		
		// Check if the password contains a special characters
		for(char c : password.toCharArray()){
			if(c < '0' || (c > '9' && c < 'A') || (c > 'Z' && c < 'a') || c > 'z'){
				passes++;
				break;
			}
		}
		
		// Make sure password is not all the same character
		char f = password.charAt(0);
		for(char c : password.toCharArray()){
			if(f != c){
				passes++;
				break;
			}
		}
		
		return passes;
	}
}
