package programs;

import java.util.Arrays;
import java.util.Scanner;

public class ca3bd2ab4 {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the input:" + "\n" + "Sample: a3b2c4....");
//		String s = sc.next();

		String s = "ab14bv17hj9";
		String[] sA1 = s.split("\\d+");
		System.out.println(Arrays.toString(sA1));
		String[] sA2 = s.split("\\D+");
		System.out.println(Arrays.toString(sA2));
	}
}
