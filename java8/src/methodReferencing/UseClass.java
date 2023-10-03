package methodReferencing;

public class UseClass {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 10, 5 };
		Functions f = new Functions();

		// Finding maximum = f::max;
		// Finding minimum = f::min;
		// System.out.println(maximum.find(a));
		// System.out.println(minimum.find(a));

		Finding maxim = f::maxi;
		Finding minim = f::mini;

		maxim.find(a);
		minim.find(a);

	}
}
