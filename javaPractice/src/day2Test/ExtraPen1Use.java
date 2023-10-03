package day2Test;

import java.util.Scanner;

public class ExtraPen1Use {
	public static void main(String[] args) {

		ExtraPen1 p1 = new ExtraPen1();
		ExtraPen1 p2 = new ExtraPen1();

		Scanner name1 = new Scanner(System.in);
		System.out.println("Enter The Pen1 BrandName: ");
		p1.b = name1.next();

		Scanner colour1 = new Scanner(System.in);
		System.out.println("Enter The Pen1 Colour: ");
		p1.c = colour1.next();

		Scanner price1 = new Scanner(System.in);
		System.out.println("Enter The Pen1 Price: ");
		p1.p = price1.nextInt();

		Scanner name2 = new Scanner(System.in);
		System.out.println("Enter The Pen2 BrandName: ");
		p2.b = name2.next();

		Scanner colour2 = new Scanner(System.in);
		System.out.println("Enter The Pen2 Colour: ");
		p2.c = colour2.next();

		Scanner price2 = new Scanner(System.in);
		System.out.println("Enter The Pen2 Price: ");
		p2.p = price2.nextInt();

		System.out.println();
		System.out.println("Brand " + "Colour " + "Price");
		System.out.println(p1.b + " " + p1.c + "     " + p1.p);
		System.out.println(p2.b + " " + p2.c + "    " + p2.p);

	}
}
