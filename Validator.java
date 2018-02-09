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
		
		return passes;
	}
}
