package array2D;

public class ProductOfDiagonalElements {
	public static void main(String[] args) {
		String[] s1 = args[0].split(",");
		String[] s2 = args[1].split(",");
		String[] s3 = args[2].split(",");
		int[][] iA = new int[args.length][s1.length];
//		parsing Array
		for (int i = 0; i < s1.length; i++) {
			iA[0][i] = Integer.parseInt(s1[i]);
			iA[1][i] = Integer.parseInt(s2[i]);
			iA[2][i] = Integer.parseInt(s3[i]);
		}
//		Finding Product Of Diagonal elements		
		int sum = 1;
		for (int i = 0; i < args.length; i++) {
			for (int j = 0; j < s1.length; j++) {
				if (i == j) {
					sum = sum * iA[i][j];
				}
			}
		}
		System.out.println("Product of Diagonal Array Elements is :");
		System.out.println(sum);

//		Printing Array using For()
		System.out.println("The Array is:");
		for (int i = 0; i < iA.length; i++) {
			for (int j = 0; j < iA.length; j++) {
				System.out.print(iA[i][j] + "    ");
			}
			System.out.println();
		}

	}
}
