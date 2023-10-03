package day3Test;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		System.out.println("Enter Your Name without Space: ");
		Scanner s1 = new Scanner(System.in);
		String s = s1.next();
		System.out.println("Name: " + s.toLowerCase());
		System.out.println("Length: " + s.length());

	}
}
