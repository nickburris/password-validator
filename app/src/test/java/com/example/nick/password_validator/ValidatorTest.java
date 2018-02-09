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
		
		assertEquals(1, validator.validate("password"));
		assertEquals(1, validator.validate("bad"));
	}
}
