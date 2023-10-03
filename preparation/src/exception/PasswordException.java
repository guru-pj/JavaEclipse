package exception;

public class PasswordException extends Exception {
	public PasswordException(String msg) {
		super(msg);
	}

	@Override
	public void printStackTrace() {
		System.out.println("Exception Handled: printStackTrace Overridden");
	}
}
