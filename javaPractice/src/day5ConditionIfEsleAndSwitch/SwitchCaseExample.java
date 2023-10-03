
package day5ConditionIfEsleAndSwitch;

import java.util.Scanner;

public class SwitchCaseExample {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the day of the week in number: ");
		int day = s.nextInt();

		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Invalid Day Number of the week");

		}

		System.out.println("Enter the Day of the week: ");
		String s1 = s.next().toLowerCase();

		switch (s1) {
		case "monday":
			System.out.println("1");
			break;
		case "tuesday":
			System.out.println("2");
			break;
		case "Wednesday":
			System.out.println("3");
			break;
		case "thursday":
			System.out.println("4");
			break;
		case "friday":
			System.out.println("5");
			break;
		case "saturday":
			System.out.println("6");
			break;
		case "sunday":
			System.out.println("7");
			break;
		default:
			System.out.println("Invalid Day of the week");

		}

	}

}
