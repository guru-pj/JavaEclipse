package array2D;

import java.util.Arrays;

public class ScalarProductOfItself2DArray {
	public static void main(String[] args) {
		String[] s1 = args[0].split(",");
		String[] s2 = args[1].split(",");
		String[] s3 = args[2].split(",");
		int[][] iA = new int[args.length][s1.length];
		int[][] iAnew = new int[args.length][s1.length];

		for (int i = 0; i < s1.length; i++) {
			iA[0][i] = Integer.parseInt(s1[i]);
			iA[1][i] = Integer.parseInt(s2[i]);
			iA[2][i] = Integer.parseInt(s3[i]);
		}

		System.out.println(Arrays.deepToString(iA));
		System.out.println(iA.length);

//		Printing Array using For()
		System.out.println("The Array print using for() is:");
		for (int i = 0; i < iA.length; i++) {
			for (int j = 0; j < iA.length; j++) {
				System.out.print(iA[i][j] + "    ");
			}
			System.out.println();
		}
//		Scalar Product of 2 same Arrays 
		System.out.println("The Scalar Product of 2 same Arrays is:");

		for (int i = 0; i < iA.length; i++) {
			for (int j = 0; j < iA.length; j++) {
				int sum = 0;
				for (int k = 0; k < iA.length; k++) {
					iAnew[i][j] = iA[i][k] * iA[k][j];
					sum = sum + iAnew[i][j];
					iAnew[i][j] = sum;
				}
			}
		}
//		
		for (int i = 0; i < iAnew.length; i++) {
			for (int j = 0; j < iAnew.length; j++) {
				System.out.print(iAnew[i][j] + "    ");
			}
			System.out.println();
		}
	}
}
