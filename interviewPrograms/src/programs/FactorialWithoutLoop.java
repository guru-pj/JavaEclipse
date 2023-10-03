package programs;

public class FactorialWithoutLoop {
	static int ifCount = 0, elseCount = 0;

	public static int fact(int k) { // if this method is static no need to create object for this class
		if (k > 0) {
			// ifCount++;
			return k * fact(k - 1);
		} else {
			// elseCount++;
			return 1;
		}
	}

	public static void main(String[] args) {
		FactorialWithoutLoop f = new FactorialWithoutLoop();// no need if the method is static
		System.out.println(fact(5));
		// System.out.println("If Loop: " + ifCount);
		// System.out.println("Else Loop: " + elseCount);
		
	}
}
