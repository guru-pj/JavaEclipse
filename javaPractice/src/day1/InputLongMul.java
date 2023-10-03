package day1;

import java.util.Scanner;

public class InputLongMul {
	public static void main(String[] args) {
		
		System.out.println("Enter the value :");
		Scanner s = new Scanner(System.in);
		
		long num = s.nextLong();
		
		long total = num*5l;
		
		System.out.println("The Total value is : "+ total);
		
		
	}
}
