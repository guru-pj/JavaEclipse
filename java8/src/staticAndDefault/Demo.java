package staticAndDefault;

public interface Demo {
	public static String print() {
		return "Welcome";
	}

	public default String end() {
		return "ThankYou";
	}

	public void show();
}
