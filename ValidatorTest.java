import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ValidatorTest{
	
	@Test
	public void bestPasswordPassesAllTests(){
		Validator validator = new Validator();
		String bestPassword = "!@SNAppY12c";
		
		assertEquals(Validator.NUM_TESTS, validator.validate(bestPassword), "Best password must pass all tests");
	}
	
	@Test
	public void worstPasswordPassesNoTests(){
		Validator validator = new Validator();
		
		assertEquals(1, validator.validate("password"),
		 "'password' should only pass the >= 8 characters check");
		assertEquals(1, validator.validate("bad"),
		 "'bad' should only pass the not 'password' test");
	}
}
