package day1Test;

import java.util.Scanner;

public class Q26 {

	public static void main(String[] args) {

		System.out.println("Enter your height in meters :");
		Scanner s2 = new Scanner(System.in);
		float height = s2.nextFloat();
		System.out.println("Enter your weight in kg :");
		Scanner s3 = new Scanner(System.in);
		float weight = s3.nextFloat();

		float bmi = weight / (height * height);

		System.out.println("BMI value of " + "Laav is :" + bmi);

	}

}
