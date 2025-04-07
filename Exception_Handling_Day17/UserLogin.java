package Exception_Handling_Day17;

public class UserLogin {
	private int pin = 1234;
	private void login(int pin) throws InvalidPinException {
		if(this.pin==pin) {
			System.out.println("User Succesfully Logged in");
		}
		else {
			throw new InvalidPinException("The user pin is invalid");
		}
	}
	public static void main(String[] args) {
		System.out.println("main start");
		UserLogin user = new UserLogin();
//		user.login(1224);
		try {
			user.login(1224);
		}
		catch(InvalidPinException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("main end");
	}

}
