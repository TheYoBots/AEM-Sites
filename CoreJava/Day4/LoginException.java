package Day4;
// UnChecked are not-Mandatory      
// Checked Mandatory
public class LoginException extends RuntimeException // Exception
{
	public LoginException() {
		System.out.println("Please Enter Valid Credentials");
	}

	public LoginException(String message) {
		System.out.println(message);
	}
}