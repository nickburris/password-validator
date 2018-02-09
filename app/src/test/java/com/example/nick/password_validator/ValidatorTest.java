package com.example.nick.password_validator;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValidatorTest{
	
	@Test
	public void bestPasswordPassesAllTests(){
		Validator validator = new Validator();
		String bestPassword = "!@SNAppY12c";
		
		assertEquals(Validator.NUM_TESTS, validator.validate(bestPassword));
	}
	
	@Test
	public void worstPasswordPassesNoTests(){
		Validator validator = new Validator();

		// Bad password 'password' should pass the length test and not all the same letter
		assertEquals(2, validator.validate("password"));
		// Bad password 'bad' should pass the not 'password' test and not all the same letter
		assertEquals(2, validator.validate("bad"));
	}
}
