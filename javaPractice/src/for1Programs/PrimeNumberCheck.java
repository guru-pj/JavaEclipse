package for1Programs;

public class PrimeNumberCheck {
	public static void main(String[] args) {

		int n = 5;

		boolean b = true;

		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				b = false;
			}
		}
		if (b == true) {
			System.out.println("Prime Number");
		} else {
			System.out.println("Not a Prime Number");
		}
	}

}
