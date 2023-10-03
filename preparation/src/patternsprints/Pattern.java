package patternsprints;

public class Pattern {
	public static void main(String[] args) {
		int n = 8;

		for (int h = 1; h <= n; h++) {
			for (int i = 1; i <= n; i++) {
				if (h >= i)
					System.out.print(i);
				else
					System.out.print(" ");

			}
			System.out.println();
		}
	}
}
