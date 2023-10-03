package array2D;

import java.util.*;

public class Array2DScanner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		getting rows and columns first
		System.out.println("Enter the Number Of Rows: ");
		int r = s.nextInt();
		System.out.println("Enter the Number Of Columns: ");
		int c = s.nextInt();
//		declaring 2Darray
		int[][] iA2 = new int[r][c];
//		initialising the elements to the 2DArray using for loop
		System.out.println("Enter the Numbers in RowOrderFirst: ");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				iA2[i][j] = s.nextInt();
			}
		}
//		Printing the Array using for loop		
		System.out.println("The 2D Array you entered is: ");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(iA2[i][j] + " ");
			}
			System.out.println();
		}
//		printing 2DArray using Arrays class		
		System.out.println(Arrays.deepToString(iA2));
//	    printing the 2DArray using while loop		
		int i = 0, j = 0;
		while (i < r) {
			while (j < c) {
				System.out.print(iA2[i][j] + " ");
				j++;
			}
			i++;
			System.out.println();
			j = 0;
		}

	}
}
