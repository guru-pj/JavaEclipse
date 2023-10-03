package homeWorks;

public class IntToFloat {
	public static void main(String[] args) {
//		int i = 10;
//		float f = i;
//		System.out.println(f);
//
//		double d = (double) (i);
//		System.out.println(d);
//
//		int n = (int) (d);
//		System.out.println(n);
//		System.out.println(Math.max(100, 99));
		int sq = 49;
		double i = Math.sqrt(sq);
		System.out.println(i);
		if (i * i == sq) {
			System.out.println("it is a perfect square");
		} else {
			System.out.println("its not a perfect square");
		}

	}

}
