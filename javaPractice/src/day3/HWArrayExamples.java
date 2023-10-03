package day3;

public class HWArrayExamples {
	public static void main(String[] args) {

		// create array of all datatypes

		int[] i = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };// no limit for values storing inside the array
		float[] f = { 1.1f, 2.2f, 3.3f, 4, 4f, 5.5f };
		long[] l = { 9944726265l, 89453689476l, 7456428658472l };
		double[] d = { 22.1234d, 23.23232d, 34.3122342d };
		char[] c = { 'g', 'u', 'r', 'u' };
		boolean[] b = { true, false, true, true, false, false };

		String[] s = { "i ", "am ", "an ", "idiot " };

		System.out.println(i[8]);
		System.out.println(i.length);

		System.out.println(f[2]);
		System.out.println(f.length);

		System.out.println(l[2]);
		System.out.println(l.length);

		System.out.println(d[1]);
		System.out.println(d.length);

		System.out.println(c[3]);
		System.out.println(c.length);

		System.out.println(b[5]);
		System.out.println(b.length);

		System.out.println(s[3]);
		System.out.println(s.length);

	}
}
