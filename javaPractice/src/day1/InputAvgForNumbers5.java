package day1;

import java.util.Scanner;

public class InputAvgForNumbers5{
	public static void main(String[] args) {
	
	System.out.println("Enter The Values :");
	
	Scanner S1 = new Scanner(System.in);
	int n1 = S1.nextInt();
	
	Scanner S2 = new Scanner(System.in);
	int n2 = S2.nextInt();
	
	Scanner S3 = new Scanner(System.in);
	int n3 = S3.nextInt();
	
	Scanner S4 = new Scanner(System.in);
	int n4 = S4.nextInt();
	
	Scanner S5 = new Scanner(System.in);
	int n5 = S5.nextInt();
	
	int total = (n1+n2+n3+n4+n5)/5;
	
	System.out.println("The Average of Given 5 Numbers is : " + total);
}
}
