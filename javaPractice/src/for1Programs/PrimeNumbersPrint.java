package for1Programs;

public class PrimeNumbersPrint {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		for (int i = 3; i < n; i++) {
			int k = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					k = 1;
				}
			}
			if (k == 0) {
				System.out.print(i + ",");
			}
		}

	}
}
