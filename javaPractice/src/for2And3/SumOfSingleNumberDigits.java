package for2And3;

public class SumOfSingleNumberDigits {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]), r = 0, sum = 0;
		for (; n > 0;) {
			r = n % 10;
			sum = r + sum;
			n = n / 10;

		}
		System.out.println(sum);
	}
}
