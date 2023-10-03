package for1Programs;

public class SquareCheck {
	public static void main(String[] args) {
		int n = 9;
		String t = "Not Square";
		for (int i = n / 2; i < n / 2; i++) {
			if (n / i == i) {
				t = "Square";
			}
		}
		System.out.println(t);
	}
}
