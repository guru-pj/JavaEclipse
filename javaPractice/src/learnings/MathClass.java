package learnings;

public class MathClass {
	public static void main(String[] args) {
		int a = 5, b = 2;

		System.out.println(Math.addExact(a, b));
		System.out.println(Math.subtractExact(a, b));
		System.out.println(Math.multiplyExact(a, b));
		System.out.println(Math.floorDiv(a, b));
		System.out.println(Math.floorDiv(6, b));
		System.out.println(Math.max(a, b));
		System.out.println(Math.min(a, b));
		System.out.println(Math.sqrt(16));
		System.out.println(Math.sqrt(18));
		System.out.println(Math.pow(a, b));
		System.out.println(Math.abs(20.99));
	}
}
