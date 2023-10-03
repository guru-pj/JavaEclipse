package array2D;

public class Example2DArray {
	public static void main(String[] args) {
		String[] s1 = args[0].split(",");
		String[] s2 = args[1].split(",");
		String[] s3 = args[2].split(",");

		int[] iA1 = new int[s1.length];
		int[] iA2 = new int[s2.length];
		int[] iA3 = new int[s3.length];

		for (int i = 0; i < iA1.length; i++) {
			iA1[i] = Integer.parseInt(s1[i]);
			iA2[i] = Integer.parseInt(s2[i]);
			iA3[i] = Integer.parseInt(s3[i]);
		}

		int sum = 1;
		int[][] iA = { iA1, iA2, iA3 };
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (iA[i] == iA[j]) {
					sum = sum * iA[i][i];
				}
			}
		}
		System.out.println(sum);
	}
}
