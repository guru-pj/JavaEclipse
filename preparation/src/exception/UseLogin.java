package exception;

public class UseLogin {
//	public void checkPassword(String password) throws PasswordException {
//		if (password.length() > 8) {
//			System.out.println("Successfully Password created:");
//		} else {
//			throw new PasswordException("Must contain more than 8 Characters");
//		}
//	}

	public static void main(String[] args) throws PasswordException {
		// creataing object
		Login l = new Login();

		try {
			l.checkPassword("nfndhh");
		} catch (PasswordException pe) {
			pe.printStackTrace();// overrided inbuilt printStackTrace() in exception
			System.out.println(pe);
		}
	}
}
