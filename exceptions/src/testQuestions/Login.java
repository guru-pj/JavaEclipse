package testQuestions;

public class Login extends Exception {
	String userId;
	String password;

	public String getUserId() {
		return userId;
	}

	public String getPassword() {
		return password;
	}

	public Login(String u, String p) {
		userId = u;
		password = p;
	}

	public Login(String msg) {
		super(msg);
	}

}
