package numberSerisPrograms;

public class IntPrintfromArray {
	public static void main(String[] args) {
		int[] iA = { 3, 4, 5, 6, 7, 8, 9 };
		//
		long start1 = System.currentTimeMillis();
		int res = 0, t = 1, m = 1;
		for (int i = iA.length - 1; i >= 0; i--) {
			t = iA[i] * m;
			res = res + t;

			m = m * 10;
		}
		System.out.println(res);
		long end1 = System.currentTimeMillis();

		int total = 0;
		long start2 = System.currentTimeMillis();
		for (int i = 0; i < iA.length; i++) {
			total = (total * 10) + iA[i];
		}
		System.out.println(total);
		long end2 = System.currentTimeMillis();

		long t1 = end1 - start1;
		long t2 = end2 - start2;

		System.out.println(t1);
		System.out.println(t2);
	}
}
