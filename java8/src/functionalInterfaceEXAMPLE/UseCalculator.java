package functionalInterfaceEXAMPLE;

public class UseCalculator {
	public static void main(String[] args) {
		Calculator add = (x, y) -> x + y;
		Calculator sub = (x, y) -> x - y;
		Calculator mul = (x, y) -> x * y;
		Calculator div = (x, y) -> x / y;

		System.out.println(add.math(1, 2));
		System.out.println(sub.math(1, 2));
		System.out.println(mul.math(1, 2));
		System.out.println(div.math(1, 2));

	}
}
