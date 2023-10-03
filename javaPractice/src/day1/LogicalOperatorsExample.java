package day1;

public class LogicalOperatorsExample {
	public static void main(String[] args) {
		int a, b;
		a = 10;
		b = 9;

		boolean r1 = (a >= b) && (a < b);
		System.out.println(r1);

		boolean r2 = (a >= b) || (a < b);
		System.out.println(r2);

		boolean r3;
		System.out.println(r3 = (a >= b) || (a < b));

	}

}
