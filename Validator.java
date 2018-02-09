public class Validator{
	public int validate(String password){
		int passes = 0;
		
		if(!password.equals("password")){
			passes++;
		}
		
		if(password.length() >= 8){
			passes++;
		}
	}
}