package Exception_Handling_Day17;

public class InvalidPinException extends Exception {
	String message;
	public InvalidPinException(String message) {
		this.message = message;
	}
	public String getMessage() {
		return message;
	}

}
