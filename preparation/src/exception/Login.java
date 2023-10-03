package exception;

public class Login {
	public void checkPassword(String password) throws PasswordException {
		if (password.length() > 8) {
			System.out.println("Successfully Password created:");
		} else {
			throw new PasswordException("Must contain more than 8 Characters");
		}
	}
}
