package day2Test;

import java.util.Scanner;

public class ExtraTablesUse {
	public static void main(String[] args) {

		ExtraTables t1 = new ExtraTables();
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the table number: ");
		int b = s1.nextInt();

		t1.printTables(b);

	}

}
