package scalarEntranceTest;

import java.util.Scanner;

public class SmallestNumberDIvByArray {
	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = scan.nextInt();
		int res =0;
		int num=0;
		for (int j = 1; j < n; j++) {
			for (int i = 0; i < a.length; i++) {
				if (j % a[i] == 0) {
					res++;
					//break;
				}
				if(res==9) {
					num=j;
				//	break;
				}
				res=0;
			}
		}
		System.out.println(num);
	}
}