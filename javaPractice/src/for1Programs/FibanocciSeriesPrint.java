package for1Programs;

public class FibanocciSeriesPrint {
	public static void main(String[] args) {
		int a = 0, b = 1, c = 0, num = Integer.parseInt(args[0]);
		System.out.print("0,1");
		for (int i = 1; i <= num; i++) {
			c = a + b;
			System.out.print("," + c);
			a = b;
			b = c;
		}
	}
}
